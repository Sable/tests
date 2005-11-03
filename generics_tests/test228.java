class test228 <T extends Y & Comparable<Y>> {}
abstract class Y extends Z {}
abstract class Z implements Comparable<Y> {}