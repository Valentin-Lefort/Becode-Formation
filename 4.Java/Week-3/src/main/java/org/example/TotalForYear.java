package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;
import java.util.Arrays;

public class TotalForYear {
  public long calculateTotalForYear(String year) throws IOException {
    File file = new File("src/main/java/org/example/covid_and_trade.csv");
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    try (Stream<String> lines = Files.lines(Paths.get(file.toURI()))) {
      
      long total = lines
              .skip(1)
              .map(line -> Arrays.asList(line.split(",")))
              .filter(y -> {
                LocalDate date = LocalDate.parse(y.get(2), formatter);
                return y.get(4).equals("All")
                        && String.valueOf(date.getYear()).equals(year)
                        && y.get(5).equals("All")
                        && y.get(6).equals("All")
                        && y.get(7).equals("$");
              })
              .mapToLong(y -> Long.parseLong(y.get(y.size() -1)))
              .sum();
      
      return total;
    }
  }
}