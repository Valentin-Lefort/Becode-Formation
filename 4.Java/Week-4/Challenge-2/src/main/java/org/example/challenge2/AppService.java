package org.example.challenge2;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.*;

@Service // @Component
@Scope("singleton") // default
// @scope("prototype") // if you want to create a new instance each time

public class AppService {
  // This method takes an array of sentences and returns a list of maps.
  // Each map contains the word counts for a specific sentence.
  public List<Map<String, Integer>> countWords(String[] sentences){
    List<Map<String, Integer>> counts = new ArrayList<>();
    for (String sentence : sentences) {
      Map<String, Integer> wordCount = new HashMap<>();
      Scanner sc = new Scanner(sentence);
      while (sc.hasNext()){
        String word = sc.next().toLowerCase();
        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
      }
      sc.close();
      counts.add(wordCount);
    }
    return counts;
  }
}