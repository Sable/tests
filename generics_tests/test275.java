interface Bar<R extends Foo<R>>  {} 
 
class BarImpl<S extends Foo<S>> implements Bar<S> {} 
 
interface Foo<T extends Foo<T>> extends Bar<T> {} 
 
public class test275<U extends Foo<U>> extends BarImpl<U> implements Foo<U> {}

