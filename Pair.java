class Pair<at,bt> extends Box<at>{
  Pair(at x,bt y){
    super(x);
    snd = y; 
  }

  bt snd;

  public String toString(){
    return "("+contents+","+snd+")";
  }
}