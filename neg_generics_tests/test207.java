import java.util.List;
interface IDoubles { List<Double> getList(); }
class A implements IDoubles {
	public List<String> getList() { return null; }
}
class B {
	 public List<String> getList() { return null; }
}
class C extends B implements IDoubles {
	void use() { List<String> l= getList(); }
}
