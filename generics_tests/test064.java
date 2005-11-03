public class test064 {
    public static void main(String[] args) {
        Class<? extends test064> xx = null;
        Class<? extends Object> xo = xx;
        test064 x = get(xx);
        System.out.println("SUCCESS");
    }
    static <P> P get(Class<P> cp) {
        return null;
    }
}
