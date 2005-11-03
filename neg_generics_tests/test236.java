public abstract class test236 {
    public abstract Object getProperty(final Object src, final String name);
    Zork z;
    public <T> T getTheProperty(final Object src, final String name)
    {
        final T val = (T) getProperty(src, name); // this gives erroneous cast warning
        return val;
    }
}
