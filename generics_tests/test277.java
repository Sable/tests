public class test277<U extends Foo<U>> extends BarImpl<U> implements Foo<U> {}
interface Foo<T extends Foo<T>> extends Bar<T> {}
class BarImpl<S extends Foo<S>> implements Bar<S> {}
interface Bar<R extends Foo<R>>  {}
