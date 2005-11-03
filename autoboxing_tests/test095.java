public class test095 {
	int counter = 0;

	public boolean wasNull() {
		return ++counter % 2 == 0;
	}

	private Byte getByte() {
		return (byte) 0;
	}

	private Short getShort() {
		return (short) 0;
	}

	private Long getLong() {
		return 0L;
	}

	private Integer getInt() {
		return 0; // autoboxed okay
	}

	// This should be the same as the second one.
	private Byte getBytey() {
		byte value = getByte();
		return wasNull() ? null : value;
	}

	private Byte getByteyNoBoxing() {
		byte value = getByte();
		return wasNull() ? null : (Byte) value;
	}

	// This should be the same as the second one.
	private Short getShorty() {
		short value = getShort();
		return wasNull() ? null : value;
	}

	private Short getShortyNoBoxing() {
		short value = getShort();
		return wasNull() ? null : (Short) value;
	}

	// This should be the same as the second one.
	private Long getLongy() {
		long value = getLong();
		return wasNull() ? null : value;
	}

	private Long getLongyNoBoxing() {
		long value = getLong();
		return wasNull() ? null : (Long) value;
	}

	// This should be the same as the second one.
	private Integer getIntegery() {
		int value = getInt();
		return wasNull() ? null : value;
	}

	private Integer getIntegeryNoBoxing() {
		int value = getInt();
		return wasNull() ? null : (Integer) value;
	}
}
