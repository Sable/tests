package name.panitz.enums;
public enum Euroschein {
   fünf(5),zehn(10),zwanzig(20),fünfzig(50),hundert(100)
  ,zweihundert(200),tausend(1000);
  private int value;
  public Euroschein(int v){value=v;}
  public int value(){return value();}

  public static void main(String [] _){
    for (Euroschein schein:Euroschein.values()) 
      System.out.println
        (schein.ordinal()+": "+schein+" -> "+schein.value);
  }
}