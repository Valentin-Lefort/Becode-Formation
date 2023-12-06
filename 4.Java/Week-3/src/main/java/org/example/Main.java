package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    
    CommandLineHandler cmdHandler = new CommandLineHandler();
    
    CSVAnalyzer csvHandler = new CSVAnalyzer();
    csvHandler.csvAnalyzer("All", "All", "All","$");
    
    Scanner sc = new Scanner(System.in);
    System.out.println("List of commands :\n overview\n yAvg\n yTotal\n mAvg\n mTotal\n help (yAvg, yTotal, mAvg, mTotal, overview)");
    String filePath = sc.nextLine();
    
    cmdHandler.handleCommand(filePath);
  }
}