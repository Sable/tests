import java.util.List;
public class test231<T> {
    Zork z;
    List<T> list;
    void add(Object abs) {
        list.add((T) list.get(0)); // checked cast
        list.add((T) abs); // unchecked cast
    }
    void bar(List<? extends T> other) {
    	list.add((T) other.get(0)); // checked cast
    }
    void baz(List<? super T> other) {
    	list.add((T) other.get(0)); // unchecked cast
    }
}
