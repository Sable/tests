@interface I {
	int hashCode();
	Object clone();
}

public class test032 {
    @I(hashCode = 0) public void foo(){
    }
}
