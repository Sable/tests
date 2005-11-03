interface IMyInterface {
}
class MyClass <Type> {

	public <Type> Type myMethod(Object obj, Class type) {
		return null;
	}
	public static <Type> Type myStaticMethod(Object obj, Class type) {
		return null;
	}
}
public class test185 {
    public IMyInterface getThis() {
		if (true)
			return new MyClass().myMethod(this, IMyInterface.class);
		else
			return MyClass.myStaticMethod(this, IMyInterface.class);
    }
}
