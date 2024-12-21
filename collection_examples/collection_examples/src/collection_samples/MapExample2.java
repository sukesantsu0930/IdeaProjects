package collection_samples;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapExample2 {

	public static void printMap(String mapType, Map<String, Integer> prefs) {
		prefs.put("Kumamoto", 181);
		prefs.put("Tokyo", 1261);
		prefs.put("Kyoto", 255);
		prefs.put("Kanagawa", 909);
		prefs.put("Akita", 102);
		System.out.println("Mapのタイプ：" + mapType);
		for (Entry<String, Integer> entry : prefs.entrySet()) {
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println(key + "の人口は，" + value);
		}
	}

	public static void main(String[] args) {
		Map<String, Integer> prefs = new HashMap<>();
		printMap("HashMap", prefs);
		System.out.println();
		prefs = new TreeMap<>();
		printMap("TreeMap", prefs);
	}
}
