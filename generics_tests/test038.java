public class test038<Tx1 extends S, Tx2 extends C>  extends test038S<Tx2> {

    public static void main(String[] args) {
        I w = new test038<S,I>().get(new I());
        System.out.println("SUCCESS");
    }
}
class S {}
class I implements C<I> {}
interface C<Tc> {}
class test038S <Txs> {
    Txs get(Txs t) {
        return t;
    }
}
