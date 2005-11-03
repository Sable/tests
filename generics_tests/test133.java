import java.util.Vector;
public class test133 {
  public static void main(String[] args){
    Vector<Integer[]> v = new Vector<Integer[]>();
    Integer[] array1 = new Integer[5];
    array1[0] = new Integer(17);
    array1[1] = new Integer(42);
    v.add(array1);
    Integer twentyfour = v.get(0)[1];  // responsible for the crash
    System.out.println(twentyfour);
  }
}