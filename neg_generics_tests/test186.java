class MyClass<T> {
		 
		 private T thing;
       { Zork z; }
		 
		 public
		 MyClass(T thing) {
		 		 this.thing = thing;
		 }
		 
		 public static <U> MyClass<U>
		 factoryMakeMyClass(U thing)		 {
		 		 return new MyClass<U>(thing);
		 }
}

class External {

		 public static <U> MyClass<U>
		 factoryMakeMyClass(U thing)		 {
		 		 return new MyClass<U>(thing);
		 }
}

public class test186 {
		 public static void
		 test()
		 {
		 		 // No problem with this line:
		 		 MyClass<String> foo = External.factoryMakeMyClass("hi");
		 		 
		 		 // This line gives me an error:
		 		 // Type mismatch: cannot convert from MyClass<Object> to MyClass<String>
		 		 MyClass<String> bar = MyClass.factoryMakeMyClass("hi");
		 		 MyClass<String> bar2 = MyClass.<String>factoryMakeMyClass("hi");
		 }
}
