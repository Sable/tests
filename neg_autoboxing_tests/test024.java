public class test024 {
	public static void main(String[] args) {
		boolean b = true;
		Character _Character = new Character(' ');
		char c = ' ';
		Integer _Integer = new Integer(2);
		if ((b ? _Character : _Integer) == c) {
			System.out.println(zork);
		} else {
			System.out.println("FAILURE");
		}
	}
}
