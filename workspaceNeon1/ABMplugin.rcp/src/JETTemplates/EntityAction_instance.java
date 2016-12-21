package JETTemplates;

import maia.physicalStructure.*;
import maia.collectiveStructure.*;
import maia.ontologicalStructure.*;
import maia.constitutionalStructure.*;
import maia.operationalStructure.*;
import java.util.*;

public class EntityAction_instance
{
  protected static String nl;
  public static synchronized EntityAction_instance create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityAction_instance result = new EntityAction_instance();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + NL;
  protected final String TEXT_2 = NL + "\t" + NL + "\t" + NL + "\t\t";
  protected final String TEXT_3 = NL + "\t\t" + NL + "\t ";
  protected final String TEXT_4 = NL;

  public String generate(Plan argument, Map<String, Map<String, Object>> outerMapEnt)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
//cast argument Object into hashmap
Map<String, Map<String, Object>> arr = outerMapEnt;
//retrieve the hashmaps for agent and plans
Map<String, Object> agentHashmap = arr.get("myAgents");

	
maia.operationalStructure.Plan entity = (maia.operationalStructure.Plan)argument;

			stringBuffer.append("package operationalStructure;\nimport constitutionalStructure.*;\nimport collectiveStructure.*;\nimport physicalStructure.*;\nimport java.util.Random;;\n");
			String methodPrefix = ""; 
	String pcOPEN = "";
	String roleObj = "";
	String roleConf = "";
	String nonPre = "";
	String agentEnactment = "";
	String postNotDo = "";
			//maia.operationalStructure.Plan entity = (maia.operationalStructure.Plan)argument;
			
// 1: Try to cast the object, else just print the Plan object name 
    // 2: if object is of instance EntityAction, print all their available attributes 
    // 3: if object is instance of EntityAction, check if it has a postConditon/preCondition/PostConditionNotDo if not dont print that attr. 
    // 4: if object is instance of EntityAction, check if it has a decision making if not dont print that attr. 
    // 5: if object is instance of EntityAction, check if it has a getPerformer if not dont print that attr. 
    // 6: do similar to step 5 a check for institution and role enactment 
    if (entity instanceof maia.operationalStructure.EntityAction) {
	maia.operationalStructure.EntityAction entityAction =  (maia.operationalStructure.EntityAction) entity; 
	if (entityAction.getPerfomer() != null){ 
	
	//check the performer and see if it is a PhyCom
			Performer per = entityAction.getPerfomer();
			if (per instanceof maia.physicalStructure.PhysicalComponent){
			maia.physicalStructure.PhysicalComponent phycom = (maia.physicalStructure.PhysicalComponent) per;
			String type = phycom.getType().toString();
			if (type.equals("open")){
				stringBuffer.append("public final class "+ Util.Capitalize(entityAction.getName())+ " extends EntityAction{\n");
				stringBuffer.append("private "+Util.Capitalize(entityAction.getName())+"(){\n}");
				pcOPEN = "OPEN";
			}
			}
			else{
			stringBuffer.append("public class "+ Util.Capitalize(entityAction.getName())+ " extends EntityAction{\n");
			}
	}
	
	
	
    stringBuffer.append(TEXT_2);
    if (entityAction.getPerfomer() != null){ 
		Iterator it =  agentHashmap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair2 = (Map.Entry) it.next();
			maia.collectiveStructure.Agent agent = (maia.collectiveStructure.Agent) pair2.getValue();
			for(maia.constitutionalStructure.Role rol :agent.getPossibleRole()){
				if(rol.getName().equals(entityAction.getPerfomer().getName())){
					roleConf = "1";
					agentEnactment = agent.getName();
					roleObj = "isRole";
				}
			}
			}
			
			if (entityAction.getPreCondition().isEmpty()){
				nonPre = "yes";
				System.out.println("TEST");
				if(pcOPEN.equals("OPEN")){
									stringBuffer.append("\t\tpublic static boolean execute(){\nif (true){ \n ");
				
				}
				else if(roleObj.equals("isRole")){
					stringBuffer.append("\t\tpublic static boolean execute("+Util.Capitalize(entityAction.getPerfomer().getName())+" "+ entityAction.getPerfomer().getName()+", "+Util.Capitalize(agentEnactment)+" "+agentEnactment+"){\n ");
					stringBuffer.append("if ("+entityAction.getPerfomer().getName()+ ".getID().equals("+agentEnactment+".getID())){\n");
					stringBuffer.append("if (true){");
			}else{
					stringBuffer.append("\t\tpublic static boolean execute("+Util.Capitalize(entityAction.getPerfomer().getName())+" "+ entityAction.getPerfomer().getName()+"){\nif (true){ ");
			
			}
				
			}
			
			stringBuffer.append("//"+entityAction.getPerfomer().getName()+ "\n");
	for (maia.ontologicalStructure.Condition cond : entityAction.getPreCondition()){
		if (cond instanceof maia.ontologicalStructure.NaturalLangCondition){
				
				if(pcOPEN.equals("OPEN")){
						stringBuffer.append("\t\tpublic static boolean execute(){\n ");
				}else if(roleObj.equals("isRole")){
									stringBuffer.append("\t\tpublic static boolean execute("+Util.Capitalize(entityAction.getPerfomer().getName())+" "+ entityAction.getPerfomer().getName()+", "+Util.Capitalize(agentEnactment)+" "+agentEnactment+"){\n ");
									stringBuffer.append("\t\tif ("+entityAction.getPerfomer().getName()+ ".getID().equals("+agentEnactment+".getID())){\n");
				
				}
				
				else{
				stringBuffer.append("\t\tpublic static boolean execute("+Util.Capitalize(entityAction.getPerfomer().getName())+" "+ entityAction.getPerfomer().getName()+"){\n");
			}
			maia.ontologicalStructure.NaturalLangCondition statement =  (maia.ontologicalStructure.NaturalLangCondition) cond; 
			stringBuffer.append("\t\t\t\tif ("+statement.getStatement()+"){ \n\t\t\t\t");
		}else{
		if(pcOPEN.equals("OPEN")){
											stringBuffer.append("\t\tpublic static boolean execute(){\n return true;}");
		}else if(roleObj.equals("isRole")){
											stringBuffer.append("\t\tpublic static boolean execute("+Util.Capitalize(entityAction.getPerfomer().getName())+" "+ entityAction.getPerfomer().getName()+", "+Util.Capitalize(agentEnactment)+" "+agentEnactment+"){\n ");
											stringBuffer.append("\t\tif ("+entityAction.getPerfomer().getName()+ ".getID().equals("+agentEnactment+".getID())){\n");
		
		}
		
		else{
		stringBuffer.append("\t\tpublic static boolean execute("+Util.Capitalize(entityAction.getPerfomer().getName())+" "+ entityAction.getPerfomer().getName()+"){\n return true;}");
		}}
	}
	for (maia.ontologicalStructure.Condition post : entityAction.getPostCondition()){
		if (post instanceof maia.ontologicalStructure.NaturalLangCondition){
			maia.ontologicalStructure.NaturalLangCondition post_statement =  (maia.ontologicalStructure.NaturalLangCondition) post; 
			
			for (maia.ontologicalStructure.Condition postNot : entityAction.getPostConditionNotDo()){
		if (postNot instanceof maia.ontologicalStructure.NaturalLangCondition){
		postNotDo = "yes";
		}
		}
			
			if (postNotDo.equals("")){
			if(roleObj.equals("isRole")){
						stringBuffer.append("\t"+post_statement.getStatement()+" \n\t\t\t\t}}return true;");
			
	}else{
			stringBuffer.append("\t"+post_statement.getStatement()+" \n\t\t\t\t}return true;");
		}
		}
		else{
					stringBuffer.append("\t"+post_statement.getStatement()+" \n\t\t\t\t}");
		
		}
		}
	}
	for (maia.ontologicalStructure.Condition postNot : entityAction.getPostConditionNotDo()){
		if (postNot instanceof maia.ontologicalStructure.NaturalLangCondition){
			maia.ontologicalStructure.NaturalLangCondition postNot_statement =  (maia.ontologicalStructure.NaturalLangCondition) postNot; 
		if(roleObj.equals("isRole")){
					stringBuffer.append("else {\n\t\t\t\t"+ postNot_statement.getStatement()+ "\n\t\t\t\t}}return true;");
		
		}else{
			stringBuffer.append("else {\n\t\t\t\t"+ postNot_statement.getStatement()+ "\n\t\t\t\t}return true;");
		}
		}
	}
	for (maia.ontologicalStructure.Condition cond : entityAction.getPreCondition()){
		if (cond instanceof maia.ontologicalStructure.NaturalLangCondition){
	stringBuffer.append("\n\t\t\t}");
	
	}
	else{
		stringBuffer.append("\t\tpublic static boolean precondition("+Util.Capitalize(entityAction.getPerfomer().getName())+" "+ entityAction.getPerfomer().getName()+"){\n return true;}");
		}}
		
	stringBuffer.append("\n\t\t}");
	
    stringBuffer.append(TEXT_3);
    } else{
	 
	 stringBuffer.append("//The following entityAction object has a performer of null "+ entityAction+ "\n}"); 
	 
	 }
	
	

	
	}
	else{
	//Plan object that is NOT an instance of EntityAction.
	}
	if(nonPre.equals("yes")){
		stringBuffer.append("}");
	}
	
	
    stringBuffer.append(TEXT_4);
    
    return stringBuffer.toString();
  }
}
