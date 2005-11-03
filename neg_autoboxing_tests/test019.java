public class test019 {
    <T> T foo(T t) { return t; }
    
    public static void main(String[] args) {
        int i = new test019().foo(12);
        System.out.println(i);
    }
    Zork z;
}
