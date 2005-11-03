 interface List<T> {
	 List<T> foo();
}

 class test076<T> implements List<T> {
	public List<T> foo() {
		List<T> lt = this;
		lt.bar();
		return this;
	}
}
