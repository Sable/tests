public class test037<T> {
    public static void main(String[] args) {
        Atest037 ax = new Atest037();
        Atest037 ax2 = new Atest037();
        ax.p = ax2.p;
        System.out.println("SUCCESS");
    }
}
class Atest037 <P> {
    Atest037<P> p;
}
