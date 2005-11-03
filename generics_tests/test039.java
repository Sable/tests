public class test039<Tx1 extends S, Tx2 extends C>  extends test039S<Tx2> {

    public static void main(String[] args) {
        I w = new test039<S,I>().get(new I());
        System.out.println("SUCCESS");
    }
}
class S {}
class I implements C {}
interface C<Tc> {}
class test039S <Txs> {
    Txs get(Txs t) {
        return t;
    }
}
