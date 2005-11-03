package name.panitz.crempel.util;
public class Nothing<a> implements Maybe<a>{

  public String toString(){return "Nothing("+")";}
  public boolean equals(Object other){
    return (other instanceof Nothing);
  }
}