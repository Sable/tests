import java.lang.annotation.Target;

@Target(Element)
public @interface test045 {
	
	boolean UML() default false;
	boolean platformDependent() default true;
	boolean OSDependent() default true;
}
