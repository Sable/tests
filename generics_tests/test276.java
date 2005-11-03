public interface test276<R extends Foo<R>>  {} 
class BarImpl<S extends Foo<S>> implements test276<S> {}
interface Foo<T extends Foo<T>> extends test276<T> {}
class FooImpl<U extends Foo<U>> extends BarImpl<U> implements Foo<U> {}
