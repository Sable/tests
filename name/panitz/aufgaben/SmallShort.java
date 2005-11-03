package name.panitz.aufgaben;
public class SmallShort implements Smaller<String> {
  public boolean le(String x1,String x2){
    return x1.length()<=x2.length();
  }
}