import java.util.*;

public class test100 {
    <T> Vector<T> valuesOf(Hashtable<?, T> h) {
        return new Vector();
    }
    Vector<Object> data;
    
    public void t() {
        Vector<Object> v = (Vector<Object>) data.elementAt(0);
    }
}
