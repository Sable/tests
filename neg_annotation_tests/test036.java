class Further {
	void bar() {}
}

class Other extends Further {
}

interface Baz {
	void baz();
}

public class test036 extends Other implements Baz {
	@Override
	void foo() {}
	@Override
	void bar() {}
	@Override
	public void baz() {}
}
