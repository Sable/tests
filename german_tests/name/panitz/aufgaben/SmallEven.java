package name.panitz.aufgaben;
public class SmallEven implements Smaller<Integer> {
  public boolean le(Integer x1,Integer x2){
    if (x1%2 != x2%2){return x1%2==0;};
    return x1<=x2;
  }
}