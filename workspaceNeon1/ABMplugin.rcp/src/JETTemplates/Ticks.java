package JETTemplates;

public class Ticks
{
  protected static String nl;
  public static synchronized Ticks create(String lineSeparator)
  {
    nl = lineSeparator;
    Ticks result = new Ticks();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package operationalStructure;" + NL + "" + NL + "public class Ticks {" + NL + "\tpublic static int Tick = 0;" + NL + "\tpublic static int getTick(){" + NL + "\t\treturn Tick;" + NL + "\t}" + NL + "\tpublic static void setTick(int value){" + NL + "\t\tTick = value;" + NL + "\t}" + NL + "}" + NL;
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
