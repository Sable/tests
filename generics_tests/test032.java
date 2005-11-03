public class test032<T> {
    
    public static void main(String[] args) {
        Atest032 ax = new Atest032();
        Atest032 ax2 = ax.p;
        Atest032 ax3 = new Atest032<String>();
        System.out.println("SUCCESS");
    }
}

class Atest032 <P> {
    Atest032<P> p;
}
