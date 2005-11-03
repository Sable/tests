public class test180 {}

interface A<M extends test180>{}
interface B<M extends test180> extends A<M> {}
class C implements B<test180>{}
class D implements A<test180>{}
