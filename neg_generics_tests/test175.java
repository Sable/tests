import java.util.List;
public class test175 extends test1752 {
	void foo(List<test175> lx) { }
	void bar(){
		this.foo((List)null);
	}
}

abstract class test1752 {
	void foo(List<Object> lo) { }
}