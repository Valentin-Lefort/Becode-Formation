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
  public double calculateAverage(List<Long> values) {
    if (values.isEmpty()) {
      return 0;
    }
    long sum = 0;
    for (Long value : values) {
      sum += value;
    }
    return (double) sum / values.size();
  }
  
  public void csvAnalyzer(String command, String country, String commodity, String transportNode, String measure, String year, String month)
          throws IOException {
    
    File file = new File("src/main/java/org/example/covid_and_trade.csv");
    
    try (Stream<String> lines = Files.lines(Paths.get(file.toURI()))) {
      
      List<Long> values = lines.map(line -> Arrays.asList(line.split(",")))
              .filter(y -> y.get(4).equals(country)
                      && y.get(2).split("/")[1].equals(month)
                      && y.get(1).equals(year)
                      && y.get(5).equals(commodity)
                      && y.get(6).equals(transportNode)
                      && y.get(7).equals(measure))
              .map(y -> Long.parseLong(y.get(y.size() -1)))
              .toList();
      
      double average = calculateAverage(values);
      
      if ("mAvg".equals(command)) {
        System.out.println("Country: " + country);
        System.out.println("Commodity: " + commodity);
        System.out.println("Transport Node: " + transportNode);
        System.out.println("Measure: " + measure);
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.printf("Average: %.2f%n", average);
      }
    }
  }
}