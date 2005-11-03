public class test017 <E extends Cloneable, T extends Thread & Cloneable> {
	void foo(E e){}
	void foo(T t){}
    public static void main(String[] args) {
		 System.out.println("SUCCESS");
    }
}
