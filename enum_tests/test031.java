public class test031 {
    enum Color { RED, GREEN };
    public static void main(String[] args) {
        Color c= Color.GREEN;
        switch (c) {
        case RED:
            System.out.println(Color.RED);
            break;
        case GREEN:
            System.out.println(c);
            break;
        }
    }
}
