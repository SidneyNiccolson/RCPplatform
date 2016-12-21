package JETTemplates;

import maia.physicalStructure.*;
import maia.physicalStructure.PhysicalComponent;
import maia.collectiveStructure.*;
import maia.ontologicalStructure.*;
import maia.constitutionalStructure.*;
import maia.constitutionalStructure.Role;
import maia.operationalStructure.*;
import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;

public class MainSimulation {
	protected static String nl;

	public static synchronized MainSimulation create(String lineSeparator) {
		nl = lineSeparator;
		MainSimulation result = new MainSimulation();
		nl = null;
		return result;
	}

	public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
	protected final String TEXT_1 = "package operational;" + NL + "import java.util.ArrayList;" + NL
			+ "import java.util.Random;" + NL + "import collectiveStructure.*;" + NL + "import operationalStructure.*;"
			+ NL + "import constitutionalStructure.*;" + NL + "import physicalStructure.*;" + NL
			+ "import java.util.Collections;" + NL + "import java.text.DateFormat;" + NL
			+ "import java.text.SimpleDateFormat;" + NL + "import java.util.Date;" + NL + "import java.util.Arrays;"
			+ NL + "import evaluativeStructure.CSVUtils;" + NL + "import java.io.File;" + NL
			+ "import java.io.FileWriter;" + NL + "import java.io.IOException;" + NL + "import java.util.HashMap;" + NL
			+ "import java.util.List;" + NL + "import java.util.Map;" + NL + "import java.util.Iterator;" + NL
			+ "import org.jfree.chart.ChartFactory;" + NL + "import org.jfree.chart.ChartUtilities;" + NL
			+ "import org.jfree.chart.JFreeChart;" + NL + "import org.jfree.data.xy.XYSeries;" + NL
			+ "import org.jfree.data.xy.XYSeriesCollection;" + NL + "public class SimulationRun {" + NL;
	protected final String TEXT_2 = NL + NL + NL + NL + NL + "public static void initialize(){" + NL
			+ "//number of agents etc.." + NL;
	protected final String TEXT_3 = NL + "}" + NL + "" + NL
			+ "public static void main(String args[]) throws IOException {" + NL
			+ "initialize();\nFileWriter writer = null;\n" + "\nint numberOfTicks = Ticks.getTick();\n"
			+ "DateFormat dateFormatStart = new SimpleDateFormat(\"yyyy/MM/dd HH:mm:ss\");\n"
			+ "Date dateStart = new Date();\n"
			+ "System.out.println(\"Simulation started at: \"+ dateFormatStart.format(dateStart));" + NL + "" + NL
			+ "try {\nwriter = createCSV();\n} catch (IOException e) {\ne.printStackTrace();\n}" + NL
			+ "for (int tick = 0 ; tick < ";
	protected final String TEXT_4 = "; tick ++){" + NL + "\t" + NL + "\t";
	protected final String TEXT_5 = NL + "\t" + NL + "" + NL + "\t\t" + NL + "\t\tanalyseData(writer);}"
			+ "DateFormat dateFormatEnd = new SimpleDateFormat(\"yyyy/MM/dd HH:mm:ss\");\n"
			+ "Date dateEnd = new Date();\n" + NL + "writer.flush();\nwriter.close();\ngeneratePlots(outerMapViz);\n"
			+ "System.out.println(\"Simulation ended at: \"+ dateFormatEnd.format(dateEnd));" + NL + "\t\t}" + NL + ""
			+ NL + "" + NL + "public static void analyseData(FileWriter writer) throws IOException {" + NL
			+ "System.out.println(\"Current tick: \"+Ticks.getTick());";
	protected final String TEXT_6 = NL;

	public String generate(Object argument) {
		final StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append(TEXT_1);

		// cast argument Object into hashmap
		Map<String, Map<String, Object>> arr = (Map<String, Map<String, Object>>) argument;
		// retrieve the hashmaps for agent and plans
		Map<String, Object> agentHashmap = arr.get("myAgents");
		Map<String, Object> plansHashmap = arr.get("myPlans");

		Map<String, Object> ticks = arr.get("ticks");
		Map<String, Object> agentData = arr.get("agentData");

		Map<String, Object> attData = arr.get("attr");
		Map<String, Object> seqData = arr.get("sequencePlan");
		Map<String, Object> attPCData = arr.get("attrPC");
		Map<String, Object> seedDataRaw = arr.get("seedData");
		Map<String, Object> phyDataRaw = arr.get("phyData");
		Map<String, Object> vizDataRaw = arr.get("vizData");
		LinkedHashMap<String, Object> vizDataOrder = new LinkedHashMap<>(vizDataRaw);
		// reconstruct original object
		Map<String, Integer> sequenceMap = new LinkedHashMap<String, Integer>();
		Iterator itSeq = seqData.entrySet().iterator();
		while (itSeq.hasNext()) {
			Map.Entry pair = (Map.Entry) itSeq.next();
			Integer sequence = (Integer) pair.getValue();
			String key = (String) (pair.getKey());
			sequenceMap.put(key, sequence);
			// it.remove(); // avoids a ConcurrentModificationException
		}

		String numberOfTicks = "";
		int numberOfAgents = 0;
		int numberOfPhys = 0;
		int seed = 0;
		boolean seedSet = false;
		// retrieve number of ticks
		try {
			Object value = ticks.get("numberOfTicks");
			String number = value.toString();
			numberOfTicks = (number);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Could not find messageDialog inputs: numberOfTicks");
		}
		Iterator itSeed = seedDataRaw.entrySet().iterator();
		while (itSeed.hasNext()) {
			Map.Entry pair = (Map.Entry) itSeed.next();
			seedSet = (Boolean) pair.getValue();
			String key = (String) (pair.getKey());
			seed = Integer.parseInt(key);
			// it.remove(); // avoids a ConcurrentModificationException
		}
		// start parsing through the agent hashmap
		Iterator it = agentHashmap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			stringBuffer.append("//create empty list of agents and roles\n");
			maia.collectiveStructure.Agent myAgent = (maia.collectiveStructure.Agent) pair.getValue();
			stringBuffer.append("public static ArrayList<" + Util.Capitalize(myAgent.getName()) + "> "
					+ myAgent.getName() + " = new ArrayList<" + Util.Capitalize(myAgent.getName()) + ">();\n");
			for (Role role : myAgent.getPossibleRole()) {

				stringBuffer.append("\tpublic static ArrayList<" + Util.Capitalize(role.getName()) + "> "
						+ role.getName() + " = new ArrayList<" + Util.Capitalize(role.getName()) + ">();\n");

			}
			// it.remove(); // avoids a ConcurrentModificationException
		}
		// create an empty arraylist of list containing this skeleton
		// [[Double,String,String],[]]
		stringBuffer.append("static Map<String, List<String>> outerMapViz = new HashMap<String,  List<String>>();");
		Integer count = 0;
		Iterator itVizPC = vizDataOrder.entrySet().iterator();
		// determine what type of visualizations are needed
		while (itVizPC.hasNext()) {
			Map.Entry pairVizPC = (Map.Entry) itVizPC.next();
			String value = (String) pairVizPC.getValue();
			String key = (String) (pairVizPC.getKey());
			// start unpacking these strings, as there are separated by pipeline
			// symbol |
			// split x selections data
			String[] parts = key.split("\\|");
			String[] partsV = value.split("\\|");
			String xAttr = parts[1];
			String possibleAgentX = parts[2];
			String possibleRoleX = parts[3];
			String possiblePCX = parts[4];
			String yAttr = partsV[1];
			String possibleAgentY = partsV[2];
			String possibleRoleY = partsV[3];
			String possiblePCY = partsV[4];
			String countString = String.valueOf(count);
			// only do something if it is a PC OPEN
			if (possibleRoleX.equals("notRole") && possibleRoleY.equals("notRole") && possibleAgentX.equals("(OPEN)#")
					|| possibleAgentY.equals("(OPEN)#")) {
				// its either ticks vs attr or attr vs ticks or attr vs attr)
				// below ticks vs Attr
				if (xAttr.equals("ticks") && !yAttr.equals("ticks")) {
					stringBuffer.append("\nstatic List<String> dataViz" + count + " = new ArrayList<String>();\n");
					// below attr vs ticks
				} else if (yAttr.equals("ticks") && !xAttr.equals("ticks")) {
					stringBuffer.append("\nstatic List<String> dataViz" + count + " = new ArrayList<String>();\n");
				}
				// attr vs attr
				else if (!xAttr.equals("ticks") && !yAttr.equals("ticks")) {
					stringBuffer.append("\nstatic List<String> dataViz" + count + " = new ArrayList<String>();\n");
				}
			}
			// determine if it is a general agent with attributes
			else if (possibleRoleX.equals("notRole") && possibleRoleY.equals("notRole") && possiblePCX.equals("notPC")
					&& possiblePCY.equals("notPC")) {
				// its either ticks vs attr or attr vs ticks or attr vs attr)
				// below ticks vs Attr
				if (xAttr.equals("ticks") && !yAttr.equals("ticks")) {
					stringBuffer.append("\nstatic List<String> dataViz" + count + " = new ArrayList<String>();\n");
					// below attr vs ticks
				} else if (yAttr.equals("ticks") && !xAttr.equals("ticks")) {
					stringBuffer.append("\nstatic List<String> dataViz" + count + " = new ArrayList<String>();\n");
				}
				// attr vs attr
				else if (!xAttr.equals("ticks") && !yAttr.equals("ticks")) {
					stringBuffer.append("\nstatic List<String> dataViz" + count + " = new ArrayList<String>();\n");
				}
			}
			// determine if it is a agent with physical components
			else if (possibleRoleX.equals("notRole") && possibleRoleY.equals("notRole")) {
				if (!possiblePCX.equals("notPC") || !possiblePCY.equals("notPC")) {
					// its either ticks vs attr or attr vs ticks or attr vs
					// attr)
					// below ticks vs Attr
					if (xAttr.equals("ticks") && !yAttr.equals("ticks")) {
						stringBuffer.append("\nstatic List<String> dataViz" + count + " = new ArrayList<String>();\n");
						// below attr vs ticks
					} else if (yAttr.equals("ticks") && !xAttr.equals("ticks")) {
						stringBuffer.append("\nstatic List<String> dataViz" + count + " = new ArrayList<String>();\n");
					}
					// attr vs attr
					else if (!xAttr.equals("ticks") && !yAttr.equals("ticks")) {
						stringBuffer.append("\nstatic List<String> dataViz" + count + " = new ArrayList<String>();\n");
					}
				}
			}
			// determine if it is a role
			else if (!possibleAgentX.equals("notAgent") || !possibleAgentY.equals("notAgent")) {
				if (!possibleRoleX.equals("notRole") || !possibleRoleY.equals("notRole") && !possiblePCX.equals("notPC")
						|| !possiblePCY.equals("notPC")) {
					// its either ticks vs attr or attr vs ticks or attr vs
					// attr)
					// below ticks vs Attr
					if (xAttr.equals("ticks") && !yAttr.equals("ticks")) {
						stringBuffer.append("\nstatic List<String> dataViz" + count + " = new ArrayList<String>();\n");
						// below attr vs ticks
					} else if (yAttr.equals("ticks") && !xAttr.equals("ticks")) {
						stringBuffer.append("\nstatic List<String> dataViz" + count + " = new ArrayList<String>();\n");
					}
					// attr vs attr
					else if (!xAttr.equals("ticks") && !yAttr.equals("ticks")) {
						stringBuffer.append("\nstatic List<String> dataViz" + count + " = new ArrayList<String>();\n");
					}
				}
			}
			count += 1;
		}

		stringBuffer.append(TEXT_2);

		stringBuffer.append("\n");
		// start using PhyCom OPEN because they might have random parameters as
		// well
		for (String key : attPCData.keySet()) {
			List<Double> value = (List<Double>) attPCData.get(key);

			String[] parts = key.split("\\|");
			// fetch data elements
			String agName = parts[0];
			String roleName = parts[1];
			String pcName = parts[2];
			String attribute = parts[3];
			Double min = value.get(0);
			Double max = value.get(1);
			String phyDef = "(OPEN)#";
			System.out.println("testL " + seedSet + seed);
			if (agName.toLowerCase().contains(phyDef.toLowerCase())) {
				// it is a phycom of open definition
				stringBuffer.append("\t\tRandom random_" + attribute + "_obj" + " = new Random();\n");
				if (seedSet) {
					stringBuffer.append("random_" + attribute + "_obj" + ".setSeed(" + seed + ");\n");
				}
				String random = "\t\trandom_" + attribute + "_number";
				String randomPrim = "\t\trandom_" + attribute + "_obj";
				stringBuffer.append("\t\tdouble " + random + " = " + min + " +(" + max + "  - " + min + ") * "
						+ randomPrim + ".nextDouble();\n");
				stringBuffer.append("\t\t" + pcName + "." + attribute + " = (" + random + ");\n");

			}
		}

		stringBuffer.append("Ticks.setTick(" + numberOfTicks + ");");

		// retrieve the hashmaps for agent and plans
		// start parsing through the hashmap again
		Iterator it2 = agentHashmap.entrySet().iterator();

		while (it2.hasNext()) {
			Map.Entry pair = (Map.Entry) it2.next();
			maia.collectiveStructure.Agent myAgent = (maia.collectiveStructure.Agent) pair.getValue();
			// loop over agent data that is retrieved from messageDialog

			try {
				Iterator it7 = agentData.entrySet().iterator();
				while (it7.hasNext()) {
					Map.Entry pairs = (Map.Entry) it7.next();
					String agentsOfDiag = pairs.getKey().toString();
					// if there is a match with the specific agent instance get
					// that value and set as numberOfAgents
					if (agentsOfDiag.equals(myAgent.getName())) {
						numberOfAgents = (int) pairs.getValue();
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Could not find messageDialog inputs: number of agents");
			}
			stringBuffer.append("//Initialize each agent (set id, set configured variability per agent)\n");
			stringBuffer.append("\nint numberOf" + Util.Capitalize(myAgent.getName()) + "= " + numberOfAgents + ";\n");

			stringBuffer.append("\tfor (int i = 0; i < numberOf" + Util.Capitalize(myAgent.getName()) + "; i++) {\n");
			// create objects & //set the IDs
			stringBuffer.append(Util.Capitalize(myAgent.getName()) + " agent_" + myAgent.getName() + " = new "
					+ Util.Capitalize(myAgent.getName()) + "();\n");
			stringBuffer
					.append("\t\tagent_" + myAgent.getName() + ".setID(agent_" + myAgent.getName() + ".hashCode());\n");
			for (Role role : myAgent.getPossibleRole()) {
				stringBuffer.append(Util.Capitalize(role.getName()) + " role_" + role.getName() + " = new "
						+ Util.Capitalize(role.getName()) + "();\n");
				stringBuffer
						.append("\t\trole_" + role.getName() + ".setID(agent_" + myAgent.getName() + ".hashCode());\n");
			}

			for (String key : attData.keySet()) {
				List<Double> value = (List<Double>) attData.get(key);
				System.out.println("key = " + key);
				System.out.println("value = " + value);
				String[] parts = key.split("\\|");
				String agName = parts[0];
				String action = parts[1];
				Double min = value.get(0);
				Double max = value.get(1);

				// built up the random function if there is a match
				if (agName.equals(myAgent.getName())) {
					stringBuffer.append("\t\tRandom random_" + action + "_obj" + " = new Random();\n");
					if (seedSet) {
						stringBuffer.append("random_" + action + "_obj" + ".setSeed(" + seed + ");\n");
					}
					String random = "\t\trandom_" + action + "_number";
					String randomPrim = "\t\trandom_" + action + "_obj";
					stringBuffer.append("\t\tdouble " + random + " = " + min + " +(" + max + "  - " + min + ") * "
							+ randomPrim + ".nextDouble();\n");
					stringBuffer.append("\t\tagent_" + agName + "." + action + " = (" + random + ");\n");
				}
			}
			for (String key : attPCData.keySet()) {
				List<Double> value = (List<Double>) attPCData.get(key);
				System.out.println("key = " + key);
				System.out.println("value = " + value);
				String[] parts = key.split("\\|");
				// fetch data elements
				String agName = parts[0];
				String roleName = parts[1];
				String pcName = parts[2];
				String attribute = parts[3];
				Double min = value.get(0);
				Double max = value.get(1);

				// built up the random function if there is a match
				if (agName.equals(myAgent.getName()) && roleName.equals("notRole")) {
					stringBuffer.append("\t\tRandom random_" + attribute + "_obj" + " = new Random();\n");
					if (seedSet) {
						stringBuffer.append("random_" + attribute + "_obj" + ".setSeed(" + seed + ");\n");
					}

					String random = "\t\trandom_" + attribute + "_number";
					String randomPrim = "\t\trandom_" + attribute + "_obj";
					stringBuffer.append("\t\tdouble " + random + " = " + min + " +(" + max + "  - " + min + ") * "
							+ randomPrim + ".nextDouble();\n");
					stringBuffer
							.append("\t\tagent_" + agName + "." + pcName + "." + attribute + " = (" + random + ");\n");
				}
				// set role attributes
				if (agName.equals(myAgent.getName()) && !roleName.equals("notRole")) {
					stringBuffer.append("\t\tRandom random_" + attribute + "_obj_" + roleName + " = new Random();\n");
					if (seedSet) {
						stringBuffer.append("random_" + attribute + "_obj_" + roleName + ".setSeed(" + seed + ");\n");
					}
					String random = "\t\trandom_" + attribute + "_number_" + roleName;
					String randomPrim = "\t\trandom_" + attribute + "_obj_" + roleName;
					stringBuffer.append("\t\tdouble " + random + " = " + min + " +(" + max + "  - " + min + ") * "
							+ randomPrim + ".nextDouble();\n");
					stringBuffer
							.append("\t\trole_" + roleName + "." + pcName + "." + attribute + " = (" + random + ");\n");
				}

			}
			stringBuffer.append("\t\t" + myAgent.getName() + ".add(agent_" + (myAgent.getName()) + ");\n");
			for (Role role : myAgent.getPossibleRole()) {

				stringBuffer.append("\t\t" + role.getName() + ".add(role_" + (role.getName()) + ");\n");

			}
			stringBuffer.append("}");
		}

		stringBuffer.append(TEXT_3);

		numberOfTicks = "numberOfTicks";
		stringBuffer.append(numberOfTicks);
		stringBuffer.append(TEXT_4);

		Set<String> hs = new HashSet<>();
		Set<String> agT = new HashSet<>();

		stringBuffer.append("Ticks.setTick(tick);\n");
		// start parsing through the agent hashmap
		Iterator it23 = agentHashmap.entrySet().iterator();
		while (it23.hasNext()) {
			Map.Entry pair = (Map.Entry) it23.next();
			// create shuffle function to shuffle the agents each tick.
			maia.collectiveStructure.Agent myAgent = (maia.collectiveStructure.Agent) pair.getValue();
			stringBuffer.append("Collections.shuffle(" + myAgent.getName() + ");\n");
			for (Role role : myAgent.getPossibleRole()) {

				stringBuffer.append("Collections.shuffle(" + role.getName() + ");\n");

			}
			// it.remove(); // avoids a ConcurrentModificationException
		}
		// create hashmap of entityActions
		Map<String, maia.operationalStructure.EntityAction> myAvailableActions = new HashMap<String, maia.operationalStructure.EntityAction>();
		Iterator it4 = plansHashmap.entrySet().iterator();
		while (it4.hasNext()) {
			Map.Entry pair2 = (Map.Entry) it4.next();
			maia.operationalStructure.Plan plan = (maia.operationalStructure.Plan) pair2.getValue();
			// try to cast to EntityAction
			if (plan instanceof maia.operationalStructure.EntityAction) {
				maia.operationalStructure.EntityAction entityAction = (maia.operationalStructure.EntityAction) plan;
				if (entityAction != null) {
					myAvailableActions.put(entityAction.getName(), entityAction);
				}
			}
		}
		// order the sequence hashmap before generating any execution code
		sequenceMap = Util.sortByValue(sequenceMap);

		for (Entry<String, Integer> entry : sequenceMap.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			// now work with key and value...
			maia.operationalStructure.EntityAction entityActionObj_Ordered = myAvailableActions.get(key);

			String agent_role_pc = Util.Capitalize(entityActionObj_Ordered.getPerfomer().getName());
			String actionName = Util.Capitalize(entityActionObj_Ordered.getName());
			Performer per = entityActionObj_Ordered.getPerfomer();
			if (per instanceof maia.physicalStructure.PhysicalComponent) {
				maia.physicalStructure.PhysicalComponent phycom = (maia.physicalStructure.PhysicalComponent) per;
				String type = phycom.getType().toString();

				if (type.equals("open")) {
					stringBuffer.append("\t" + actionName + ".execute();\n");
				}
			} else if (per instanceof maia.constitutionalStructure.Role) {
				// I need the agent data again to check what possible roles
				// they have and if Performer matches that role
				Iterator itAgen = agentHashmap.entrySet().iterator();
				Map<String, String> allRoles = new HashMap<String, String>();
				while (itAgen.hasNext()) {
					Map.Entry pair = (Map.Entry) itAgen.next();
					maia.collectiveStructure.Agent myAgent = (maia.collectiveStructure.Agent) pair.getValue();
					for (maia.constitutionalStructure.Role rl : myAgent.getPossibleRole()) {
						allRoles.put(rl.getName(), myAgent.getName());
					}
				}

				String keys = allRoles.get(agent_role_pc);

				Iterator agRole = allRoles.entrySet().iterator();
				while (agRole.hasNext()) {
					Map.Entry pair = (Map.Entry) agRole.next();
					
					String theRole = (String) pair.getKey();
					if (per.getName().equals(theRole)){ 
					String theAgent = (String) pair.getValue();
					stringBuffer.append("\tfor(" + Util.Capitalize(theRole) + " a_" + theRole + " : "
							+ theRole + "){\n\t\t" + "\t\tfor("
							+ Util.Capitalize(theAgent) + " a_" + theAgent + " : " + theAgent + "){\n\t\t" + actionName
							+ ".execute(a_" + theRole + ", a_" + theAgent + ");}\n\n}");
				}}
			} else {
				// if it is a fenced physical component (not really, if it
				// is not a physical component basically)
				stringBuffer.append("\tfor(" + agent_role_pc + " a_" + agent_role_pc + " : "
						+ entityActionObj_Ordered.getPerfomer().getName() + "){\n\t\t" + actionName + ".execute(a_"
						+ agent_role_pc + ");}\n");
			}

		}

		stringBuffer.append(TEXT_5);
		// this is inside the analyseData method
		stringBuffer.append("int myTicks = Ticks.getTick();\nString ticks = Integer.toString(myTicks);");
		stringBuffer.append("//loop over list of agents and roles\n");
		// for each agent create a for loop
		Iterator itAg2 = agentHashmap.entrySet().iterator();
		while (itAg2.hasNext()) {
			Map.Entry pair = (Map.Entry) itAg2.next();
			maia.collectiveStructure.Agent myAgent = (maia.collectiveStructure.Agent) pair.getValue();
			stringBuffer.append("for (" + Util.Capitalize(myAgent.getName()) + " a_" + myAgent.getName() + " : "
					+ myAgent.getName() + "){");
			// for each property
			for (Property prop : myAgent.getProperty()) {
				stringBuffer.append("\n\t\t\t\tCSVUtils.writeLine(writer, Arrays.asList(String.valueOf( a_"
						+ myAgent.getName() + ".getID())+\"|\"+\"" + prop.getLabel() + "\", \""
						+ Util.Capitalize(myAgent.getName()) + "\", ticks, String.valueOf(a_" + myAgent.getName()
						+ ".get" + Util.Capitalize(prop.getLabel()) + "())));\r\n");
			}
			for (PhysicalComponent phy : myAgent.getPhysicalComponent()) {
				for (Property prop : phy.getProperty()) {
					stringBuffer.append("\n\t\t\t\tCSVUtils.writeLine(writer, Arrays.asList(String.valueOf( a_"
							+ myAgent.getName() + ".getID())+\"|\"+\"" + prop.getLabel() + "\", \""
							+ Util.Capitalize(myAgent.getName()) + "\", ticks, String.valueOf(a_" + myAgent.getName()
							+ "." + Util.Capitalize(phy.getName()) + ".get" + Util.Capitalize(prop.getLabel())
							+ "())));\r\n");
				}
			}
			stringBuffer.append("}\n");
			for (Role role : myAgent.getPossibleRole()) {
				stringBuffer.append("for (" + Util.Capitalize(role.getName()) + " a_" + role.getName() + " : "
						+ role.getName() + "){");

				for (PhysicalComponent phy : role.getPhysicalComponent()) {
					for (Property prop : phy.getProperty()) {
						stringBuffer.append("\n\t\t\t\tCSVUtils.writeLine(writer, Arrays.asList(String.valueOf( a_"
								+ role.getName() + ".getID())+\"|\"+\"" + prop.getLabel() + "\", \""
								+ Util.Capitalize(role.getName()) + "\", ticks, String.valueOf(a_" + role.getName()
								+ "." + Util.Capitalize(phy.getName()) + ".get" + Util.Capitalize(prop.getLabel())
								+ "())));\r\n");
					}
				}
				stringBuffer.append("}\n");
			}
			// it.remove(); // avoids a ConcurrentModificationException
		}

		// Map<Integer, List<String>> outerMap = new HashMap<Integer,
		// List<String>>();
		// create random to use
		stringBuffer.append("Random randomizer = new Random();\r\n");
		if (seedSet) {
			stringBuffer.append("randomizer.setSeed(" + seed + ");\n");
			// create random integers for all agents or roles
			Iterator itAg3 = agentHashmap.entrySet().iterator();
			while (itAg3.hasNext()) {
				Map.Entry pair = (Map.Entry) itAg3.next();
				maia.collectiveStructure.Agent myAgent = (maia.collectiveStructure.Agent) pair.getValue();
				stringBuffer.append("int " + myAgent.getName() + "_rand" + " = randomizer.nextInt(" + myAgent.getName()
						+ ".size());\n");
				for (maia.constitutionalStructure.Role role : myAgent.getPossibleRole()){
					stringBuffer.append("int " + role.getName() + "_rand" + " = randomizer.nextInt(" + role.getName()
					+ ".size());\n");
				}
			}
		}
		// start parsing through the agent hashmap
		Iterator itPhy = phyDataRaw.entrySet().iterator();
		while (itPhy.hasNext()) {
			Map.Entry pair = (Map.Entry) itPhy.next();
			stringBuffer.append("//create empty list of agents and roles\n");
			maia.physicalStructure.PhysicalComponent phycom = (maia.physicalStructure.PhysicalComponent) pair
					.getValue();
			if (phycom.getType().getName().equals("open")) {
				for (Property prop : phycom.getProperty()) {
					stringBuffer.append(
							"\n\t\t\t\tCSVUtils.writeLine(writer, Arrays.asList(\"OPEN\"+\"|\"+\"" + prop.getLabel()
									+ "\", \"" + Util.Capitalize(phycom.getName()) + "\", ticks, String.valueOf("
									+ phycom.getName() + "." + Util.Capitalize(prop.getLabel()) + ")));\r\n");
					// we also want to construct visualisation so we also need
					// to parse through that
					// to see if there is data to be gathered here
				}
				count = 0;
				Iterator itVizPC2 = vizDataOrder.entrySet().iterator();
				while (itVizPC2.hasNext()) {
					Map.Entry pairVizPC = (Map.Entry) itVizPC2.next();
					String value = (String) pairVizPC.getValue();
					String key = (String) (pairVizPC.getKey());

					// start unpacking these strings, as there are separated by
					// pipeline symbol |
					// split x selections data
					String[] parts = key.split("\\|");
					String[] partsV = value.split("\\|");
					String xAttr = parts[1];
					String possibleAgentX = parts[2];
					String possibleRoleX = parts[3];
					String possiblePCX = parts[4];
					String yAttr = partsV[1];
					String possibleAgentY = partsV[2];
					String possibleRoleY = partsV[3];
					String possiblePCY = partsV[4];
					String countString = String.valueOf(count);
					// only do something if it is a PC OPEN
					if (possibleRoleX.equals("notRole") && possibleRoleY.equals("notRole")
							&& possibleAgentX.equals("(OPEN)#") || possibleAgentY.equals("(OPEN)#")) {
						// its either ticks vs attr or attr vs ticks or attr vs
						// attr)
						// below ticks vs Attr
						if (xAttr.equals("ticks") && !yAttr.equals("ticks")) {
							stringBuffer.append("\ndataViz" + count + ".add(" + phycom.getName() + "." + yAttr + "+\"|"
									+ xAttr+"("+phycom.getName()+")" + " VS " + yAttr + "|\"+" + xAttr + ");\n");
							// data.add(phycom.getName()+"."+yAttr+
							// "|numberOf"+yAttr+"|"+xAttr);
							// capture data
							stringBuffer.append("\nouterMapViz.put(\"" + countString + "_" + yAttr + "VS" + xAttr + "_"
									+ "\", dataViz" + count + ");");
							// below attr vs ticks
						} else if (yAttr.equals("ticks") && !xAttr.equals("ticks")) {
							stringBuffer.append("\ndataViz" + count + ".add(" + yAttr + "+\"|" + xAttr+"("+phycom.getName()+")" + " VS " + yAttr
									+ "|\"+" + phycom.getName() + "." + xAttr + ");\n");
							stringBuffer.append("\nouterMapViz.put(\"" + countString + "_" + yAttr + "VS" + xAttr + "_"
									+ "\", dataViz" + count + ");");
						}
						// attr vs attr
						else if (!xAttr.equals("ticks") && !yAttr.equals("ticks")) {
							stringBuffer.append("\ndataViz" + count + ".add(" + phycom.getName() + "." + yAttr + "+\"|"
									+ xAttr+"("+phycom.getName()+")" + " VS " + yAttr + "|\"+" + phycom.getName() + "." + xAttr + ");\n");
							stringBuffer.append("\nouterMapViz.put(\"" + countString + "_" + yAttr + "VS" + xAttr + "_"
									+ "\", dataViz" + count + ");");
						}

					}
					// determine if it is a general agent with attributes
					else if (possibleRoleX.equals("notRole") && possibleRoleY.equals("notRole")
							&& possiblePCX.equals("notPC") && possiblePCY.equals("notPC")) {
						// its either ticks vs attr or attr vs ticks or attr vs
						// attr)
						// pick agent from list at random

						// check what to generate based on x-axis and y-axis
						// selection
						if (!possibleAgentX.equals("notAgent") && possibleAgentY.equals("notAgent")) {
							// is x-axis VS Y TICK
							if (seedSet) {
								stringBuffer.append(Util.Capitalize(possibleAgentX) + " a_" + possibleAgentX + count
										+ " = " + possibleAgentX + ".get(" + possibleAgentX + "_rand);\n");

							} else {
								stringBuffer.append(Util.Capitalize(possibleAgentX) + " a_" + possibleAgentX + count
										+ " = " + possibleAgentX + ".get(randomizer" + ".nextInt(" + possibleAgentX
										+ ".size()));\n");
							}
							//anyways start using this agent (random or not selected)
							stringBuffer.append("\ndataViz" + count + ".add(" + yAttr + "+\"|"
									+ xAttr +"("+possibleAgentX+")"+ "(\"+a_"+possibleAgentX +count+".getID()+\") VS " + yAttr +" |\"+a_" + possibleAgentX+count+".get"+xAttr + "());\n");
							
							stringBuffer.append("\nouterMapViz.put(\"" + countString + "_" + yAttr + "VS" + xAttr + "_"
									+ "\", dataViz" + count + ");");
						} else if (!possibleAgentY.equals("notAgent") && possibleAgentX.equals("notAgent")) {
							// is X TICK vs Y-axis
							if (seedSet) {
								stringBuffer.append(Util.Capitalize(possibleAgentY) + " a_" + possibleAgentY + count
										+ " = " + possibleAgentY + ".get(" + possibleAgentY + "_rand);\n");

							} else {
								stringBuffer.append(Util.Capitalize(possibleAgentY) + " a_" + possibleAgentY + count
										+ " = " + possibleAgentY + ".get(randomizer" + ".nextInt(" + possibleAgentY
										+ ".size()));\n");
							}
							//anyways start using this agent (random or not selected)
							stringBuffer.append("\ndataViz" + count + ".add(a_" + possibleAgentY+count+".get"+yAttr + "()+ "+"\"|"
									+ xAttr +"("+possibleAgentY+")"+ "(\"+a_"+possibleAgentY +count+".getID()+\") VS " + yAttr +" |\"+"+xAttr+");\n");
							
							stringBuffer.append("\nouterMapViz.put(\"" + countString + "_" + yAttr + "VS" + xAttr + "_"
									+ "\", dataViz" + count + ");");
						} else {
							// ATTR VS ATTR
							if (seedSet) {
								stringBuffer.append(Util.Capitalize(possibleAgentX) + " a_" + possibleAgentX + count
										+ " = " + possibleAgentX + ".get(" + possibleAgentX + "_rand);\n");

							} else {
								stringBuffer.append(Util.Capitalize(possibleAgentX) + " a_" + possibleAgentX + count
										+ " = " + possibleAgentX + ".get(randomizer" + ".nextInt(" + possibleAgentX
										+ ".size()));\n");
							}
							//anyways start using this agent (random or not selected)
							stringBuffer.append("\ndataViz" + count + ".add(a_" + possibleAgentY+count+".get"+yAttr + "()+ "+"\"|"
									+ xAttr +"("+possibleAgentY+")"+ "(\"+a_"+possibleAgentY +count+".getID()+\") VS " + yAttr +" |\"+a_"+possibleAgentX+count+".get"+xAttr + "());\n");
							stringBuffer.append("\nouterMapViz.put(\"" + countString + "_" + yAttr + "VS" + xAttr + "_"
									+ "\", dataViz" + count + ");");
						}
						
					}
					// determine if it is a agent with physical components
					else if (possibleRoleX.equals("notRole") && possibleRoleY.equals("notRole")) {
						if (!possiblePCX.equals("notPC") || !possiblePCY.equals("notPC")) {
							// check what to generate based on x-axis and y-axis
							// selection
							if (!possibleAgentX.equals("notAgent") && possibleAgentY.equals("notAgent")) {
								// is x-axis VS Y TICK
								if (seedSet) {
									stringBuffer.append(Util.Capitalize(possibleAgentX) + " a_" + possibleAgentX + count
											+ " = " + possibleAgentX + ".get(" + possibleAgentX + "_rand);\n");

								} else {
									stringBuffer.append(Util.Capitalize(possibleAgentX) + " a_" + possibleAgentX + count
											+ " = " + possibleAgentX + ".get(randomizer" + ".nextInt(" + possibleAgentX
											+ ".size()));\n");
								}
								//anyways start using this agent (random or not selected)
								stringBuffer.append("\ndataViz" + count + ".add(" + yAttr + "+\"|"
										+ xAttr +"("+possibleAgentX+")"+ "(\"+a_"+possibleAgentX +count+".getID()+\") VS " + yAttr +" |\"+a_" + possibleAgentX+count+"."+possiblePCX+ ".get"+xAttr + "());\n");
								
								stringBuffer.append("\nouterMapViz.put(\"" + countString + "_" + yAttr + "VS" + xAttr + "_"
										+ "\", dataViz" + count + ");");
							} else if (!possibleAgentY.equals("notAgent") && possibleAgentX.equals("notAgent")) {
								// is X TICK vs Y-axis
								if (seedSet) {
									stringBuffer.append(Util.Capitalize(possibleAgentY) + " a_" + possibleAgentY + count
											+ " = " + possibleAgentY + ".get(" + possibleAgentY + "_rand);\n");

								} else {
									stringBuffer.append(Util.Capitalize(possibleAgentY) + " a_" + possibleAgentY + count
											+ " = " + possibleAgentY + ".get(randomizer" + ".nextInt(" + possibleAgentY
											+ ".size()));\n");
								}
								//anyways start using this agent (random or not selected)
								stringBuffer.append("\ndataViz" + count + ".add(a_" + possibleAgentY+count+"."+possiblePCY+".get"+yAttr + "()+ "+"\"|"
										+ xAttr+"("+possibleAgentY+")" + "(\"+a_"+possibleAgentY +count+".getID()+\") VS " + yAttr +" |\"+"+xAttr+");\n");
								
								stringBuffer.append("\nouterMapViz.put(\"" + countString + "_" + yAttr + "VS" + xAttr + "_"
										+ "\", dataViz" + count + ");");
							} else {
								// ATTR VS ATTR
								if (seedSet) {
									stringBuffer.append(Util.Capitalize(possibleAgentX) + " a_" + possibleAgentX + count
											+ " = " + possibleAgentX + ".get(" + possibleAgentX + "_rand);\n");

								} else {
									stringBuffer.append(Util.Capitalize(possibleAgentX) + " a_" + possibleAgentX + count
											+ " = " + possibleAgentX + ".get(randomizer" + ".nextInt(" + possibleAgentX
											+ ".size()));\n");
								}
								//anyways start using this agent (random or not selected)
								stringBuffer.append("\ndataViz" + count + ".add(a_" + possibleAgentY+count+"."+possiblePCY+".get"+yAttr + "()+ "+"\"|"
										+ xAttr +"("+possibleAgentY+")"+ "(\"+a_"+possibleAgentY +count+".getID()+\") VS " + yAttr +" |\"+a_"+possibleAgentX+count+"."+possiblePCX+".get"+xAttr + "());\n");
								stringBuffer.append("\nouterMapViz.put(\"" + countString + "_" + yAttr + "VS" + xAttr + "_"
										+ "\", dataViz" + count + ");");
							}
						}
					}
					// determine if it is a role
					else if (!possibleAgentX.equals("notAgent") || !possibleAgentY.equals("notAgent")) {
						if (!possibleRoleX.equals("notRole")
								|| !possibleRoleY.equals("notRole") && !possiblePCX.equals("notPC")
								|| !possiblePCY.equals("notPC")) {
							// check what to generate based on x-axis and y-axis
							// selection
							if (!possibleRoleX.equals("notRole") && possibleRoleY.equals("notRole")) {
								// is x-axis VS Y TICK
								if (seedSet) {
									stringBuffer.append(Util.Capitalize(possibleRoleX) + " a_" + possibleRoleX + count
											+ " = " + possibleRoleX + ".get(" + possibleRoleX + "_rand);\n");

								} else {
									stringBuffer.append(Util.Capitalize(possibleRoleX) + " a_" + possibleRoleX + count
											+ " = " + possibleRoleX + ".get(randomizer" + ".nextInt(" + possibleRoleX
											+ ".size()));\n");
								}
								//anyways start using this agent (random or not selected)
								stringBuffer.append("\ndataViz" + count + ".add(" + yAttr + "+\"|"
										+ xAttr +"("+possibleRoleX+")"+ "(\"+a_"+possibleRoleX +count+".getID()+\") VS " + yAttr +" |\"+a_" + possibleRoleX+count+"."+possiblePCX+ ".get"+xAttr + "());\n");
								
								stringBuffer.append("\nouterMapViz.put(\"" + countString + "_" + yAttr + "VS" + xAttr + "_"
										+ "\", dataViz" + count + ");");
							} else if (!possibleRoleY.equals("notRole") && possibleRoleX.equals("notRole")) {
								// is X TICK vs Y-axis
								if (seedSet) {
									stringBuffer.append(Util.Capitalize(possibleRoleY) + " a_" + possibleRoleY + count
											+ " = " + possibleRoleY + ".get(" + possibleRoleY + "_rand);\n");

								} else {
									stringBuffer.append(Util.Capitalize(possibleRoleY) + " a_" + possibleRoleY + count
											+ " = " + possibleRoleY + ".get(randomizer" + ".nextInt(" + possibleRoleY
											+ ".size()));\n");
								}
								//anyways start using this agent (random or not selected)
								stringBuffer.append("\ndataViz" + count + ".add(a_" + possibleRoleY+count+"."+possiblePCY+".get"+yAttr + "()+ "+"\"|"
										+ xAttr +"("+possibleRoleY+")"+ "(\"+a_"+possibleRoleY +count+".getID()+\") VS " + yAttr +" |\"+"+xAttr+");\n");
								
								stringBuffer.append("\nouterMapViz.put(\"" + countString + "_" + yAttr + "VS" + xAttr + "_"
										+ "\", dataViz" + count + ");");
							} else {
								// ATTR VS ATTR
								if (seedSet) {
									stringBuffer.append(Util.Capitalize(possibleRoleX) + " a_" + possibleRoleX + count
											+ " = " + possibleRoleX + ".get(" + possibleRoleX + "_rand);\n");

								} else {
									stringBuffer.append(Util.Capitalize(possibleRoleX) + " a_" + possibleRoleX + count
											+ " = " + possibleRoleX + ".get(randomizer" + ".nextInt(" + possibleRoleX
											+ ".size()));\n");
								}
								//anyways start using this agent (random or not selected)
								stringBuffer.append("\ndataViz" + count + ".add(a_" + possibleRoleY+count+"."+possiblePCY+".get"+yAttr + "()+ "+"\"|"
										+ xAttr +"("+possibleRoleY+")"+ "(\"+a_"+possibleRoleY +count+".getID()+\") VS " + yAttr +" |\"+a_"+possibleRoleX+count+"."+possiblePCX+".get"+xAttr + "());\n");
								stringBuffer.append("\nouterMapViz.put(\"" + countString + "_" + yAttr + "VS" + xAttr + "_"
										+ "\", dataViz" + count + ");\n");
							}
						}
					}
					count += 1;

				}

			}
		}
		// it.remove(); // avoids a ConcurrentModificationException

		stringBuffer.append(NL + "}" + NL);// close analyse data method
		// Default fileWriter function that creates CSV below
		stringBuffer.append(
				"//takes in a arraylist \r\n\tpublic static FileWriter createCSV() throws IOException{\r\n\t\t//obtain date\r\n\t\tDateFormat dateFormatCSV = new SimpleDateFormat(\"yyyy/MM/dd_HH:mm:ss\");\r\n\t\tDate dateCSV = new Date();\r\n\t\tString date = dateFormatCSV.format(dateCSV);\ndate = dateCSV.toString().replace(\" \", \"\");\ndate = dateCSV.toString().replace(\":\", \"\");\r\n\t\t//opbtain working directory\r\n\t\tString pwd = System.getProperty(\"user.dir\");\r\n\t\t//obtain experiment name\r\n\t\tString name = new File(pwd).getName();\r\n\t\tSystem.out.println(name);\r\n\t\tString csvFile = pwd+File.separator+ \"evaluativeStructure\"+File.separator+name+\"_\"+date+\".csv\";\r\n        FileWriter writer = new FileWriter(csvFile);\r\n        CSVUtils.writeLine(writer, Arrays.asList(\"AgentID|Attribute\", \"AgentOrRoleName\", \"Tick\", \"Value\"));\r\n        \r\n        \r\n        return writer;\r\n\t}\r\n\r\n ");
		stringBuffer.append(
				"\tpublic static void generatePlots(Map<String, List<String>> outerMapViz2) throws IOException {\r\n\t\t// if not empty start reading through it\r\n\t\tif (!outerMapViz2.isEmpty()) {\r\n\t\t\tIterator itVizPC2 = outerMapViz.entrySet().iterator();\r\n\t\t\twhile (itVizPC2.hasNext()) {\r\n\t\t\t\tMap.Entry pairVizPC = (Map.Entry) itVizPC2.next();\r\n\t\t\t\tList<String> value = (List<String>) pairVizPC.getValue();\r\n\t\t\t\tString plotName = (String) (pairVizPC.getKey());\r\n\t\t\t\t// TimeSeries line_chart_dataset = new DefaultCategoryDataset();\r\n\t\t\t\tXYSeries series1 = new XYSeries(plotName);\r\n\t\t\t\tString xTitle = \"\";\r\n\t\t\t\tString yTitle = \"\";\r\n\t\t\t\tString title = \"\";\r\n\t\t\t\tfor (String vl : value) {\r\n\t\t\t\t\tString[] parts = vl.split(\"\\\\|\");\r\n\t\t\t\t\tString numberStr = parts[0];\r\n\t\t\t\t\tDouble number = Double.parseDouble(numberStr);\r\n\t\t\t\t\ttitle = parts[1];\r\n\t\t\t\t\tString xValue = parts[2];\r\n\t\t\t\t\tDouble x = Double.parseDouble(xValue);\r\n\t\t\t\t\tString conv = title.replace(\" VS \", \"|\");\r\n\t\t\t\t\tString[] partsNames = conv.split(\"\\\\|\");\r\n\t\t\t\t\txTitle = partsNames[0];\r\n\t\t\t\t\tyTitle = partsNames[1];\r\n\t\t\t\t\tseries1.add(x, number);\r\n\r\n\t\t\t\t}\r\n\r\n\t\t\t\tXYSeriesCollection dataset = new XYSeriesCollection();\r\n\t\t\t\tdataset.addSeries(series1);\r\n\t\t\t\tJFreeChart chart = ChartFactory.createXYLineChart(title, xTitle, yTitle, dataset);\r\n\r\n\t\t\t\tint width = 640; /* Width of the image */\r\n\t\t\t\tint height = 480; /* Height of the image */\r\n\t\t\t\tString pwd = System.getProperty(\"user.dir\");\r\n\t\t\t\tFile lineChart = new File(\r\n\t\t\t\t\t\tpwd + File.separator + \"evaluativeStructure\" + File.separator + plotName + \".jpeg\");\r\n\t\t\t\tChartUtilities.saveChartAsJPEG(lineChart, chart, width, height);\r\n\r\n\t\t\t}\r\n\t\t}\r\n\t}");
		stringBuffer.append(NL + "}" + NL);
		stringBuffer.append(TEXT_6);
		return stringBuffer.toString();
	}

}
