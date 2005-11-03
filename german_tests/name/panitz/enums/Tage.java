package name.panitz.enums;
public enum Tage {
  montag,dienstag,mittwoch,donnerstag
 ,freitag,sonnabend,sonntag;

  public boolean isWerktag(){
    switch (this){
      case sonntag    :
      case sonnabend  :return false;
      default         :return true;
    }
  }

  public static void main(String [] _){
    Tage tag = freitag;
    System.out.println(tag);
    System.out.println(tag.ordinal());
    System.out.println(tag.isWerktag());
    System.out.println(sonntag.isWerktag());
  }
}