public class test186 { 
	
	void foo1(Mtest186<? extends Mtest186> target, Mtest186<Mtest186<String>> value) {
		target= value; // foo1
	}
	void foo2(Mtest186<?> target, Mtest186<Mtest186<String>> value) {
		target= value; // foo2
	}
	void foo3(Mtest186<? super Mtest186> target, Mtest186<Mtest186<String>> value) {
		target= value; // foo3
	}
}

class Mtest186<E> {
}
