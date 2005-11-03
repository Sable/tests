public class test003 <T extends String> {
    T foo(T t) {
        return t;
    }
    
    public static void main(String[] args) {
        String s = new test003<String>().foo("SUCCESS");
        System.out.println(s);
    }
}
