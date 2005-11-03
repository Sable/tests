package test;
// Valid Parameterized Type Declaration
public class X<A1, A2, A3, A4, A5, A6, A7> {
}
// Invalid Valid Type Syntax (primitive cannot be parameters)
class Y {
	X<int, short, long, float, double, boolean, char> x;
}
