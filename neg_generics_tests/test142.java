public class test142 { 
    static class A {
    }
    A test() throws Exception {
        Class<? extends Object> clazz = null;
        return clazz.newInstance(); // ? extends Object
    }
}
