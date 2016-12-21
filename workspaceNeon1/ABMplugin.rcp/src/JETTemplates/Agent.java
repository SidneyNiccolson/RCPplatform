package JETTemplates;

public class Agent
{
  protected static String nl;
  public static synchronized Agent create(String lineSeparator)
  {
    nl = lineSeparator;
    Agent result = new Agent();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package collectiveStructure;" + NL + "import constitutionalStructure.Role;" + NL + "public abstract class Agent {" + NL + "\tint id;" + NL + "\tint plan;" + NL + "\tint step;" + NL + "\tpublic void setID(Integer myID){" + NL + "\t\tid = myID;" + NL + "\t}" + NL + "\tpublic Integer getID(){" + NL + "\t\treturn id;" + NL + "\t}" + NL + "\tpublic boolean assignRole(Role role){" + NL + "\t\treturn true;" + NL + "\t}" + NL + "\tpublic boolean decision(){" + NL + "\t\treturn true;" + NL + "\t}" + NL + "}";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
