import static java.lang.annotation.RetentionPolicy.*;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@Retention(CLASS) @interface Attr {
}

@Retention(RUNTIME) @interface Foo {
	int id() default 0;
}
@Foo(id=5) @Attr public class test074 {
	public void foo(@Foo(id=5) @Attr final int j, @Attr final int k, int n) {
	}
	
	public static void main(String[] args) {
		try {
			Class c = test074.class;
			Annotation[] annots = c.getAnnotations();
			System.out.print(annots.length);
			Method method = c.getMethod("foo", Integer.TYPE, Integer.TYPE, Integer.TYPE);
			Annotation[][] annotations = method.getParameterAnnotations();
			final int length = annotations.length;
			System.out.print(length);
			if (length == 3) {
				System.out.print(annotations[0].length);
				System.out.print(annotations[1].length);
				System.out.print(annotations[2].length);
			}
		} catch(NoSuchMethodException e) {
		}
	}
}