public class SimpleInner<T> {

    T t;

    SimpleInner(T t) {
        this.t = t;
    }
    
    public void foo(){
        new SimpleInner<String>("j"){
      
            String s = t;
        };
    }
}
