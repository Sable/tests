class Apfel implements EQ<Apfel>{
  String typ;

  Apfel(String typ){
    this.typ=typ;}

  public boolean eq(Apfel other){
    return this.typ.equals(other.typ); 
  }    
}