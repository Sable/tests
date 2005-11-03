class Birne implements EQ<Birne>{
  String typ;

  Birne(String typ){
    this.typ=typ;}

  public boolean eq(Birne other){
    return this.typ.equals(other.typ); 
  }    
}