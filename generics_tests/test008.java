public class test008 <T extends String> {
    test008(T t) {
        System.out.println(t);
    }
    
    public static void main(String[] args) {
       new test008<String>("SUCCESS");
    }
}
