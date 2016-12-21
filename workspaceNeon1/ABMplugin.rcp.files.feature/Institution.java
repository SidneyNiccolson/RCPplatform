package JETTemplates;

public class Institution
{
  protected static String nl;
  public static synchronized Institution create(String lineSeparator)
  {
    nl = lineSeparator;
    Institution result = new Institution();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package constitutionalStructure;" + NL + "" + NL + "public abstract class Institution {" + NL + "\tpublic static String deonticType; //obligation, permission, prohibition" + NL + "\tpublic static String type; // norm, sharedStrategy, rule" + NL + "\t" + NL + "\tpublic static boolean institutionCondition(){" + NL + "\t\treturn true;" + NL + "\t}" + NL + "\t" + NL + "\tpublic static void performSanction(Agent agent){" + NL + "\t\t" + NL + "\t}" + NL + "\t" + NL + "}";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
