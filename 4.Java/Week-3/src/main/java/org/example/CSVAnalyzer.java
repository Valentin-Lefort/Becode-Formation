package org.example;

import java.io.File;
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
    
    File file = new File("main/java/org/example/covid_and_trade.csv");
    
    try (Stream<String> lines = Files.lines(Paths.get("src/" + file))) {
      List<List<String>> values = lines.map(line -> Arrays.asList(line.split(",")))
              .filter(y -> y.equals(country)
                      && y.equals(commodity)
                      && y.equals(transportNode)
                      && y.equals(measure))
              .toList();
      values.forEach(System.out::println);
    }
  }
}