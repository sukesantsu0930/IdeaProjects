package generics_samples;

import java.util.ArrayList;

public class ArrayListExample5 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add(0, "text1");
		list.add(1, "text2");
		String e1 = list.get(0);
		String e2 = list.get(1);
		System.out.println(e1);
		System.out.println(e2);
	}
}
