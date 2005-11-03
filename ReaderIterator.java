package sep.util.io;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;


public class ReaderIterator 
              implements Iterable<Character>
                        ,Iterator<Character>{
  private Reader reader;
  private int n;
  public ReaderIterator(Reader r){
    reader=new BufferedReader(r);
    try{n=reader.read();
    }catch(IOException _){n=-1;}
  }
  public Character next(){
    Character result = new Character((char)n);   
    try{n=reader.read();
    }catch(IOException _){n=-1;}
    return result;
  }

  public boolean hasNext(){
    return n!=-1;
  }

  public void remove(){
    throw new UnsupportedOperationException();
  }

  public Iterator<Character> iterator(){return this;}
}