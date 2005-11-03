interface M<test167> { }

class N<C> { 
  M<N<C>> pni = null;
}

public class test167<I> {
  N<I> var1 = null;

  M<N<I>> var2 = var1.pni;
  // Above line reports as error in Eclipse. 
  // "var2" is underlined and the error message is: 
  // Type mismatch: cannot convert from M<N<C>> to M<N<I>>
}
