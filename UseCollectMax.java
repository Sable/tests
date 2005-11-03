class UseCollectMax {
  public static void main(String [] _){
    CollectMax<String> cm = new CollectMax<String>("Brecht");
    cm.setValue("Calderon");
    cm.setValue("Horvath");
    cm.setValue("Shakespeare");
    cm.setValue("Schimmelpfennig");
    System.out.println(cm.getValue().toUpperCase());
  }
}