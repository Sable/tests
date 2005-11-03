public class test052 <T>{
    public static void main(String[] args) {
        
        String s = new test052<String>().foo("SUCCESS");
	}
    <U extends String> T foo (U u) {
        System.out.println(u);
        return null;
    }
}
