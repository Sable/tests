class Foo {
	public interface Model {
	}
	public interface View<M extends Model> {
		M getTarget() ;
	}
}
class Bar {
	public interface Model extends Foo.Model {
	}
	public interface View<M extends Model> extends Foo.View<M> {
	}
}
public class test237 {
	public void baz() {
		Bar.View<?> bv = null ;
		Bar.Model m = bv.getTarget() ;
	}
}
