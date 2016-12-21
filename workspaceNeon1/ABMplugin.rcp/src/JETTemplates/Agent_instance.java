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
  protected final String TEXT_2 = NL + "import constitutionalStructure.*;";
  protected final String TEXT_3 = NL + "import physicalStructure.";
  protected final String TEXT_4 = ";" + NL;
  protected final String TEXT_5 = NL + NL + NL + "public class ";
  protected final String TEXT_6 = " extends Agent{" + NL + "\t" + NL + "\t";
  protected final String TEXT_7 = NL + "\t";
  protected final String TEXT_8 = "public ";
  protected final String TEXT_9 = " ";
  protected final String TEXT_10 = " ";
  protected final String TEXT_11 = " = ";
  protected final String TEXT_12 = ";" + NL + "\tpublic ";
  protected final String TEXT_13 = " ";
  protected final String TEXT_14 = " get";
  protected final String TEXT_15 = "(){" + NL + "\t\treturn ";
  protected final String TEXT_16 = ";" + NL + "\t}" + NL + "\tpublic ";
  protected final String TEXT_17 = " void set";
  protected final String TEXT_18 = "(";
  protected final String TEXT_19 = " value){" + NL + "\t\t";
  protected final String TEXT_20 = " = value;" + NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_21 = NL + "\t" + NL + "\t";
  protected final String TEXT_22 = NL + "\t" + NL + "\tpublic ";
  protected final String TEXT_23 = " ";
  protected final String TEXT_24 = " = new ";
  protected final String TEXT_25 = "();" + NL + "\tpublic ";
  protected final String TEXT_26 = " get";
  protected final String TEXT_27 = "(){" + NL + "\t\treturn ";
  protected final String TEXT_28 = ";" + NL + "\t}" + NL + "" + NL + "\tpublic void set";
  protected final String TEXT_29 = "(";
  protected final String TEXT_30 = " value){" + NL + "\t\t";
  protected final String TEXT_31 = " = value;" + NL + "\t}\t" + NL + "\t";
  protected final String TEXT_32 = NL + "\t" + NL + "\t/* Constructor */" + NL + "\tpublic ";
  protected final String TEXT_33 = "(){" + NL + "\t\t";
  protected final String TEXT_34 = NL + "\t\t";
  protected final String TEXT_35 = NL + "\t\t";
  protected final String TEXT_36 = NL + "\t}" + NL + "\t" + NL + "\t";
  protected final String TEXT_37 = NL + "\t";
  protected final String TEXT_38 = NL + "\t";
  protected final String TEXT_39 = NL + "\t" + NL + "\t";
  protected final String TEXT_40 = NL + "\tprivate double ";
  protected final String TEXT_41 = " = ";
  protected final String TEXT_42 = ";" + NL + "\tpublic double get";
  protected final String TEXT_43 = "(){" + NL + "\t\treturn ";
  protected final String TEXT_44 = ";" + NL + "\t}" + NL + "\tpublic void set";
  protected final String TEXT_45 = "(double value){" + NL + "\t\tif (value > ";
  protected final String TEXT_46 = "){" + NL + "\t\t\t// raise error" + NL + "\t\t}" + NL + "\t\telse{" + NL + "\t\t\t";
  protected final String TEXT_47 = " = value;" + NL + "\t\t}" + NL + "\t}" + NL + "\t";
  protected final String TEXT_48 = NL + "\t" + NL + "\t// possible roles" + NL + "\t";
  protected final String TEXT_49 = NL + "\t\t" + NL + "\t\tBoolean is";
  protected final String TEXT_50 = " = false;" + NL + "\t\t";
  protected final String TEXT_51 = NL + "\t\t";
  protected final String TEXT_52 = NL + "\t";
  protected final String TEXT_53 = NL + "\t" + NL + "\tpublic void assignRole(String possibleRole){\t" + NL + "\t\t";
  protected final String TEXT_54 = " \t" + NL + "\t\tif(possibleRole.equals(\"";
  protected final String TEXT_55 = "\")){" + NL + "\t\t\tif(";
  protected final String TEXT_56 = ".entryCondition(this)){" + NL + "\t\t\t\tthis.is";
  protected final String TEXT_57 = " = true;" + NL + "\t\t\t\t";
  protected final String TEXT_58 = NL + "\t\t";
  protected final String TEXT_59 = "\t" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_60 = "\t\t" + NL + "\t}" + NL + "\t" + NL + "}" + NL;
  protected final String TEXT_61 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
	maia.collectiveStructure.Agent agent1 = (maia.collectiveStructure.Agent)argument;

    stringBuffer.append(TEXT_2);
     	for (maia.physicalStructure.PhysicalComponent pCom1 :agent1.getPhysicalComponent()){
	if (pCom1.getType()== ResourceType.FENCED){
    stringBuffer.append(TEXT_3);
    stringBuffer.append(Util.Capitalize(pCom1.getName()));
    stringBuffer.append(TEXT_4);
    }}
    
	maia.collectiveStructure.Agent agent = (maia.collectiveStructure.Agent)argument;
	String methodPrefix = ""; 

    stringBuffer.append(TEXT_5);
    stringBuffer.append(Util.Capitalize(agent.getName()));
    stringBuffer.append(TEXT_6);
     for (Property prop : agent.getProperty()){ 
    stringBuffer.append(TEXT_7);
    stringBuffer.append(TEXT_8);
    stringBuffer.append(methodPrefix);
    stringBuffer.append(TEXT_9);
    stringBuffer.append(Util.GetPropertyTypeName(prop));
    stringBuffer.append(TEXT_10);
    stringBuffer.append(prop.getLabel());
    stringBuffer.append(TEXT_11);
    stringBuffer.append(Util.GetPropertyValue(prop));
    stringBuffer.append(TEXT_12);
    stringBuffer.append(methodPrefix);
    stringBuffer.append(TEXT_13);
    stringBuffer.append(Util.GetPropertyTypeName(prop));
    stringBuffer.append(TEXT_14);
    stringBuffer.append(Util.Capitalize(prop.getLabel()));
    stringBuffer.append(TEXT_15);
    stringBuffer.append(prop.getLabel());
    stringBuffer.append(TEXT_16);
    stringBuffer.append(methodPrefix);
    stringBuffer.append(TEXT_17);
    stringBuffer.append(Util.Capitalize(prop.getLabel()));
    stringBuffer.append(TEXT_18);
    stringBuffer.append(Util.GetPropertyTypeName(prop));
    stringBuffer.append(TEXT_19);
    stringBuffer.append(prop.getLabel());
    stringBuffer.append(TEXT_20);
     }
    stringBuffer.append(TEXT_21);
     	for (maia.physicalStructure.PhysicalComponent pCom :agent.getPhysicalComponent()){
	if (pCom.getType()== ResourceType.FENCED){
    stringBuffer.append(TEXT_22);
    stringBuffer.append(Util.Capitalize(pCom.getName()));
    stringBuffer.append(TEXT_23);
    stringBuffer.append(pCom.getName());
    stringBuffer.append(TEXT_24);
    stringBuffer.append(Util.Capitalize(pCom.getName()));
    stringBuffer.append(TEXT_25);
    stringBuffer.append(Util.Capitalize(pCom.getName()));
    stringBuffer.append(TEXT_26);
    stringBuffer.append(Util.Capitalize(pCom.getName()));
    stringBuffer.append(TEXT_27);
    stringBuffer.append(pCom.getName());
    stringBuffer.append(TEXT_28);
    stringBuffer.append(pCom.getName());
    stringBuffer.append(TEXT_29);
    stringBuffer.append(Util.Capitalize(pCom.getName()));
    stringBuffer.append(TEXT_30);
    stringBuffer.append(pCom.getName());
    stringBuffer.append(TEXT_31);
    }
	}
    stringBuffer.append(TEXT_32);
    stringBuffer.append(Util.Capitalize(agent.getName()));
    stringBuffer.append(TEXT_33);
     for(Condition info : agent.getInformation()){ 
    stringBuffer.append(TEXT_34);
    stringBuffer.append(info.getLabel());
    stringBuffer.append(TEXT_35);
    }
    stringBuffer.append(TEXT_36);
     for(Condition info : agent.getInformation()){ 
    stringBuffer.append(TEXT_37);
    stringBuffer.append(info.getLabel());
    stringBuffer.append(TEXT_38);
    }
    stringBuffer.append(TEXT_39);
     for(PersonalValue pValue : agent.getPersonalValue()){
	double limit = 0;
	if (pValue.getDecisionInfluence()!=null)
		limit = Double.parseDouble(pValue.getDecisionInfluence().getLimit());
	String name = pValue.getLabel();
	double defValue = pValue.getValue();
	
    stringBuffer.append(TEXT_40);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_41);
    stringBuffer.append(defValue);
    stringBuffer.append(TEXT_42);
    stringBuffer.append(Util.Capitalize(name));
    stringBuffer.append(TEXT_43);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_44);
    stringBuffer.append(Util.Capitalize(name));
    stringBuffer.append(TEXT_45);
    stringBuffer.append(limit);
    stringBuffer.append(TEXT_46);
    stringBuffer.append(name);
    stringBuffer.append(TEXT_47);
    }
    stringBuffer.append(TEXT_48);
    for (maia.constitutionalStructure.Role role :agent.getPossibleRole()){
		
		String roleName = role.getName(); 
    stringBuffer.append(TEXT_49);
    stringBuffer.append(Util.Capitalize(roleName));
    stringBuffer.append(TEXT_50);
    String objective;
    stringBuffer.append(TEXT_51);
    try{objective = role.getObjective().getLabel();
		stringBuffer.append(Util.Capitalize(objective)+" "+objective+" = new "+Util.Capitalize(objective)+"();");	
		}catch (Exception e){continue;
		}
    stringBuffer.append(TEXT_52);
    }
    stringBuffer.append(TEXT_53);
    for (maia.constitutionalStructure.Role role :agent.getPossibleRole()){
    stringBuffer.append(TEXT_54);
    stringBuffer.append(Util.Capitalize(role.getName()));
    stringBuffer.append(TEXT_55);
    stringBuffer.append(Util.Capitalize(role.getName()));
    stringBuffer.append(TEXT_56);
    stringBuffer.append(Util.Capitalize(role.getName()));
    stringBuffer.append(TEXT_57);
    String objective;
    stringBuffer.append(TEXT_58);
    try{objective = role.getObjective().getLabel();
				stringBuffer.append(objective+" = new "+Util.Capitalize(objective)+"();");	
		}catch (Exception e){stringBuffer.append("}}");continue;
		}
    stringBuffer.append(TEXT_59);
    }
    stringBuffer.append(TEXT_60);
    stringBuffer.append(TEXT_61);
    return stringBuffer.toString();
  }
}
