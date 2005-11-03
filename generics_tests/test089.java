public class test089 {
	public static void main(String[] args) {
		AD ad;
		System.out.println("SUCCESS");
	}
}

interface AD extends LIST<ADXP> {}
interface ADXP extends BIN {}
interface ANY {}
interface BL extends ANY {}
interface LIST<T extends ANY> extends ANY {}
interface BIN extends LIST<BL>{} 
