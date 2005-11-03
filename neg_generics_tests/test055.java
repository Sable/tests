public class test055<T> {
    
    public static void main(String[] args) {
        Atest055 ax = new Atest055();
        Atest055 ax2 = ax.p;
        ax.p = new Atest055<String>();
        System.out.println(ax2);
    }
}

class Atest055 <P> {
    Atest055<P> p;
}
