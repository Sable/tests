class Trace {

  static <elementType>  elementType trace(elementType x){
    System.out.println(x);
    return x;
  }
  
  public static void main(String [] _){
    String x = trace ((trace ("hallo")
                      +trace( " welt")).toUpperCase());

    Integer y = trace (new Integer(40+2));
  }
}