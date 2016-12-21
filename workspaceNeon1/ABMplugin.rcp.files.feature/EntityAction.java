package JETTemplates;

public class EntityAction
{
  protected static String nl;
  public static synchronized EntityAction create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityAction result = new EntityAction();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package operationalStructure ;" + NL + "" + NL + "public abstract class EntityAction {" + NL + "\tpublic static boolean preCondition(Agent agent){" + NL + "\t\t//default value is set to true" + NL + "\t\treturn true;" + NL + "" + NL + "" + NL + "\t}" + NL + "\t" + NL + "\tpublic static void enactRole(Agent agent){" + NL + "\t\tif (agent.assignRole(Role role)){" + NL + "\t\t\treturn true;" + NL + "\t\t}" + NL + "\t\treturn false;" + NL + "\t}" + NL + "" + NL + "" + NL + "\t//for those entity actions that only have a body without insitution or decision, such as physical component" + NL + "\t//behaviour" + NL + "\tpublic static boolean execute(Agent agent){" + NL + "\t\tif (enactRole(agent)) else return false; // could not enact role" + NL + "\t\tif(preCondition( agent)){" + NL + "\t\t\t//apply post condition" + NL + "\t\t\treturn true;" + NL + "\t\t}//precondition not met, don't do anything" + NL + "\t\treturn false;" + NL + "" + NL + "\t}" + NL + "\t" + NL + "public static boolean executeWithDecision(Agent agent){" + NL + "\t\t//there is a decision associated with this action but no institution" + NL + "\tif (enactRole(agent)) else return false; // could not enact role" + NL + "" + NL + "\tif(preCondition( agent)){" + NL + "\t\tif(agent.decision()){" + NL + "\t\t\t\t//execute action" + NL + "\t\t\t\t//apply Post Condition" + NL + "\t\t\t\t//update objective" + NL + "\t\t\treturn true;" + NL + "\t\t}" + NL + "\t\t\telse { //decides not to do it. " + NL + "\t\t\t\t//apply Post Condition" + NL + "\t\t\t\t//update objective" + NL + "\t\t\t\treturn false;" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\treturn false;" + NL + "\t}" + NL + "\tpublic static boolean executeWithRule(Agent agent){" + NL + "" + NL + "\t\tf(enactRole(agent)) else return false; //could not enact role" + NL + "" + NL + "\t\tif(preCondition( agent)){" + NL + "\t\t\t" + NL + "\t\t\tif(Institution.institutionCondition()){ //what if there is more than one institution" + NL + "" + NL + "\t\t\t\tif(agent.decision()  && (Institution.deonticType.equals(\"permission\")|| Institution.deonticType.equals(\"obligation\"))){" + NL + "\t\t\t\t\t" + NL + "\t\t\t\t\t//execute action\t\t" + NL + "\t\t\t\t\t//apply Post Condition" + NL + "\t\t\t\t}// decides not to do or institution type is prohibition" + NL + "\t\t\t\t" + NL + "\t\t\t\tif(agent.decision()&& Institution.deonticType.equals(\"prohibition\")){" + NL + "\t\t\t\t\t// the agent decides to perform the action even though he is prohibited" + NL + "\t\t\t\t\t//execute action" + NL + "\t\t\t\t\t//apply post condition" + NL + "\t\t\t\t\t//apply sanction, update objective" + NL + "\t\t\t\t}// the agent does not decide to do it or he is prohibited to do it" + NL + "\t\t\t\t" + NL + "\t\t\t\tif(!agent.decision() && Institution.deonticType.equals(\"prohibition\")){" + NL + "\t\t\t\t\t// the agent decides not to do it, and he was prohibited" + NL + "\t\t\t\t\t//update objective, no sanction" + NL + "\t\t\t\t}" + NL + "\t\t\t\t" + NL + "\t\t\t\tif(!agent.decision() && Institution.deonticType.equals(\"permission\")){" + NL + "\t\t\t\t\t//nothing happens, objective not updated, no care situation" + NL + "\t\t\t\t}" + NL + "\t\t\t\t" + NL + "\t\t\t\tif(!agent.decision() &&  Institution.deonticType.equals(\"obligation\")){" + NL + "\t\t\t\t\t// the agent does not do it, but he should have done it" + NL + "\t\t\t\t\t" + NL + "\t\t\t\t\t//perform sanction" + NL + "\t\t\t\t\t//objective update" + NL + "\t\t\t\t\t" + NL + "\t\t\t\t}" + NL + "\t\t\t}// institution condition does not hold" + NL + "\t\t\t//so the agent decides without considering the institution condition. " + NL + "" + NL + "\t\t\treturn true;" + NL + "\t\t}//precondition not met, don't do anything" + NL + "\t\treturn false;" + NL + "" + NL + "\t}" + NL + "" + NL + "\t" + NL + "\tpublic static boolean executeWithNorm(Agent agent){" + NL + "\t\tenactRole(agent);" + NL + "" + NL + "\t\tif(Institution.institutionCondition()){" + NL + "\t\t\tif(preCondition( agent)){" + NL + "" + NL + "\t\t\t\tif(agent.decision() && (Institution.deonticType.equals(\"permission\")|| Institution.deonticType.equals(\"obligation\"))){" + NL + "" + NL + "\t\t\t\t//execute action\t\t" + NL + "\t\t\t\t//apply Post Condition" + NL + "\t\t\t}// decides not to do or institution type is prohibition" + NL + "\t\t\t" + NL + "\t\t\tif(agent.decision()&& Institution.deonticType.equals(\"prohibition\")){" + NL + "\t\t\t\t// the agent decides to perform the action even though he is prohibited" + NL + "\t\t\t\t//execute action" + NL + "\t\t\t\t//apply post condition" + NL + "\t\t\t\t//no sanction, update objective" + NL + "\t\t\t}// the agent does not decide to do it or he is prohibited to do it" + NL + "\t\t\t" + NL + "\t\t\tif(!agent.decision() && Institution.deonticType.equals(\"prohibition\")){" + NL + "\t\t\t\t// the agent decides not to do it, and he was prohibited" + NL + "\t\t\t\t//update objective, no sanction" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\tif(!agent.decision() && Institution.deonticType.equals(\"permission\")){" + NL + "\t\t\t\t//nothing happens, objective not updated, no care situation" + NL + "\t\t\t}" + NL + "\t\t\t" + NL + "\t\t\tif(!agent.decision() &&  Institution.deonticType.equals(\"obligation\")){" + NL + "\t\t\t\t// the agent does not do it, but he should have done it" + NL + "\t\t\t\t" + NL + "\t\t\t\t//no sanction" + NL + "\t\t\t\t//objective update" + NL + "\t\t\t\t" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "" + NL + "\t\treturn true;" + NL + "\t}//precondition not met, don't do anything" + NL + "\treturn false;" + NL + "\t" + NL + "}" + NL + "" + NL + "" + NL + "public static boolean executeWithSharedStrategy(Agent agent){" + NL + "\t" + NL + "\tenactRole(agent);" + NL + "" + NL + "\tif(preCondition( agent)){" + NL + "\t\tif(Institution.institutionCondition()){" + NL + "\t\t\tif(agent.decision() ){" + NL + "" + NL + "\t\t\t//execute action\t\t" + NL + "\t\t\t//apply Post Condition" + NL + "\t\t\t}" + NL + "" + NL + "" + NL + "\t\t\tif(!agent.decision() ){" + NL + "\t\t\t// the agent decides not to do it, and he was prohibited" + NL + "\t\t\t//update objective" + NL + "\t\t\t}" + NL + "" + NL + "\t\t//there are no sanctions nor deontic type" + NL + "\t\t}" + NL + "" + NL + "\t\treturn true;" + NL + "\t}//precondition not met, don't do anything" + NL + "\treturn false;" + NL + "" + NL + "}";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}