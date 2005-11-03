package test;
// Valid Parameterized Type Declaration
public class test032<A1, A2> {
}
// Invalid Valid Type Syntax (too many parameters)
class Y {
	test032<String, Number, Integer> x;
}
