package JETTemplates;

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
  protected final String TEXT_1 = NL + "package constitutionalStructure;" + NL + "" + NL + "public class inspectionOfficer extends Role" + NL + "{" + NL + "}" + NL;
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
