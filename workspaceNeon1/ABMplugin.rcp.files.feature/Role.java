package JETTemplates;

public class Role
{
  protected static String nl;
  public static synchronized Role create(String lineSeparator)
  {
    nl = lineSeparator;
    Role result = new Role();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package constitutionalStructure;" + NL + "" + NL + "public abstract class Role {" + NL + "\tpublic static boolean entryCondition(Agent agent){" + NL + "\t\treturn true;" + NL + "\t}" + NL + "}" + NL;
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
