package JETTemplates;

import maia.physicalStructure.*;
import maia.ontologicalStructure.*;

public class PhysicalComponent_instance
{
  protected static String nl;
  public static synchronized PhysicalComponent_instance create(String lineSeparator)
  {
    nl = lineSeparator;
    PhysicalComponent_instance result = new PhysicalComponent_instance();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package physicalStructure;";
  protected final String TEXT_2 = NL + NL + "public class ";
  protected final String TEXT_3 = " extends PhysicalComponent{" + NL + "public int getId() {" + NL + "\t\treturn id;" + NL + "\t}" + NL + "\tpublic void setId(int id) {" + NL + "\t\tthis.id = id;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_4 = NL + "\t";
  protected final String TEXT_5 = "public ";
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
  protected final String TEXT_17 = " = value;" + NL + "\t}" + NL + "\t";
  protected final String TEXT_18 = NL + NL + "}";
  protected final String TEXT_19 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    
	maia.physicalStructure.PhysicalComponent pComp = (maia.physicalStructure.PhysicalComponent) argument;
	boolean allStatic = pComp.getType() == ResourceType.OPEN;
	
	String methodPrefix = allStatic ? "static" : ""; 

    stringBuffer.append(TEXT_2);
    stringBuffer.append(Util.Capitalize(pComp.getName()));
    stringBuffer.append(TEXT_3);
     for (Property prop : pComp.getProperty()){ 
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
    stringBuffer.append(TEXT_19);
    return stringBuffer.toString();
  }
}
