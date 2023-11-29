import com.sun.jdi.Value;
import org.w3c.dom.css.CSSValueList;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class MoreFiltering {
  
  public static final String FILENAME = "src/effects-of-covid19-on-trade.csv";
  
  static void convert(){
    
    String line = "";
    String splitBy = ",";
    
//    InputStream is = new FileInputStream(FILENAME);
    
    try (InputStream inputFS = new FileInputStream(FILENAME); BufferedReader br = new BufferedReader(new InputStreamReader(inputFS))){
      while ((line = br.readLine()) != null){
        String[] value = line.split(splitBy);
        if (Objects.equals(value[value.length -3], "$") && Objects.equals(value[1], "2016")){
          if (!Objects.equals(value[value.length -2], "0")){
            double changed = Double.parseDouble(value[value.length -2]) / 0.85;
            System.out.println(changed+ "€" + " " + value[1]);
          }
        }
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
    
  }
  public static void main(String[] args){
    convert();
  }
}