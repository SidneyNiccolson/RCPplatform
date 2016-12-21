package JETTemplates;

public class Objective
{
  protected static String nl;
  public static synchronized Objective create(String lineSeparator)
  {
    nl = lineSeparator;
    Objective result = new Objective();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "package constitutionalStructure;" + NL + "" + NL + "public abstract class Objective {" + NL + "\t" + NL + "\t//these are automatically generated fields that are not shown to the modeller, but affect the decision making of the agents.  ComplianceLevel starts from 10 and with every none compliance to a norm or a rule which " + NL + "does not have permission as its deontic, this value is decreased. In the decision making process, if" + NL + "\t//this value is below 5, it increases the chance of compliance to the norm he is looking at. " + NL + "\tpublic int complianceLevel;" + NL + "\tpublic int threshold; // the level of compliance should not go below this value" + NL + "\t" + NL + "\t" + NL + "\t//automatically generated constructor, the modeller does not need to fill in this part in the gui" + NL + "\tpublic Objective() {" + NL + "\t\tsuper();" + NL + "\t\tthis.complianceLevel = 10;" + NL + "\t\tthis.threshold = 5;" + NL + "\t}" + NL + "\t" + NL + "\t//overridden method" + NL + "\tpublic boolean objectiveMet(){" + NL + "\t\t" + NL + "\t\t// the condition to meet the objective is placed here in the inheriting class" + NL + "\t\treturn true;" + NL + "\t}" + NL + "\t" + NL + "\t// automatically generated, not the modelller" + NL + "\tpublic static void increaseComplianceLevel(Objective objective){" + NL + "\t\t// to update the objective by increasing the level of compliance" + NL + "\t\tobjective.complianceLevel ++;" + NL + "\t}" + NL + "\t//automatically generated, not the modeller" + NL + "\tpublic static void decreaseComplianceLevel(Objective objective){" + NL + "\t\t// to update the objective by decreasing the level of compliance" + NL + "\t\tobjective.complianceLevel --;" + NL + "\t}" + NL + "\t//getters and setters automatically generated" + NL + "" + NL + "\tpublic void setComplianceLevel(int complianceLevel) {" + NL + "\t\tthis.complianceLevel = complianceLevel;" + NL + "\t}" + NL + "" + NL + "\tpublic int getComplianceLevel() {" + NL + "\t\treturn complianceLevel;" + NL + "\t}" + NL + "" + NL + "\tpublic int getThreshold() {" + NL + "\t\treturn threshold;" + NL + "\t}" + NL + "" + NL + "\tpublic void setThreshold(int threshold) {" + NL + "\t\tthis.threshold = threshold;" + NL + "\t}" + NL + "\t" + NL + "}" + NL;
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
