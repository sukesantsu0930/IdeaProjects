package generics_samples;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(0, new Integer(10));
		list.add(1, new Integer(20));
		Integer ri1 = (Integer) list.get(0);
		int pi1 = ri1.intValue();
		Integer ri2 = (Integer) list.get(1);
		int pi2 = ri2.intValue();
		System.out.println(pi1);
		System.out.println(pi2);
	}
}
