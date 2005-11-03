interface Intf<D extends Comparable<D>, I extends Comparable<D>> { 
  public void f(Intf<D,?> val);
}

public class test176 <M extends Comparable<M>, P extends Comparable<M>>  implements Intf<M,P> {

  public void f(Intf<M,?> val) { } 
}
