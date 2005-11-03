import java.util.HashMap;
import java.util.Map;
public class test126 {
    static final Map<String, Class<? extends Object>> classes 
            = new HashMap<String, Class<? extends Object>>();
    
    static final Map<String, Class<? extends Object>> classes2 
            = new HashMap<String, Class>();
    
    class Mtest126<E> {
    	E get() { return null; }
    	void foo(E e) {}
    }
    
    void foo() {
    	Mtest126<Class<? extends Object>> mx1 = new Mtest126<Class<? extends Object>>();
    	Mtest126<Class> mx2 = new Mtest126<Class>();
    	mx1.foo(mx2.get());
    }
}
