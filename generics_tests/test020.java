public class test020 <T extends L<T>, U extends T> {
    public static void main(String[] args) {
        System.out.println("SUCCESS");
    }
}
class L<E>{}
