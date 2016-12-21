package JETTemplates;

import maia.physicalStructure.*;
import maia.ontologicalStructure.*;

public class PhysicalComponent_instance_genHelp
{
  protected static String nl;
  public static synchronized PhysicalComponent_instance_genHelp create(String lineSeparator)
  {
    nl = lineSeparator;
    PhysicalComponent_instance_genHelp result = new PhysicalComponent_instance_genHelp();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	maia.physicalStructure.PhysicalComponent pComp = (maia.physicalStructure.PhysicalComponent) argument;


    stringBuffer.append(TEXT_1);
    stringBuffer.append(Util.Capitalize(pComp.getName()));
    return stringBuffer.toString();
  }
}
