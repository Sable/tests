enum E {
	CONST1
}
@interface test027 {
	E value() default E.CONST1;
}