class CollectMaxOld{
  private Comparable value;

  CollectMaxOld(Comparable x){value=x;}

  void setValue(Comparable x){
    if (value.compareTo(x)<0) value=x;
  }

  Comparable getValue(){return value;}
}