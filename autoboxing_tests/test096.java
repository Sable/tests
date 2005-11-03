public class test096 {

	private static void checkByteConversions(Byte _byte) {
		short s = (short) _byte;
		short s2 = _byte;
		int i = (int) _byte;
		long l = (long) _byte;
		float f = (float) _byte;
		double d = (double) _byte;
		if ( _byte.byteValue() != s ) {
            System.err.println("Must be equal 0");
        }
		if ( _byte.byteValue() != i ) {
            System.err.println("Must be equal 1");
        }
		if ( _byte.byteValue() != l ) {
            System.err.println("Must be equal 2");
        }
		if ( _byte.byteValue() != f ) {
            System.err.println("Must be equal 3");
        }
		if ( _byte.byteValue() != d ) {
            System.err.println("Must be equal 4");
        }
	} 

	private static void checkCharacterConversions(Character _character) {
		int i = (int) _character;
		long l = (long) _character;
		float f = (float) _character;
		double d = (double) _character;
		if ( _character.charValue() != i ) {
            System.err.println("Must be equal 9");
        }
		if ( _character.charValue() != l ) {
            System.err.println("Must be equal 10");
        }
		if ( _character.charValue() != f ) {
            System.err.println("Must be equal 11");
        }
		if ( _character.charValue() != d ) {
            System.err.println("Must be equal 12");
        }
	}

	private static void checkFloatConversions(Float _float) {
		double d = (double) _float;
		if ( _float.floatValue() != d ) {
            System.err.println("Must be equal 18");
        }
	}

	private static void checkIntegerConversions(Integer _integer) {
		long l = (long) _integer;
		float f = (float) _integer;
		double d = (double) _integer;
		if ( _integer.intValue() != l ) {
            System.err.println("Must be equal 13");
        }
		if ( _integer.intValue() != f ) {
            System.err.println("Must be equal 14");
        }
		if ( _integer.intValue() != d ) {
            System.err.println("Must be equal 15");
        }
	}

	private static void checkIntegerConversions(Short _short) {
		int i = (int) _short;
		long l = (long) _short;
		float f = (float) _short;
		double d = (double) _short;
		if ( _short.shortValue() != i ) {
            System.err.println("Must be equal 5");
        }
		if ( _short.shortValue() != l ) {
            System.err.println("Must be equal 6");
        }
		if ( _short.shortValue() != f ) {
            System.err.println("Must be equal 7");
        }
		if ( _short.shortValue() != d ) {
            System.err.println("Must be equal 8");
        }
	}

	private static void checkLongConversions(Long _long) {
		float f = (float) _long;
		double d = (double) _long;
		if ( _long.longValue() != f ) {
            System.err.println("Must be equal 16");
        }
		if ( _long.longValue() != d ) {
            System.err.println("Must be equal 17");
        }
	}

    public static void main(String args[]) {
        Byte _byte = new Byte((byte)2);
        Character _character = new Character('@');
        Short _short = new Short((short)255);
        Integer _integer = new Integer(12345678);
        Long _long = new Long(1234567890);
        Float _float = new Float(-0.0);

        checkByteConversions(_byte);
        checkIntegerConversions(_short);
        checkCharacterConversions(_character);
        checkIntegerConversions(_integer);
        checkLongConversions(_long);
        checkFloatConversions(_float);

        System.out.println("OK");
      }
}
