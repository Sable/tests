package name.panitz.crempel.util;

import java.util.Iterator;

public class FromTo implements Iterable<Integer>,Iterator<Integer>{
  private final int to; 
  private int from; 
  public FromTo(int f,int t){to=t;from=f;}
  public boolean hasNext(){return from<=to;}
  public Integer next(){int result = from;from=from+1;return result;}
  public Iterator<Integer> iterator(){return this;}
  public void remove(){new UnsupportedOperationException();}
}