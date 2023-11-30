import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.Stream;

public class HighestValueOf {
  
  public static void main(String[] args){
    
    String fileName = "src/effects-of-covid19-on-trade.csv";
    
    try (Stream<String> lines = Files.lines(Paths.get(fileName))) {
      String values = lines.map(line -> Arrays.asList(line.split(",")))
              .filter(y -> y.contains("2019") && y.contains("China") && Objects.equals(y.get(5), "All") && Objects.equals(y.get(6), "All"))
              .skip(1)
              .max(Comparator.comparing(y -> Long.parseLong(y.get(y.size() - 2)))).orElseThrow(Exception::new).toString();
      System.out.println(values);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    
  }
  
}