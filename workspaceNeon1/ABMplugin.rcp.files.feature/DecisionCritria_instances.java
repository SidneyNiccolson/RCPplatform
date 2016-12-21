package JETTemplates;

public class DecisionCritria_instances
{
  protected static String nl;
  public static synchronized DecisionCritria_instances create(String lineSeparator)
  {
    nl = lineSeparator;
    DecisionCritria_instances result = new DecisionCritria_instances();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package collective;" + NL + "" + NL + "public class TransportByBikeElderyDecision extends DecisionCriterion{" + NL + "\t" + NL + "static double threshold =10.0 ;" + NL + "\t" + NL + "\tpublic static boolean condition(FamilyMember familyMember){" + NL + "\t\tif(familyMember.getAge()<50) return true;" + NL + "\t\telse return false;" + NL + "\t}" + NL + "\t" + NL + "\tpublic static double MCDAcalculation(FamilyMember familyMember){" + NL + "\t\t//personal values and properties" + NL + "\t\tdouble value = familyMember.healthValue * �weight� + familyMember.environmentSafety* �weight� +\t\tfamilyMember.getAge()*�weight� +familyMember.showOffValue *�weight�;" + NL + "\t\treturn value;\t" + NL + "\t}" + NL + "\tpublic static boolean result(FamilyMember familyMember){" + NL + "\t\tif(condition(familyMember)&& MCDAcalculation(familyMember)>threshold)" + NL + "\t\treturn true;" + NL + "\t\treturn false;" + NL + "\t}" + NL + "}";
  protected final String TEXT_2 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
	Object[] args = (Object[])argument;
	maia.collectiveStructure.MCDA decisionCriteria = (maia.collectiveStructure.MCDA)args[0];
	maia.collectiveStructure.Agent parentAgent = (maia.collectiveStructure.Agent)args[1];

    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    return stringBuffer.toString();
  }
}
