import java.util.*;
import java.util.List;
class ListTest{
  public static void main(String [] _){
    List<String> xs = new ArrayList<String>();
    xs.add("Schimmelpfennig");
    xs.add("Shakespeare");
    xs.add("Horvath");
    xs.add("Brecht");
    String x2 = xs.get(1);
    System.out.println(xs);
  }
}