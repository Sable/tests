public class test004 <T> {
    
    T ok1;
    static {
        T wrong1;
    }
    static void foo(T wrong2) {
		T wrong3;
    }
    class Mtest004 extends T {
        T ok2;
    }
    static class SMtest004 extends T {
        T wrong4;
    }
}
