public class test005 { void count(int ... values) {} }
class Y extends test005 { void count(int[] values) {} }
class Z extends Y { void count(int... values) {} }
