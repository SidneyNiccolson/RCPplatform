package JETTemplates;

public class CSVUtils
{
  protected static String nl;
  public static synchronized CSVUtils create(String lineSeparator)
  {
    nl = lineSeparator;
    CSVUtils result = new CSVUtils();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "package evaluativeStructure;" + NL + "import java.io.IOException;" + NL + "import java.io.Writer;" + NL + "import java.util.List;" + NL + "" + NL + "public class CSVUtils {" + NL + "" + NL + "    private static final char DEFAULT_SEPARATOR = ',';" + NL + "" + NL + "    public static void writeLine(Writer w, List<String> values) throws IOException {" + NL + "        writeLine(w, values, DEFAULT_SEPARATOR, ' ');" + NL + "    }" + NL + "" + NL + "    public static void writeLine(Writer w, List<String> values, char separators) throws IOException {" + NL + "        writeLine(w, values, separators, ' ');" + NL + "    }" + NL + "" + NL + "    //https://tools.ietf.org/html/rfc4180" + NL + "    private static String followCVSformat(String value) {" + NL + "" + NL + "        String result = value;" + NL + "        if (result.contains(\"\\\"\")) {" + NL + "            result = result.replace(\"\\\"\", \"\\\"\\\"\");" + NL + "        }" + NL + "        return result;" + NL + "" + NL + "    }" + NL + "" + NL + "    public static void writeLine(Writer w, List<String> values, char separators, char customQuote) throws IOException {" + NL + "" + NL + "        boolean first = true;" + NL + "" + NL + "        //default customQuote is empty" + NL + "" + NL + "        if (separators == ' ') {" + NL + "            separators = DEFAULT_SEPARATOR;" + NL + "        }" + NL + "" + NL + "        StringBuilder sb = new StringBuilder();" + NL + "        for (String value : values) {" + NL + "            if (!first) {" + NL + "                sb.append(separators);" + NL + "            }" + NL + "            if (customQuote == ' ') {" + NL + "                sb.append(followCVSformat(value));" + NL + "            } else {" + NL + "                sb.append(customQuote).append(followCVSformat(value)).append(customQuote);" + NL + "            }" + NL + "" + NL + "            first = false;" + NL + "        }" + NL + "        sb.append(\"\\n\");" + NL + "        w.append(sb.toString());" + NL + "" + NL + "" + NL + "    }" + NL + "" + NL + "}";

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(TEXT_1);
    return stringBuffer.toString();
  }
}
