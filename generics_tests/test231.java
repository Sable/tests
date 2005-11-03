//import p.MMM;
//import p.NNN;

interface RRR< A extends MMM<A, B>, B extends NNN> {}

class J1 implements MMM<J1, J2> { }
class J2 implements NNN { }

class J3 implements RRR<J1,J2> {} 

public class test231 {
  public static void main(String[] args) {
    J3 thing = null;
  }
}
interface MMM< F extends MMM<F,G>, G extends NNN> { }
interface NNN{}

