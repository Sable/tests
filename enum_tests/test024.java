public enum test024
{
  FIRST,
  SECOND,
  THIRD;

  static {
    for (test024 t : values()) {
      System.out.print(t.name());
    }
  }

  test024() {
  }

  public static void main(String[] args) {
  }
}