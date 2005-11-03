public class test149<T> {
	class Member {}
}
class Y{
    test149.Member m;
    test149<String>.Member ms = m;
}
