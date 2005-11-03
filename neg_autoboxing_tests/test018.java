public class test018 {
  private static void checkConversions(byte _byte) {
    Short s = (short) _byte; // cast is necessary
    Short s2 = _byte; // ko
  } 
  public static void main(String args[]) {
    byte _byte = 2;
    checkConversions(_byte);
    System.out.println("OK");
  }
}
