public class test180 <T> {
	void foo1() {
		test180<String>.Item<Thread> i = new test180<Exception>().new Item<Thread>();
	}
	void foo2() {
		test180<Exception>.Item<Thread> j = new test180<Exception>.Item<Thread>();
	}
	void foo3() {
		test180.Item k = new test180.Item();
	}
	static void foo4() {
		test180.Item k = new test180.Item();
	}
	class Item <E> {}
}
