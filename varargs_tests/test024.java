public class test024 {
	String[] args;
	public test024(String... args) {
		this.args = args;
	}
	public static test024 foo() {
		return new test024("SU", "C", "CE", "SS"){};
	}
	public String bar() {
		if (this.args != null) {
			StringBuffer buffer = new StringBuffer();
			for (String s : this.args) {
				buffer.append(s);
			}
			return String.valueOf(buffer);
		}
		return null;
	}
	public static void main(String[] args) {
		System.out.print(foo().bar());
	}
}
