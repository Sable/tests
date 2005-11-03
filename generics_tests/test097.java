public class test097<R,T extends Comparable<T>>{
	T test;
	public Comparable<? extends T> getThis(){
		return test;
	}
    public static void main(String [] args) {
        System.out.println("SUCCESS");
    }
}
