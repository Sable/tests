class UsePair{
  public static void main(String [] _){
    Pair<String,Integer> p
     = new Pair<String,Integer>("hallo",new  Integer(40));
    
    System.out.println(p);
    System.out.println(p.contents.toUpperCase());
    System.out.println(p.snd.intValue()+2);
  }
}