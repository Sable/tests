import java.lang.annotation.Annotation;
import java.util.Arrays;

@interface Ann {
}

interface Iface extends Ann {
}

abstract class Klass implements Ann {
}

class SubKlass extends Klass {
	public Class<? extends Annotation> annotationType() {
		return null;
	}
}

public class test082 {
	public static void main(String[] args) {
		Class c = SubKlass.class;
		System.out.print("Classes:");
		while (c != Object.class) {
			System.out.print("-> " + c.getName());
			c = c.getSuperclass();
		}

		System.out.print(", Interfaces:");
		c = SubKlass.class;
		while (c != Object.class) {
			Class[] i = c.getInterfaces();
			System.out.print("-> " + Arrays.asList(i));
			c = c.getSuperclass();
		}
	}
}
