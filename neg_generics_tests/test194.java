public class test194 { 
	
	void bar1(Mtest194<Class<? extends String>> mxcs, Mtest194<Class<? extends Object>> mxco) {
		mxco = mxcs;
	}
	void bar1(Class<? extends String> cs, Class<? extends Object> co) {
		co = cs;
	}
	
}
class Mtest194<E> {
}
