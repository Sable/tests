package name.panitz.java15;

public class VarParams{
  static public String append(String... args){
    String result="";
    for (String a:args)
      result=result+a;
    return result;
  }

  public static void main(String [] _){
    System.out.println(append("hello"," ","world"));
  }
}