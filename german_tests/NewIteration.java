import java.util.List;
import java.util.ArrayList;

class NewIteration{

  public static void main(String [] _){
    String [] ar
     = {"Brecht","Horvath","Shakespeare","Schimmelpfennig"};
    List<String> xs = new ArrayList<String>();

    for (String s:ar) xs.add(s); 
    for (String s:xs) System.out.println(s.toUpperCase());
  }
}