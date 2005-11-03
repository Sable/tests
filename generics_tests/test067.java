public class test067 extends Atest067<String>{
    
    String foo(String s) {
        System.out.println(s);
        return s;
    }
	public static void main(String[] args) {
	   new test067().bar("SUCCESS");
    }    	
}
class Atest067<T> {
    T foo(T t) {
        return null;
    }
    void bar(T t) {
        foo(t);
    }
}
