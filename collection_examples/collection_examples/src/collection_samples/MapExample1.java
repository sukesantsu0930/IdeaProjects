package collection_samples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<>();
		prefs.put("京都府", 255);
		prefs.put("東京都", 1261);
		prefs.put("熊本県", 181);
		int tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は，" + tokyo);
		System.out.println("神奈川県の人口は，" + prefs.get("神奈川県"));
		prefs.put("東京都", 1335);
		tokyo = prefs.get("東京都");
		System.out.println("東京都の人口は，" + tokyo);

		Set<String> keySet = prefs.keySet();
		for (String key : keySet) {
			int p = prefs.get(key);
			System.out.println(key + "の人口は，" + p);
		}

		for (Entry<String, Integer> entry : prefs.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + "の人口は，" + value);
		}
	}
}
