class CollectMax <elementType extends Comparable>{
  private elementType value;

  CollectMax(elementType x){value=x;}

  void setValue(elementType x){
    if (value.compareTo(x)<0) value=x;
  }

  elementType getValue(){return value;}
}