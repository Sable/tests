public class test253 {
	public static <T> T choose(boolean b, T t1, T t2) {
		if (b)
			return t1;
		return t2;
	}

	public static void foo() {
		Comparable s1 = choose(true, "string", new Integer(1));
		Number s2 = choose(true, new Integer(1), new Float(2));
		Comparable s3 = choose(true, new Integer(1), new Float(2));
		Cloneable s4 = choose(true, new Integer(1), new Float(2));
		Cloneable s5 = choose(true, "string", new Integer(1));
	}
}
