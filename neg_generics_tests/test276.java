class Base<T> {
	class InnerBase {
		java.util.List<String> list;
	}
  Zork z;
}

public class test276 extends Base<Integer> {
	class InnerDerived extends InnerBase {
		void method() {
			list.add("Hi"); // Warning on this method call
		}
	}
}
