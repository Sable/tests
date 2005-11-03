//package test;
//import parser.BooleanParser;
public class BooleanParserTest {
	static final boolean getBoolean(final String value) {
		return new BooleanParser().parse(value).booleanValue(); // The type Boolean is not visible
	}
}

abstract class AbstractParser<T> implements ValueParser<T> {
    public T parse( final String string ) {
        return valueOf(string);
    }
    protected abstract T valueOf(final String string); 
}
                                                        
interface ValueParser<T> { 
    T parse(final String string);
}
class BooleanParser extends AbstractParser<Boolean> {
    protected Boolean valueOf(final String string ) {
        return Boolean.valueOf(string);
    }
}
