import java.io.Serializable;

public class test268 {
	public test268() {
		String[] strings = new String[]{"test"};

		// this fails
		Object obj = ClassB.doSomething((String) strings[0]);

		// this works fine
		String intermediate = ClassB.doSomething((String) strings[0]);
		Object obj1 = intermediate;
	}
}

class ClassB {
	public static <T extends Serializable> T doSomething(String value) {
		return (T) value;
	}
}
