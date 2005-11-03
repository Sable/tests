class test208 <R,U,V, T> {
	private U u;
	private V v;
	public test208(U u,V v) { this.u= u; this.v= v; }
	public R getU() { return (R)u; } // Warning
	public R getV() { return (R)v; } // Warning
	Object o;
	public T getT() { return (T)o; } // Warning
}