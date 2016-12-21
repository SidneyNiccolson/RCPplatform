package JETTemplates;

import maia.physicalStructure.*;
import maia.collectiveStructure.*;
import maia.ontologicalStructure.*;

public class Agent_instance
{
  protected static String nl;
  public static synchronized Agent_instance create(String lineSeparator)
  {
    nl = lineSeparator;
    Agent_instance result = new Agent_instance();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package collectiveStructure;";
  protected final String TEXT_2 = NL + "public class ";
  protected final String TEXT_3 = "Agent extends Agent{" + NL + "\t" + NL + "\t";
  protected final String TEXT_4 = NL + "\t";
  protected final String TEXT_5 = "private ";
  protected final String TEXT_6 = " ";
  protected final String TEXT_7 = " ";
  protected final String TEXT_8 = " = ";
  protected final String TEXT_9 = ";" + NL + "\tpublic ";
  protected final String TEXT_10 = " ";
  protected final String TEXT_11 = " get";
  protected final String TEXT_12 = "(){" + NL + "\t\treturn ";
  protected final String TEXT_13 = ";" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_14 = " void set";
  protected final String TEXT_15 = "(";
  protected final String TEXT_16 = " value){" + NL + "\t\t";
  protected final String TEXT_17 = " = value;" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_18 = NL + "\t" + NL + "\t";
  protected final String TEXT_19 = NL + "\t" + NL + "\tprivate ";
  protected final String TEXT_20 = "PhyCom ";
  protected final String TEXT_21 = " = new ";
  protected final String TEXT_22 = "PhyCom;" + NL + "\tpublic ";
  protected final String TEXT_23 = "PhyCom get";
  protected final String TEXT_24 = "(){" + NL + "\t\treturn ";
  protected final String TEXT_25 = ";" + NL + "\t}" + NL + "" + NL + "\tpublic void set";
  protected final String TEXT_26 = "(";
  protected final String TEXT_27 = "PhyCom value){" + NL + "\t\t";
  protected final String TEXT_28 = " = value;" + NL + "\t}\t" + NL + "\t";
  protected final String TEXT_29 = NL + "\t" + NL + "\t/* Constructor */" + NL + "\tpublic ";
  protected final String TEXT_30 = "Agent(){" + NL + "\t\t";
  protected final String TEXT_31 = NL + "\t\t";
  protected final String TEXT_32 = NL + "\t\t";
  protected final String TEXT_33 = NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_34 = NL + "\t";
  protected final String TEXT_35 = NL + "\t";
  protected final String TEXT_36 = NL + "\t" + NL + "\t";
  protected final String TEXT_37 = NL + "\tprivate double ";
  protected final String TEXT_38 = " = ";
  protected final String TEXT_39 = ";" + NL + "\tpublic double get";
  protected final String TEXT_40 = "(){" + NL + "\t\treturn ";
  protected final String TEXT_41 = ";" + NL + "\t}" + NL + "\tpublic void set";
  protected final String TEXT_42 = "(double value){" + NL + "\t\tif (value > ";
  protected final String TEXT_43 = "){" + NL + "\t\t\t// raise error" + NL + "\t\t}" + NL + "\t\telse{" + NL + "\t\t\t";
  protected final String TEXT_44 = " = value;" + NL + "\t\t}" + NL + "\t}" + NL + "\t";
  protected final String TEXT_45 = NL + "\t" + NL + "\t// possible roles" + NL + "\t";
  protected final String TEXT_46 = NL + "\t\tBoolean is";
  protected final String TEXT_47 = " = false;" + NL + "\t\t";
  protected final String TEXT_48 = "Objective ";
  protected final String TEXT_49 = "Objective = new ";
  protected final String TEXT_50 = "Objective();\t" + NL + "\t";
  protected final String TEXT_51 = NL + "\t" + NL + "\tpublic void assignRole(String possibleRole){\t" + NL + "\t\t";
  protected final String TEXT_52 = " \t" + NL + "\t\tif(possibleRole.equals(\"";
  protected final String TEXT_53 = "\")){" + NL + "\t\t\tif(";
  protected final String TEXT_54 = ".entryCondition(this)){" + NL + "\t\t\t\tthis.is";
  protected final String TEXT_55 = " = true;" + NL + "\t\t\t\t";
  protected final String TEXT_56 = "Objective =new FatherObjective();" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_57 = "\t\t" + NL + "\t}" + NL + "\t" + NL + "}" + NL;
  protected final String TEXT_58 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
	maia.collectiveStructure.Agent agent = (maia.collectiveStructure.Agent)argument;
	String methodPrefix = ""; 

    stringBuffer.append(TEXT_2);
    stringBuffer.append(Util.Capitalize(agent.getName()));
    stringBuffer.append(TEXT_3);
     for (Property prop : agent.getProperty()){ 
    stringBuffer.append(TEXT_4);
    stringBuffer.append(TEXT_5);
    stringBuffer.append(methodPrefix);
    stringBuffer.append(TEXT_6);
    stringBuffer.append(Util.GetPropertyTypeName(prop));
    stringBuffer.append(TEXT_7);
    stringBuffer.append(prop.getLabel());
    stringBuffer.append(TEXT_8);
    stringBuffer.append(Util.GetPropertyValue(prop));
    stringBuffer.append(TEXT_9);
    stringBuffer.append(methodPrefix);
    stringBuffer.append(TEXT_10);
    stringBuffer.append(Util.GetPropertyTypeName(prop));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(Util.Capitalize(prop.getLabel()));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(prop.getLabel());
    stringBuffer.append(TEXT_13);
    stringBuffer.append(methodPrefix);
    stringBuffer.append(TEXT_14);
    stringBuffer.append(Util.Capitalize(prop.getLabel()));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(Util.GetPropertyTypeName(prop));
    stringBuffer.append(TEXT_16);
    stringBuffer.append(prop.getLabel());
    stringBuffer.append(TEXT_17);
     }
    stringBuffer.append(TEXT_18);
     	for (maia.physicalStructure.PhysicalComponent pCom :agent.getPhysicalComponent()){
	if (pCom.getType()== ResourceType.FENCED){
    stringBuffer.append(TEXT_19);
    stringBuffer.append(pCom.getName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(pCom.getName());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(pCom.getName());
    stringBuffer.append(TEXT_22);
    stringBuffer.append(pCom.getName());
    stringBuffer.append(TEXT_23);
    stringBuffer.append(Util.Capitalize(pCom.getName()));
    stringBuffer.append(TEXT_24);
    stringBuffer.append(pCom.getName());
    stringBuffer.append(TEXT_25);
    stringBuffer.append(pCom.getName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(pCom.getName());
    stringBuffer.append(TEXT_27);
    stringBuffer.append(pCom.getName());
    stringBuffer.append(TEXT_28);
    }
	}
    stringBuffer.append(TEXT_29);
    stringBuffer.append(agent.getName());
    stringBuffer.append(TEXT_30);
     for(Condition info : agent.getInformation()){ 
    stringBuffer.append(TEXT_31);
    stringBuffer.append(info.getLabel());
    stringBuffer.append(TEXT_32);
    }
    stringBuffer.append(TEXT_33);
     for(Condition info : agent.getInformation()){ 
    stringBuffer.append(TEXT_34);
    stringBuffer.append(info.getLabel());
    stringBuffer.append(TEXT_35);
    }
    stringBuffer.append(TEXT_36);
     for(PersonalValue pValue : agent.getPersonalValue()){
	double limit = 0;
	if (pValue.getDecisionInfluence()!=null)
		limit = Double.parseDouble(pValue.getDecisionInfluence().getLimit());
	String name = pValue.getLabel();
	double defValue = pValue.getValue();
	
    stringBuffer.append(TEXT_37);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_38);
    stringBuffer.append(defValue);
    stringBuffer.append(TEXT_39);
    stringBuffer.append(Util.Capitalize(name));
    stringBuffer.append(TEXT_40);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(Util.Capitalize(name));
    stringBuffer.append(TEXT_42);
    stringBuffer.append(limit);
    stringBuffer.append(TEXT_43);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_44);
    }
    stringBuffer.append(TEXT_45);
    for (maia.constitutionalStructure.Role role :agent.getPossibleRole()){
		String roleName = role.getName();
    stringBuffer.append(TEXT_46);
    stringBuffer.append(roleName);
    stringBuffer.append(TEXT_47);
    stringBuffer.append(roleName);
    stringBuffer.append(TEXT_48);
    stringBuffer.append(roleName);
    stringBuffer.append(TEXT_49);
    stringBuffer.append(roleName);
    stringBuffer.append(TEXT_50);
    }
    stringBuffer.append(TEXT_51);
    for (maia.constitutionalStructure.Role role :agent.getPossibleRole()){
    stringBuffer.append(TEXT_52);
    stringBuffer.append(Util.Capitalize(role.getName()));
    stringBuffer.append(TEXT_53);
    stringBuffer.append(Util.Capitalize(role.getName()));
    stringBuffer.append(TEXT_54);
    stringBuffer.append(Util.Capitalize(role.getName()));
    stringBuffer.append(TEXT_55);
    stringBuffer.append(role.getName());
    stringBuffer.append(TEXT_56);
    }
    stringBuffer.append(TEXT_57);
    stringBuffer.append(TEXT_58);
    return stringBuffer.toString();
  }
}
