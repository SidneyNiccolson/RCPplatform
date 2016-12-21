package JETTemplates;

import maia.physicalStructure.*;
import maia.collectiveStructure.*;
import maia.ontologicalStructure.*;
import maia.constitutionalStructure.*;
import maia.operationalStructure.*;

public class MainSimulation_genHelp
{
  protected static String nl;
  public static synchronized MainSimulation_genHelp create(String lineSeparator)
  {
    nl = lineSeparator;
    MainSimulation_genHelp result = new MainSimulation_genHelp();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "public static ArrayList<";
  protected final String TEXT_2 = "Agent>  ";
  protected final String TEXT_3 = ";";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	maia.collectiveStructure.Agent agent = (maia.collectiveStructure.Agent)argument;
	String methodPrefix = ""; 

    stringBuffer.append(TEXT_1);
    stringBuffer.append(Util.Capitalize(agent.getName()));
    stringBuffer.append(TEXT_2);
    stringBuffer.append(agent.getName());
    stringBuffer.append(TEXT_3);
    return stringBuffer.toString();
  }
}
