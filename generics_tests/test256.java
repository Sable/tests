public class test256<T> {
	protected InnerType valueWrapper;
	protected class InnerType {
		private T value;
		protected InnerType(T value) {
			this.value = value;
		}
	}
	public test256(T value) {
		/*
		 * This constructor exists only to show that the usage of the inner
		 * class within its enclosing class makes no problems
		 */
		this.valueWrapper = new InnerType(value);
	}
	protected test256() {
		// Provided for the convenience of subclasses
	}
}
