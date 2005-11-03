class UseUniPair{
  public static void main(String [] _){
    UniPair<String> p
     = new UniPair<String>("welt","hallo");
    
    System.out.println(p);
    p.swap();
    System.out.println(p);
  }
}