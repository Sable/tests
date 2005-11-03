@interface Name {
	String first();
	String last();
}
@interface Author {
	Name name();
}
@Author(@Name(first="Joe",last="Hacker")) 
public class test015 {
	
	@Author(name = @Name(first="Bill", last="Yboy")) 
	void foo() {
	}
}
