import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloClasses {
  public static List<CSVLine> readCSVFile(String path) throws FileNotFoundException {
    List<CSVLine> CSVLine = new ArrayList<>();
    File file = new File(path);
    Scanner sc = new Scanner(file);
    
    while (sc.hasNextLine()) {
      String line = sc.nextLine();
      String[] data = line.split(",");
      
      // Ensure the array has enough elements
      if (data.length >= 3) {
        String FirstName = data[0];
        String LastName = data[1];
        String Path = data[2];
        
        CSVLine csvLine = new CSVLine(FirstName, LastName, Path);
        CSVLine.add(csvLine);
      }
    }
    sc.close();
    return CSVLine;
  }
  public static void main(String[] args) {
    String path = "./src/HelloClasses.csv";
    try{
      List<CSVLine> csvLines = readCSVFile(path);
      
      //Accessing and printing a particular piece of information
      for (CSVLine line : csvLines){
        System.out.print(line.getFirstName() + " ");
        System.out.print(line.getLastName() + " ");
        System.out.print(line.getPath() + " ");
        System.out.println();
      }
    } catch (FileNotFoundException e){
      System.out.println("File not found: " + path);
    }
  };
}
  
  