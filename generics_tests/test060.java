import java.util.ArrayList;
import java.util.List;

public class test060 <T extends List> { 
    T t;
    public static void main(String[] args) {
        foo(new test060<ArrayList>().set(new ArrayList<String>()));
        System.out.println("SUCCESS");
    }
    test060<T> set(T t) {
        this.t = t;
        return this;
    }
    T get() { 
        return this.t; 
    }
    
    static void foo(test060<? super ArrayList> za) {
        za.get().isEmpty();
    }
}
