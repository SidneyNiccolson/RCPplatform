package JETTemplates;

import maia.physicalStructure.*;
import maia.collectiveStructure.*;
import maia.ontologicalStructure.*;
import maia.constitutionalStructure.*;
import maia.operationalStructure.*;

public class EntityAction_instance_genHelp
{
  protected static String nl;
  public static synchronized EntityAction_instance_genHelp create(String lineSeparator)
  {
    nl = lineSeparator;
    EntityAction_instance_genHelp result = new EntityAction_instance_genHelp();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	maia.operationalStructure.Plan entity = (maia.operationalStructure.Plan)argument;

    if (entity instanceof maia.operationalStructure.EntityAction) {
maia.operationalStructure.EntityAction entityAction =  (maia.operationalStructure.EntityAction) entity; 
    stringBuffer.append(TEXT_1);
    stringBuffer.append(Util.Capitalize(entityAction.getName()));
    }
    return stringBuffer.toString();
  }
}