public class test139 { 
    void foo() {
      Mtest139<Class<? extends Object>> mx2 = new Mtest139<Class>(); // wrong
      Mtest139<Class<? extends Object>> mx3 = new Mtest139<Class<? extends String>>(); // wrong
      Mtest139<Class<? extends Object>> mx4 = new Mtest139<Class<String>>(); // wrong
      Mtest139<? extends Class> mx5 = new Mtest139<Class>(); // ok
      Mtest139<? super Class> mx6 = new Mtest139<Class>(); // ok
      Mtest139<Class<? extends Class>> mx7 = new Mtest139<Class<Class>>(); // wrong
      Mtest139<Mtest139<? extends Class>> mx8 = new Mtest139<Mtest139<Class>>(); // wrong
    }
}

class Mtest139<E> {
}
