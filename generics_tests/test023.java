class Super {class M {}}
public class test023 extends Super {
	class N <T extends M> {}
	public static void main(String[] args) {
		System.out.println("SUCCESS");
	}
}
