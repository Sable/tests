import java.util.*;
import java.util.List;

class TextUtils {

  static List<String> words (String s){
    final List<String> result = new ArrayList<String>();

    StringBuffer currentWord = new StringBuffer();

    for (char c:s.toCharArray()){
      if (Character.isWhitespace(c)){
        final String newWord = currentWord.toString().trim();
        if(newWord.length()>0){
          result.add(newWord);
          currentWord=new StringBuffer();
        }
      }else{currentWord.append(c);} 
    }
    return result;
  }

  static String unwords(List<String> xs){
    StringBuffer result=new StringBuffer();
    for (String x:xs) result.append(" "+x);
    return result.toString().trim();
  }

  public static void main(String []_){
    List<String> xs = words("  the   world  is my Oyster  ");

    for (String x:xs) System.out.println(x);

    System.out.println(unwords(xs));
  }
}