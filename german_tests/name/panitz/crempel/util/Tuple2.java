package name.panitz.crempel.util;

public class Tuple2<t1,t2> extends Tuple1<t1>{
  public t2 e2;
  public Tuple2(t1 a1,t2 a2){super(a1);e2=a2;}
  String simpleToString(){
    return super.simpleToString()+","+e2.toString();}
  public boolean equals(Object other){
    if (! (other instanceof Tuple2)) return false;
    return super.equals(other)&& e2.equals(((Tuple2)other).e2);
  }
}