public class test098
{
	public test098()
	{
		super();
	}

	public Object convert(Object value)
	{
		Double d = (Double)value;
		d = (d/100);
		return d;
	}

	public static void main(String[] args)
	{
		test098 test = new test098();
		Object value = test.convert(new Double(50));
		System.out.println(value);
	}
}
