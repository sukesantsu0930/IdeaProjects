package collection_samples;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample2 {

	public static void printSet(String setType, Set<String> words) {
		words.add("panda");
		words.add("dog");
		words.add("wolf");
		words.add("cat");
		System.out.print(setType + ": ");
		for (String w : words) {
			System.out.print(w + "->");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Set<String> words = new HashSet<>();
		printSet("HashSet", words);
		words = new LinkedHashSet<>();
		printSet("LinkedHashSet", words);
		words = new TreeSet<>();
		printSet("TreeSet", words);
	}
}
