public @interface test002 {
	Bar value();
}

@interface Bar {
	test002 value();
}
