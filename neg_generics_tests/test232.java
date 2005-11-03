class Node {
}
class Composite<E> {
}
class Concrete extends Composite {
}
public class test232 {
    Composite<Node> comp = new Concrete(); // unchecked cast
    Zork z;
}
