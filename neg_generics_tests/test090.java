public class test090 {
    
    public static void main(String[] args) {
        Atest090<test090> ax = new Atest090<test090>(new test090());
        Atest090<String> as = new Atest090<String>("SUCCESS");
        Atest090<test090> a = bar(ax, as);
	}
    public static <T,U> T bar(Atest090<?> a, Atest090<? super U> b) {
		return a.get();
    }    
}
class Atest090<E> {
	 E e;
    Atest090(E e) { this.e = e; }
    E get() { return this.e; }
}
