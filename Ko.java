class Ko{
  public static void main(String []_){
    String [] x = {"hello"};
    Object [] b  = x;
    b[0]=new Integer(42);
    x[0].toUpperCase();
  }
}