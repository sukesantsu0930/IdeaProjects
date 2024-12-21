package pocket;

public class ObjectPocketTester {
	public static void main(String[] args) {
		ObjectPocket op = new ObjectPocket();
		op.put("test");
		String s = (String) op.get();
		System.out.println(s);
		op.put(10);
		int i = (Integer) op.get();
		System.out.println(i);
		op.put("test2");
		int j = (Integer) op.get(); // キャストエラー
		System.out.println(j);
	}
}
