public class test016 {
 Object e() {
 int i = 12; 
  boolean b = false;
  switch(i) {
    case 0: return i > 0;
    case 1: return i >= 0;
    case 2: return i < 0;
    case 3: return i <= 0;
    case 4: return i == 0;
    case 5: return i != 0;
    case 6: return i & 0;
    case 7: return i ^ 0;
    case 8: return i | 0;
    case 9: return b && b;
    default: return b || b;
  }
 }
 public static void main(String[] args) {
  System.out.print(new test016().e());
 }
 Zork z;
}