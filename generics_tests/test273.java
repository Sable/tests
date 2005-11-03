package parser;
public abstract class AbstractParser<T> implements ValueParser<T> {
	public T parse( final String string ) {
		return valueOf(string); 
	}
	protected abstract T valueOf(final String string);	
}
interface ValueParser<T> {
	T parse(final String string);
}
