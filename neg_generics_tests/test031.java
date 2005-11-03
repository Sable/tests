package test;
// Valid Parameterized Type Declaration
public class X<A1, A2, A3, A4> {
}
// Invalid Valid Type Syntax (not enough parameters)
class Y {
	X<String, Number, Integer> x;
}
