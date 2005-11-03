interface C<A> { }
interface PC<test177> extends C<test177> { } 
interface PO<Y>  {  
	  C<Y> proc1();
	  C<? super Y> proc2();
	  C<? extends Y> proc3();
}
abstract class test177<Z> implements PO<Z> {
	  public C<Z> proc1() { return result1; }
	  private final PC<Z> result1 = null;
	  public C<? super Z> proc2() { return result2; }
	  private final PC<? super Z> result2 = null;
	  public C<? extends Z> proc3() { return result3; }
	  private final PC<? extends Z> result3 = null;
}
