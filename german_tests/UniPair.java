class UniPair<at> extends Pair<at,at>{
  UniPair(at x,at y){super(x,y);}
  void swap(){
    final at z = snd;
    snd = contents;
    contents = z;
  }
}