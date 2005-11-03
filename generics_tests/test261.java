import java.util.ArrayList;
import java.util.Collection;

interface Sink<T> { 
	void flush(T t);
}
class SimpleSinkImpl<T> implements Sink<T> {
	public void flush(T t) {}
}
public class test261 {

    private <T> T writeAll(Collection<T> coll, Sink<? super T> snk) { 
        T last = null;
        for (T t : coll) { 
            last = t;
            snk.flush(last);
        }
        return last;
    }

    public void test1() {
        Sink<Object> s = new SimpleSinkImpl<Object>();
        Collection<String> cs = new ArrayList<String>();
        cs.add("hello!");
        cs.add("goodbye");
        cs.add("see you");
        
        String str = this.writeAll(cs, s);  
    }

    public static void main(String[] args) {
        test261 test = new test261();
        
        test.test1();
    }
}
