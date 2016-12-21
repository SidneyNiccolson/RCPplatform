package JETTemplates;

public class PhysicalComponent
{
  protected static String nl;
  public static synchronized PhysicalComponent create(String lineSeparator)
  {
    nl = lineSeparator;
    PhysicalComponent result = new PhysicalComponent();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package physicalStructure;" + NL + "" + NL + "public abstract class  PhysicalComponent {" + NL + "\tint id;" + NL + "\tString type; //fenced or open " + NL + "}" + NL;
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
