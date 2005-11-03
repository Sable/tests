@interface Nested {
	String name() default "Hans";
	N2 nest();
}
@interface N2 {
	Nested n2() default @Nested(name="Haus", nest= @N2);
}
