class test229 <T extends Y & Comparable<Z>> {}
abstract class Y extends Z {}
abstract class Z implements Comparable<Z> {}