package org.example;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

public class CommandLineHandler {
  Scanner sc1 = new Scanner(System.in);
  UniqueValue uv = new UniqueValue();
  CSVAnalyzer csvAnalyzer = new CSVAnalyzer();
  public void handleCommand(String input) throws IOException {
    String[] s = input.split(" -");
    String command = s[0];
    switch (command) {
      case "overview":
        displayOverview();
        break;
      case "yAvg":
        displayYearlyAvg();
        break;
      case "yTotal":
        displayYearlyTotal();
        break;
      case "mAvg":
        String country = s.length > 1 ? s[1] : "All";
        String month = s.length > 2 ? s[2] : "";
        String year = s.length > 3 ? s[3] : "";
        csvAnalyzer.csvAnalyzer("printCommand", country, "All", "All", "$", year, month);
        break;
      case "mTotal":
        displayMonthlyTotal();
        break;
      case "help":
        if (s.length > 1) displayState(s[1]);
        else displayHelp();
        break;
      default:
        System.out.println("Type help to see the command list");
    }
  }
  public void displayHelp(){
    System.out.println("""
            There is a list for help command you can use :\s
             - yAvg\s
             - yTotal\s
             - mAvg\s
             - mTotal\s
             - overview\s
             - -l to leave the help menu""");
    String scName = sc1.next();
    displayState(scName);
  }
  private void displayState(String scName){
    if (Objects.equals(scName, "yAvg")){
      System.out.println("Provides an overview of all the monthly averages for a particular year, for both import and export. Then it gives the yearly average for both import and export.");
    } else if (Objects.equals(scName, "yTotal")) {
      System.out.println("Provides an overview of all the monthly totals for a particular year. This command returns the total of each month for both import and export and then gives the yearly total for both import and export.");
    } else if (Objects.equals(scName, "mAvg")) {
      System.out.println("Returns the average of both the export and import of a specified month of a specified year.");
    } else if (Objects.equals(scName, "mTotal")) {
      System.out.println("Returns the sum of both the export and import for a specified month of a specified year.");
    } else if (Objects.equals(scName, "-l")) {
      System.out.println("You leave the help menu");
    } else {
      displayHelp();
    }
  }
  
  private void displayMonthlyTotal(){
    System.out.println("Monthly Total : ");
  }
  private void displayYearlyTotal(){
    System.out.println("Yearly Total : ");
  }
  private void displayYearlyAvg(){
    System.out.println("Yearly Average : ");
  }
  private void displayOverview(){
    uv.uniqueValue();
  }
}