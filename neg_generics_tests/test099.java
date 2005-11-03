public class test099 {
    
    public static void main(String[] args) {
        Atest099<test099> ax = new Atest099<test099>(new test099());
        Atest099<String> as = new Atest099<String>("SUCCESS");
        ax = (Atest099<test099>)bar(ax);
	}
    public static <T> String bar(Atest099<?> a) {
		return null;
    }    
}
class Atest099<E> {
	 E e;
    Atest099(E e) { this.e = e; }
    E get() { return this.e; }
}
