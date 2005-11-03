import sep.util.io.ReaderIterator;
import java.io.FileReader;

class TestReaderIterator {
  public static void main(String [] args) throws Exception{
      Iterable<Character> it
        =new ReaderIterator(new FileReader(args[0]));
      for (Character c:it){
      System.out.print(c);
    }
  }
}