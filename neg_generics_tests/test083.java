public class test083 {
    public static void main(String[] args) {
        Class<? extends test083> xx = null;
        Class<? extends Object> xo = xx;
        Class<Object> xo2 = xx;
    }
}
