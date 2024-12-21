package pocket;

public class PocketTester {
	public static void main(String[] args) {
		Pocket<String> sp = new Pocket<>();
		sp.put("test");
		System.out.println(sp.get());

		Pocket<Integer> ip = new Pocket<>();
		ip.put(10);
		System.out.println(ip.get());
	}
}
