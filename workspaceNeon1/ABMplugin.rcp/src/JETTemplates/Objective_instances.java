package JETTemplates;

import maia.physicalStructure.*;
import maia.collectiveStructure.*;
import maia.ontologicalStructure.*;
import maia.constitutionalStructure.*;
import maia.operationalStructure.*;
import org.eclipse.emf.common.util.EList;
import java.util.*;;

public class Objective_instances
{
  protected static String nl;
  public static synchronized Objective_instances create(String lineSeparator)
  {
    nl = lineSeparator;
    Objective_instances result = new Objective_instances();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL;
  protected final String TEXT_2 = NL;
  protected final String TEXT_3 = NL;
  protected final String TEXT_4 = NL + NL + NL;
  protected final String TEXT_5 = NL + NL;
  protected final String TEXT_6 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    // get object ... 
    stringBuffer.append(TEXT_2);
    // get object Agent as this is required to get the respective roles and objectives. In addition initialize some values 
     maia.collectiveStructure.Agent agent = (maia.collectiveStructure.Agent)argument; 
String methodPrefix = ""; 
maia.ontologicalStructure.lessformula less = null; 
maia.ontologicalStructure.equalFormula equal = null; 
maia.ontologicalStructure.moreEqformula moreEq = null; 
maia.ontologicalStructure.ANDformula and = null; 
maia.ontologicalStructure.ORformula or = null; 
String objectiveName= "";
String agentName;

     // initialize an HashMap (dictionary) to make sure that each objective is a key and its values are the meetingConditions
    Map<String, String> map = new HashMap<String, String>();
    List<String> allObjectives = new ArrayList<String>();
    List<String> objectiveNames = new ArrayList<String>();
    agentName = (agent.getName());
     for (maia.constitutionalStructure.Role role : agent.getPossibleRole()){ 
    stringBuffer.append(TEXT_3);
    // get all objectives that an agents instance has
    maia.constitutionalStructure.Objective obj = role.getObjective();


     // if objective is not null do something with it
    try{ 
    stringBuffer.append(TEXT_4);
    Condition cond = obj.getMeetingCondition(); 
    // if the condition is of type moreEqformula retrieve the data
    if (cond instanceof maia.ontologicalStructure.moreEqformula) { moreEq = (maia.ontologicalStructure.moreEqformula) cond; 
    }else{ moreEq = null; }
    if (cond instanceof maia.ontologicalStructure.ANDformula) { and = (maia.ontologicalStructure.ANDformula) cond; 
    }else{ and = null; }
    if (cond instanceof maia.ontologicalStructure.ORformula) { or = (maia.ontologicalStructure.ORformula) cond; 
    }else{ or = null; }
    if (cond instanceof maia.ontologicalStructure.equalFormula) { equal = (maia.ontologicalStructure.equalFormula) cond; 
    }else{ equal = null; }
    if (cond instanceof maia.ontologicalStructure.lessformula) { less = (maia.ontologicalStructure.lessformula) cond; 
    } else{ less = null; }
     String strMoreEq = null; 
String strLess = null;
String strEqual = null;
String strAnd = null;
String strOr = null;
if (less != null){
	strLess = "if("+less.getLeftConditionStatement().getLabel()+ " < " +less.getRightConditionStatement().getLabel()+"){ return@true;}else{ return@false;}";
}
if (equal != null){
	strEqual = "if("+equal.getLeftConditionStatement().getLabel()+" == "+equal.getRightConditionStatement().getLabel()+"){ return@true;}else{ return@false;}";
}
if (and != null){
	strAnd = "if("+and.getLeftConditionStatement().getLabel()+" && "+and.getRightConditionStatement().getLabel()+"){ return@true;}else{ return@false;}";
}
if (or != null){
	strOr = "if("+or.getLeftConditionStatement().getLabel()+" || "+or.getRightConditionStatement().getLabel()+"){ return@true;}else{ return@false;}";
	
}
if (moreEq != null){ 
	strMoreEq = "if("+moreEq.getLeftConditionStatement().getLabel()+" >= "+moreEq.getRightConditionStatement().getLabel()+"){ return@true;}else{ return@false;}"; 
	}
     if (obj != null){
String test = agentName+"#"+strLess+"#"+strEqual+"#"+strAnd+"#"+strOr+"#"+strMoreEq;
allObjectives.add(test);
objectiveName = obj.getLabel();
objectiveNames.add(objectiveName);

}
    stringBuffer.append(TEXT_5);
    }
    
catch(NullPointerException e) {
	e.printStackTrace();
	System.out.println("A role has a missing objective!");
	
	break;
    }
    }
    for (int i = 0; i < allObjectives.size(); i++) { 

String myObjectiveName = (objectiveNames.get(i));
map.put(myObjectiveName, (allObjectives.get(i))); }
    stringBuffer.append(TEXT_6);
    stringBuffer.append(map);
    return stringBuffer.toString();
  }
}
