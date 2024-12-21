//15822065 助友剛

import java.util.List;
import java.util.Map;
import java.util.Set;

public class WordExtractorTest {
    public static void main(String[] args) {
        word_extractor.WordExtractor.setStopWords();
        String text = "Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a general-purpose programming language intended to let programmers write once, run anywhere (WORA),[16] meaning that compiled Java code can run on all platforms that support Java without the need to recompile.[17] Java applications are typically compiled to bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities (such as reflection and runtime code modification) that are typically not available in traditional compiled languages.";
        List<String> wordList = word_extractor.WordExtractor.getWordList(text);
        Set<String> wordSet = word_extractor.WordExtractor.getWordSet(text);
        System.out.println(word_extractor.WordExtractor.stopWordSet);
        System.out.println("単語リスト（ストップワードあり）" + wordList.size());
        System.out.println(wordList);
        word_extractor.WordExtractor.removeStopWords(wordList);
        System.out.println("単語リスト（ストップワードなし）" + wordList.size());
        System.out.println(wordList);
        System.out.println("単語リスト（ストップワードあり）" + wordSet.size());
        System.out.println(wordSet);
        word_extractor.WordExtractor.removeStopWords(wordSet);
        System.out.println("単語リスト（ストップワードなし）" + wordSet.size());
        System.out.println(wordSet);
        Map<String, Integer> wordCountMap = word_extractor.WordExtractor.getWordCountMap(wordList);
        System.out.println("各単語の出現回数\n" + wordCountMap);
    }
}
