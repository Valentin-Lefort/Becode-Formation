package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import java.util.Scanner;

public class CSVAnalyzer {
  
  public void csvAnalyzer(String country, String commodity, String transportNode, String measure)
          throws IOException {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Insert a csv");
    String file = sc.nextLine();
    
    try (Stream<String> lines = Files.lines(Paths.get("src/" + file + ".csv"))) {
      List<List<String>> values = lines.map(line -> Arrays.asList(line.split(",")))
              .filter(y -> y.equals(country)
                      && y.equals(commodity)
                      && y.equals(transportNode)
                      && y.equals(measure))
              .sorted(Comparator.comparing(y -> y.get(y.size() - 2)))
              .toList();
      values.forEach(System.out::println);
    }
  }
}