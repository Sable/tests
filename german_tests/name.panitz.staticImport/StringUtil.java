package name.panitz.staticImport;
public class StringUtil {
  static public String reverse(String arg) {
    StringBuffer result = new StringBuffer();
    for (char c:arg.toCharArray()) result.insert(0,c);
    return result.toString();
  }
}