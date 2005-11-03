import java.util.*;

public class Assigns<T> {

    public void foo(){
    
        ArrayList x = new ArrayList();
        ArrayList y = new ArrayList<String>();
        ArrayList<String> z = new ArrayList<String>();
        ArrayList<ArrayList<String>> l = new ArrayList<ArrayList<String>>();
        //ArrayList<Object> i = new ArrayList<String>();
        //ArrayList<String> w = new ArrayList<Integer>();
        ArrayList<?> a = new ArrayList<String>();
        ArrayList<?> b = new ArrayList<Integer>();
        ArrayList<? extends MyClass> c = new ArrayList<MyExtendedClass>();
        ArrayList<? extends MyClass> d = new ArrayList<MyClass>();
        //ArrayList<? extends MyClass> j = new ArrayList<String>();
        ArrayList<? extends MyClass> e = new ArrayList();
        ArrayList<? super MyExtendedClass> f = new ArrayList<MyClass>();    
        ArrayList<? super MyExtendedClass> g = new ArrayList<MyExtendedClass>();    
        //ArrayList<? super MyExtendedClass> k = new ArrayList<Integer>();    
        ArrayList<? super MyExtendedClass> h = new ArrayList();

        //ArrayList<?> m = new ArrayList<?>();
        ArrayList<T> m = new ArrayList<T>();
        ArrayList<? extends T> o = new ArrayList<T>();
        ArrayList<? super T> p = new ArrayList<T>();
        ArrayList<String> n = new ArrayList<String>();
        boo(n);
    }

    public <S> void boo(ArrayList<? extends S> x){
    }
}
class MyClass {}
class MyExtendedClass extends MyClass {}
