public class test101 {
    public static void main(String args[]) {
        Integer i = 1;
        Integer j = 2;
        Short s = 3;
        foo(args != null ? i : j);
        foo(args != null ? i : s);
    }
    static void foo(int i) {
        System.out.print("[int:"+i+"]");
    }
    static void foo(Integer i) {
        System.out.print("[Integer:"+i+"]");
    }
}
