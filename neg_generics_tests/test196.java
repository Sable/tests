public class test196 { 
	
	void foo1(Mtest196<Class<? extends Object>> target, Mtest196<Class> value) {
		target= value; // foo1 - wrong
	}
	void foo2(Mtest196<Class<? extends Object>> target, Mtest196<Class<? extends String>> value) {
		target= value; // foo2 - wrong
	}
	void foo3(Mtest196<Class<? extends Object>> target, Mtest196<Class<? extends String>> value) {
		target= value; // foo3 - wrong
	}
	void foo4(Mtest196<Class<? extends Object>> target, Mtest196<Class<String>> value) {
		target= value; // foo4 - wrong
	}
	void foo5(Mtest196<? extends Class> target, Mtest196<Class> value) {
		target= value; // foo5
	}
	void foo6(Mtest196<? super Class> target, Mtest196<Class> value) {
		target= value; // foo6
	}
	void foo7(Mtest196<Class<? extends Class>> target, Mtest196<Class<Class>> value) {
		target= value; // foo7 - wrong
	}
	void foo8(Mtest196<Mtest196<? extends Class>> target, Mtest196<Mtest196<Class>> value) {
		target= value; // foo8 - wrong
	}
	void foo9(Mtest196<? extends Object> target, Mtest196<? extends String> value) {
		target= value; // foo9
	}
	void foo10(Mtest196<? extends String> target, Mtest196<? extends Object> value) {
		target= value; // foo10 - wrong
	}
	void foo11(Mtest196<? super Object> target, Mtest196<? super String> value) {
		target= value; // foo11 - wrong
	}
	void foo12(Mtest196<? super String> target, Mtest196<? super Object> value) {
		target= value; // foo12
	}
}

class Mtest196<E> {
}
