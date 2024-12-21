package generics_samples;

import java.util.ArrayList;

public class ArrayListExample4 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add(0, "text1");
		list.add(1, "text2");
		// list.add(2, 10); // コンパイル時にエラーがわかる
		String e1 = list.get(0);
		String e2 = list.get(1);
		System.out.println(e1);
		System.out.println(e2);

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(0, 10); // Autoboxing
		list2.add(1, 20); // Autoboxing
		int i1 = list2.get(0); // Auto-Unboxing
		int i2 = list2.get(1); // Auto-Unboxing
		System.out.println(i1);
		System.out.println(i2);
	}
}
