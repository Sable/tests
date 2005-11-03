package name.panitz.crempel.util;

public class Tuple4<t1,t2,t3,t4> extends Tuple3<t1,t2,t3>{
  public t4 e4;
  public Tuple4(t1 a1,t2 a2,t3 a3,t4 a4){super(a1,a2,a3);e4=a4;}
  String simpleToString(){
    return super.simpleToString()+","+e4.toString();}
  public boolean equals(Object other){
    if (! (other instanceof Tuple4)) return false;
    return super.equals(other)&& e4.equals(((Tuple4)other).e4);
  }
}