import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CheckTheDifference {
  
  public static final String FILENAME = "src/effects-of-covid19-on-trade.csv";
  public static void main(String[] args)
  {
    HashMap<String, Long> values2019 = mapping("/2019");
    HashMap<String, Long> values2020 = mapping("/2020");
    System.out.println(values2019);
    System.out.println(values2020);
  }
  static HashMap<String, Long> mapping(String Year) {
    HashMap<String, Long> values;
    
    try (Stream<String> lines = Files.lines(Paths.get(FILENAME))) {
      values = (HashMap<String, Long>) lines.skip(1)
              .filter(y -> y.contains(Year)
                      && y.contains("Exports")
                      && y.contains("European Union (27)"))
              .collect(Collectors.groupingBy(
                      c -> c.split(",")[2].split("/")[1],
                      Collectors.summingLong(c -> Long.parseLong(c.split(",")[c.split(",").length -2]))
              ));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    return values;
  }
}