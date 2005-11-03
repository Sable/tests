@interface Y {
	int id() default 8;
	Class type();
}
public @interface test031 {
	Y value() default @Y(id=10,type=Object.class);
}