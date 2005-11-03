public class test147<T extends test147<T>> {
  	private int i = 1;
  	private int i() {return i;}
  	private static class M { private static int j = 2; }
  	public int foo(T t) { return t.i + t.i() + T.M.j; }
}
