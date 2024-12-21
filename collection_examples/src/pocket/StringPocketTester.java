package pocket;

public class StringPocketTester {
	public static void main(String[] args) {
		StringPocket sp = new StringPocket();
		sp.put("test");
		// sp.put(10);
		System.out.println(sp.get());
	}
}
