public class test001<Tx1 extends String, Tx2 extends Comparable>  extends test001S<Tx2> {

    public static void main(String[] args) {
        Integer w = new test001<String,Integer>().get(new Integer(12));
        System.out.println("SUCCESS");
    }
}
class test001S <Txs> {
    Txs get(Txs t) {
        return t;
    }
}
