import java.util.List;
public class test074 {
    public static void main(String[] args) {
        foo(new Atest074<String>("SUCCESS"));
	}
    static <V> List<V> foo(Atest074<String> a) {
        System.out.println(a.get());
        List<V> v = null;
        if (a == null) v = foo(a); 
        return v;
    }
}
class Atest074<E> {
    E e;
    Atest074(E e) { this.e = e; }
    E get() { return this.e; }
}
