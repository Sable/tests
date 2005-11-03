public class test138 { 
    class Mtest138<E> {
    }
    void foo() {
      Mtest138<Class<? extends Object>> mx2 = new Mtest138<Class>();
    }
}
