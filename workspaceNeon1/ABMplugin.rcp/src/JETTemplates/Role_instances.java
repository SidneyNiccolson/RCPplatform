package JETTemplates;

import maia.physicalStructure.*;
import maia.collectiveStructure.*;
import maia.ontologicalStructure.*;
import maia.constitutionalStructure.*;
import maia.operationalStructure.*;
import java.util.*;

public class Role_instances
{
  protected static String nl;
  public static synchronized Role_instances create(String lineSeparator)
  {
    nl = lineSeparator;
    Role_instances result = new Role_instances();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    // get object Agent as this is required to get the respective roles and objectives 
     maia.collectiveStructure.Agent agent = (maia.collectiveStructure.Agent)argument; String methodPrefix = ""; maia.ontologicalStructure.lessformula less = null; maia.ontologicalStructure.equalFormula equal = null; maia.ontologicalStructure.moreEqformula moreEq = null; maia.ontologicalStructure.ANDformula and = null; maia.ontologicalStructure.ORformula or = null; 
     //What is difficult in this class is that roles are not aware of their respective agents //Agents are aware of possible roles, but in turn they might have multiple roles //Generation than conflicts as multiple classes are created per agent in the case of multiple roles //these classes need to be exported seprately //therefore I created first a standard Big string containing everything we need //Afterwards I started breaking it down and using dictionaries to set as key the Role and the agent and conditions as values //This way I hope to be able to generate actual files from it. //agentroles 
    List<String> allRoles = new ArrayList<String>();
    Map<String, String> map = new HashMap<String, String>();
     for (maia.constitutionalStructure.Role role : agent.getPossibleRole()){ 
    // get all conditions for each role and agents instance has
    Condition cond = role.getEntryCondition();
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
    String test = agent.getName()+"#"+strLess+"#"+strEqual+"#"+strAnd+"#"+strOr+"#"+strMoreEq;
    List<String> elephantList = Arrays.asList(test.split(","));
    allRoles.add(test);
    for (int i = 0; i < allRoles.size(); i++) { map.put(role.getName(), (allRoles.get(i))); }
    }
    stringBuffer.append(TEXT_1);
    stringBuffer.append(map);
    return stringBuffer.toString();
  }
}
