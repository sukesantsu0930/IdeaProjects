package generics_samples;

import java.util.ArrayList;

public class ArrayListExample1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(0, "text1");
		list.add(1, "text2");
		list.add(2, "text3");
		String e1 = (String) list.get(0);
		String e2 = (String) list.get(1);
		String e3 = (String) list.get(2);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
