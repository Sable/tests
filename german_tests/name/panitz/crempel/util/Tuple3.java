package name.panitz.crempel.util;

public class Tuple3<t1,t2,t3> extends Tuple2<t1,t2>{
  public t3 e3;
  public Tuple3(t1 a1,t2 a2,t3 a3){super(a1,a2);e3=a3;}
  String simpleToString(){
    return super.simpleToString()+","+e3.toString();}
  public boolean equals(Object other){
    if (! (other instanceof Tuple3)) return false;
    return super.equals(other)&& e3.equals(((Tuple3)other).e3);
  }
}