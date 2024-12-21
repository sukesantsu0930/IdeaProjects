//15822065 助友剛

package word_extractor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordExtractor {



    public static void main(String[] args) {
        WordExtractor.setStopWords();

        String text = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA),[16] meaning that compiled Java code can run on all platforms that support Java without the need to recompile.[17] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages.";


        List<String> wordList = WordExtractor.getWordList(text);
        Set<String> wordSet = WordExtractor.getWordSet(text);


        System.out.println(WordExtractor.stopWordSet);

        System.out.println("単語リスト（ストップワードあり）"+wordList.size());
        System.out.println(wordList);
        WordExtractor.removeStopWords(wordList);
        System.out.println("単語リスト（ストップワードなし）"+wordList.size());
        System.out.println(wordList);


        System.out.println("単語リスト（ストップワードあり）"+wordSet.size());
        System.out.println(wordSet);
        WordExtractor.removeStopWords(wordSet);
        System.out.println("単語リスト（ストップワードなし）"+wordSet.size());
        System.out.println(wordSet);

        Map<String, Integer> wordCountMap = WordExtractor.getWordCountMap(wordList);

        System.out.println("各単語の出現回数\n"+wordCountMap);

    }

    public static List<String> getWordList(String text) {
        text = text.replace(",", "").replace(".", "").toLowerCase();
        String[] words = text.split("\\s+");
        List<String> wordList = new ArrayList<>();
        for (String word : words) {
            wordList.add(word);
        }
        return wordList;
    }

    public static Set<String> getWordSet(String text) {
        List<String> wordList = getWordList(text);

        Set<String> wordSet = new TreeSet<>(wordList);

        return wordSet;
    }

    private static Set<String> stopWordSet = new HashSet<>();


    public static void setStopWords() {
        try (BufferedReader br = new BufferedReader(new FileReader("stopwords-en.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                stopWordSet.add(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void removeStopWords(Collection<String> wordCollection) {
        wordCollection.removeIf(stopWordSet::contains);
    }

    public static Map<String, Integer> getWordCountMap(List<String> wordList) {
        Map<String, Integer> wordCountMap = new TreeMap<>();

        //getOrDefaultで、すでにその単語が存在する場合はカウントを増やし、存在しない場合はデフォルト値 0 を設定
        for (String word : wordList) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }


        return wordCountMap;
    }

}
