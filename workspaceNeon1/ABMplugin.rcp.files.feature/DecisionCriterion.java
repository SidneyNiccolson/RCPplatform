package JETTemplates;

public class DecisionCriterion
{
  protected static String nl;
  public static synchronized DecisionCriterion create(String lineSeparator)
  {
    nl = lineSeparator;
    DecisionCriterion result = new DecisionCriterion();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package collectiveStructure;" + NL + "" + NL + "public class DecisionCriterion {" + NL + "" + NL + "\tstatic double threshold;" + NL + "\t" + NL + "\tpublic static boolean condition(Agent agent){" + NL + "\t\treturn true;" + NL + "\t}" + NL + "\t" + NL + "\tpublic static double MCDAcalculation(Agent agent){" + NL + "\t\treturn 0;" + NL + "\t}" + NL + "\tpublic static boolean result(Agent agent){" + NL + "\t\tif(condition(agent)&& MCDAcalculation(agent)>threshold)" + NL + "\t\treturn true;" + NL + "\t\treturn false;" + NL + "\t}" + NL + "}";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
