package test;
// Invalid Consecutive Parameterized Type Declaration
public class X1<A1 extends X2<A1>>> {
	A1 a1;
}
// Valid Parameterized Type Declaration
class X2<A2> {
	A2 a2;
}
