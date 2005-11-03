package name.panitz.boxing;
public class AutomaticBoxing{
  public static void main(String [] _){
    int i1 = 42;
    Object o = i1;
    System.out.println(o);
    Integer i2 = 17;
    Integer i3 = 4;
    int i4 = 21;
    System.out.println((i2+i3)*i4);
  }
}