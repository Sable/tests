public class test150<T> {
	class Member {
		class Sub {}
	}
}

class Y {
   test150.Member.Sub s;
   test150<Exception>.Member.Sub es = s;
}

