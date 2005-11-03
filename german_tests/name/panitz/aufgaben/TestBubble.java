package name.panitz.aufgaben;
public class TestBubble{
  public static void main(String [] _){
    String [] xs = {"1","4444","22","55555","","333"};
    System.out.print("[");
    for (String x:xs)System.out.print(","+x);
    System.out.println("]");
    Bubble.bubbleSort(xs,new SmallShort());
    System.out.print("[");
    for (String x:xs)System.out.print(","+x);
    System.out.println("]");

    int [] ys_ = {2,3,4,5,6,7,78,8,8};
    Integer [] ys = new Integer[9];
    for (int i=0;i<9;i++) ys[i]=new Integer(ys_[i]);
    System.out.print("[");
    for (Integer x:ys)System.out.print(","+x);
    System.out.println("]");
    Bubble.bubbleSort(ys,new SmallEven());
    System.out.print("[");
    for (Integer x:ys)System.out.print(","+x);
    System.out.println("]");
  }
}