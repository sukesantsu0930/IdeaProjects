package collection_samples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	static List<String> getStringList() {
		List<String> list = new ArrayList<>();
		// List<String> list = new LinkedList<>();
		list.add("東京都");
		list.add("神奈川県");
		list.add("静岡県");
		return list;
	}

	public static void main(String[] args) {
		List<String> list = getStringList();

		System.out.println("for文");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println("拡張for文");
		for (String p : list) {
			System.out.println(p); // 格納順に表示される
		}

		List<String> list2 = new ArrayList<>();
		list2.add("愛知県");
		list2.add("三重県");
		list2.add("大阪府");

		List<String> listAll = new ArrayList<>();
		listAll.addAll(list);
		listAll.addAll(list2);

		System.out.println("listとlist2の統合リスト");
		for (String p : listAll) {
			System.out.println(p);
		}

	}
}
