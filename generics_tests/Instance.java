public class Instance<X> {

    void foo(Object y){
        if (y instanceof Instance<Integer>){}
    }
}
