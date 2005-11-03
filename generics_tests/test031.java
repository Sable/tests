public class test031<T> {
    
    public static void main(String[] args) {
        Atest031 ax = new Atest031();
        test031 x = (test031)ax.p;
        System.out.println(x);
    }
}

class Atest031 <P> {
    
    P p;
}
