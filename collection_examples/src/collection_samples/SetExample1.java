package collection_samples;

import java.util.HashSet;
import java.util.Set;

public class SetExample1 {
	public static void main(String[] args) {
		Set<String> colors = new HashSet<>();
		colors.add("赤");
		colors.add("青");
		colors.add("黄");
		System.out.println("色は" + colors.size() + "種類");
		for (String c : colors) {
			System.out.println(c); // 格納順に表示されない
		}
		colors.add("赤"); // 重複は無視される
		System.out.println("色は" + colors.size() + "種類");
		for (String c : colors) {
			System.out.println(c);
		}
	}
}
