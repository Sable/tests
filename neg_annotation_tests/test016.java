@interface Name {
	String first();
	String last();
}
@interface Author {
	Name name();
}
public class test016 {
	
	@Author(name = @Name(first="Bill", last="Yboy", last="dup")) 
	void foo() {
	}
}
