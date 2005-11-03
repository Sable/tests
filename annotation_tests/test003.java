@interface Name {
	String first();
	String last();
}
@interface Author {
	Name name();
}
public class test003 {
	
	@Author(name = @Name(first="Bill", last="Yboy")) 
	void foo() {
	}
}
