public final class test252 {
	public <T> void testEquals(final String x, T one, T two) {
	}

	public <T1, T2> void testEqualsAlt(final String x, T1 one, T2 two) {
	}

	public interface Fooey {
	}

	public interface Bar extends Fooey {
	}

	public interface GenericFooey<T> {
	}

	public interface GenericBar<T> extends GenericFooey<T> {
	}

	public void testGeneric() {
		testEquals("Should work", new GenericBar<Long>() {
		}, new GenericBar<Long>() {
		});
		final GenericBar<Long> child = new GenericBar<Long>() {
		};
		final GenericFooey<Long> parent = child;
		testEquals("Doesn't work but should", child, parent); // this
		// fails
		// but should work it's identical to next line.
		testEquals("Doesn't work but should", (GenericFooey<Long>) child, parent);
		testEqualsAlt("Should work", child, parent);
	}
	public void test() {
		testEquals("Should work", new Bar() {
		}, new Bar() {
		});
		final Bar child = new Bar() {
		};
		final Fooey parent = child;
		testEquals("Doesn't work but should", child, parent);
		testEquals("Doesn't work but should", (Fooey) child, parent);
		testEqualsAlt("Should work", child, parent);
	}
}
