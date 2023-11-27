import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingLetter {
  public static void main(String[] args) {
    File file = new File("./src/CountingText.txt");
    try (Scanner sc = new Scanner(new FileInputStream(file))){
      Map<Character, Integer> map = new HashMap<>();
      int totalLetters = 0;  // Variable to store the total count of letters
      while (sc.hasNext()) {
        String word = sc.next().toLowerCase();
        for (int i = 0; i < word.length(); i++) {
          char letter = word.charAt(i);
          map.put(letter, map.getOrDefault(letter, 0) + 1);
          totalLetters++;  // Increment the total count of letters
        }
      }
      Character mostFrequentLetter = 'A';  // Default valuefi
      int maxCount = 0;
      for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        if (entry.getValue() > maxCount) {
          maxCount = entry.getValue();
          mostFrequentLetter = entry.getKey();
        }
      }
      System.out.println("Here is the number of letters in each word: " + map.entrySet());
      System.out.println("Total number of letters: " + totalLetters);
      System.out.println("Here is the number of times the most used letter has been used: " + maxCount);
      System.out.println("Here is the most used letter: " + mostFrequentLetter);
    } catch (FileNotFoundException e) {
      System.out.println("File not found : " + file);
    }
  }
}
