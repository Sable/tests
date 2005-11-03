public class test059<T> {
    
    public static void main(String[] args) {
        Atest059 ax = new Atest059();
        Atest059 ax2 = ax.p;
        ax.p = new Atest059<String>();
        ax.q = new Atest059<String>();
        ax.r = new Atest059<Object>();
        ax.s = new Atest059<String>();
        System.out.println(ax2);
    }
}

class Atest059 <P> {
    Atest059<P> p;
    Atest059<Object> q;
    Atest059<String> r;
    Btest059<String> s;
}

class Btest059<Q> {
}
