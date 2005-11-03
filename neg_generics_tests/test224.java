public class test224 {
   Zork z;
	public static void foo() {
		class A<T extends Number> {
			T t = null;
			T get() {
				return t;
			}
		}
		A<Long> a = new A<Long>() {
			@Override
			Long get() {
				return new Long(5);
			}
		};
	}
}
