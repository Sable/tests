package name.panitz.crempel.util;

public class Just<a> implements Maybe<a>{
  private a just;

  public Just(a just){this.just = just;}
  public a getJust(){return just;}

  public String toString(){return "Just("+just+")";}
  public boolean equals(Object other){
    if (!(other instanceof Just)) return false;
    final Just o= (Just) other;
    return just.equals(o.just);
  }
}