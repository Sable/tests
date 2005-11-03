public class test137 <T> { 
	<G> T foo(G g) {
		return null;
	}
	
	public static void main(String[] args) {
		test137 rx = new test137();
		rx.<String>foo("hello");
	}
}
