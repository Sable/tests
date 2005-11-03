package name.panitz.enums;
public class IterTage {
  public static void main(String [] _){
    for (Tage tag:Tage.values()) 
      System.out.println(tag.ordinal()+": "+tag);
  }
}