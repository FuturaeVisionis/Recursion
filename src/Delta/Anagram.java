package Delta;
import acm.program.*;

/**
 * Created by ronald on 27/11/16.
 */
public class Anagram extends Program {
    public static void main(String[] args) {

        new Anagram().start(args);
    }

    public void run() {
            String word = readLine("Give a word to anagram: ");
            printAnagrams(" ", word);
        }

    public void printAnagrams(String prefix, String word) {
        if (word.length() <= 1) {
            println(prefix + word);
        } else {
            for (int i = 0; i < word.length(); i++) {
                String cur = word.substring(i, i + 1);
                String before = word.substring(0, i);
                String after = word.substring(i + 1);
                printAnagrams(prefix + cur, before + after);
            }
        }
    }
    }