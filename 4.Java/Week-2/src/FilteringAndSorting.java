import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class FilteringAndSorting {
  public static void main(String[] args){
    
    String fileName = "src/effects-of-covid19-on-trade.csv";
    
    try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
      List<List<String>> values = lines.map(line -> Arrays.asList(line.split(",")))
              .filter(y -> y.contains("2018") && y.contains("Imports"))
              .sorted(Comparator.comparing(y -> y.get(y.size() - 2)))
              .toList();
      values.forEach(System.out::println);
      
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}