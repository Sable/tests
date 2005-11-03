import java.util.*;
public class test116 {
 public static void main(String[] args) {
  test116 x = new test116();
  System.out.print("S" + x.a() + "U" + x.b().get(0) + "C" + x.a() + "C");
  System.out.println(new StringBuilder("E").append(x.a()).append("S").append(x.b().get(0)).append("S").append(x.a()).append("!"));  
 }
 String a() { return ""; }
 List<String> b() { 
  ArrayList<String> als = new ArrayList<String>(1);
  als.add(a());
  return als;
 }
}
