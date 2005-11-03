package name.panitz.crempel.util;

public class Tuple1<t1> {
  public t1 e1;
  public Tuple1(t1 a1){e1=a1;}
  String parenthes(Object o){return "("+o+")";}
  String simpleToString(){return e1.toString();}
  public String toString(){return parenthes(simpleToString());}
  public boolean equals(Object other){
    if (! (other instanceof Tuple1)) return false;
    return e1.equals(((Tuple1)other).e1);
  }
}