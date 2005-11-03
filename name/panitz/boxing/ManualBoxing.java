package name.panitz.boxing;
public class ManualBoxing{
  public static void main(String [] _){
    int i1 = 42;
    Object o = new Integer(i1);
    System.out.println(o);
    Integer i2 = new Integer(17);
    Integer i3 = new Integer(4);
    int i4 = 21;
    System.out.println((i2.intValue()+i3.intValue())*i4);
  }
}