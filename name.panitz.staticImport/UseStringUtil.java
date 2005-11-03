package name.panitz.staticImport;
import static name.panitz.staticImport.StringUtil.*;
public class UseStringUtil {
  static public void main(String [] args) {
    for (String arg:args) 
     System.out.println(reverse(arg));
  }
}