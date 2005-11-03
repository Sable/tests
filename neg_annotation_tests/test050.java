import java.lang.annotation.Annotation;
import java.util.Arrays;

@interface Ann {
	int foo();
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

class AnnImpl implements Ann {
    public boolean equals(Object obj) { return false; }
    public int hashCode() { return 0; }
    public String toString() { return null; }
    public Class<? extends Annotation> annotationType() { return null; }
    public int foo() { return 0; }
}

public class test050 {
	public static void main(String[] args) {
		Class c = SubKlass.class;
		System.out.println("Classes:");
		while (c != Object.class) {
			System.out.println("-> " + c.getName());
			c = c.getSuperclass();
		}

		System.out.println();
		System.out.println("Interfaces:");
		c = SubKlass.class;
		while (c != Object.class) {
			Class[] i = c.getInterfaces();
			System.out.println("-> " + Arrays.asList(i));
			c = c.getSuperclass();
		}
	}
}
