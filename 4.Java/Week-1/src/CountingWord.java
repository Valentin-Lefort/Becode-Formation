import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingWord {
  public static void main(String[] args) {
    File file = new File("Week-1/src/CountingText.txt");
    
    try (Scanner sc = new Scanner(new FileInputStream(file))) {
      Map<String, Integer> wordCountMap = new HashMap<>();
      int totalCount = 0;  // Variable to store the total count of words
      
      while (sc.hasNext()) {
        String word = sc.next().toLowerCase();
        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        totalCount++;  // Increment the total count
      }
      
      String mostFrequentWord = "";
      int maxCount = 0;
      
      for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
        if (entry.getValue() > maxCount) {
          maxCount = entry.getValue();
          mostFrequentWord = entry.getKey();
        }
      }
      
      System.out.println("Number of words: " + totalCount);  // Use totalCount instead of wordCountMap.size()
      System.out.println("Most frequent word: " + mostFrequentWord);
      System.out.println("Frequency: " + maxCount);
      
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + file);
    }
  }
}
