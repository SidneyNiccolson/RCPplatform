package JETTemplates;

import maia.physicalStructure.*;
import maia.collectiveStructure.*;
import maia.ontologicalStructure.*;

public class Agent_instance_genHelp
{
  protected static String nl;
  public static synchronized Agent_instance_genHelp create(String lineSeparator)
  {
    nl = lineSeparator;
    Agent_instance_genHelp result = new Agent_instance_genHelp();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	maia.collectiveStructure.Agent agent = (maia.collectiveStructure.Agent)argument;
	String methodPrefix = ""; 

    stringBuffer.append(TEXT_1);
    stringBuffer.append(Util.Capitalize(agent.getName()));
    return stringBuffer.toString();
  }
}
