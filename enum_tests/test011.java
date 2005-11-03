public class test011 {
	public enum RuleType{ SUCCESS, FAILURE }
	public static void main(String[] args) {
		System.out.print(RuleType.valueOf(RuleType.SUCCESS.name()));
	}
}