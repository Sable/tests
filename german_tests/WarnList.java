import java.util.*;
import java.util.List;
class WarnTest{
  public static void main(String [] _){
    List xs = new ArrayList<String>();
    xs.add("Schimmelpfennig");
    xs.add("Shakespeare");
    xs.add("Horvath");
    xs.add("Brecht");
    String x2 = (String)xs.get(1);
    System.out.println(xs);
  }
}