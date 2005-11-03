public class test097 {

    public static void main(String[] args) {
        Comparable<?> c1 = foo("", new Integer(5));
        Object o = foo("", 5);
    }
    public static <T> T foo(T t1, T t2) { 
    	System.out.print("foo("+t1.getClass().getSimpleName()+","+t2.getClass().getSimpleName()+")");
    	return null; 
    }
}
