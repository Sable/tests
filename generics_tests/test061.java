import java.util.ArrayList;
import java.util.List;

public class test061 <T extends List> { 
    T t;
    public static void main(String[] args) {
        foo(new test061<ArrayList>().set(new ArrayList<String>()));
        System.out.println("SUCCESS");
    }
    test061<T> set(T t) {
        this.t = t;
        return this;
    }
    T get() { 
        return this.t; 
    }
    
    static void foo(test061<? extends ArrayList> za) {
        za.get().isEmpty();
    }
}
