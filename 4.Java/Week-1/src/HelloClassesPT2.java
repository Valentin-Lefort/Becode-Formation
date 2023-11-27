import java.io.*;
import java.util.*;

public class HelloClassesPT2 {
  
  public static void main(String[] args) throws IOException {
    List<hospital> hospitalList = new ArrayList<hospital>();
    // read the file
    BufferedReader reader = new BufferedReader(new FileReader("src/hospital.csv"));
    String line = reader.readLine();
    while (line != null) {
      String[] attributes = line.split(",");
      hospitalList.add(new hospital(attributes[0], attributes[1], attributes[2], attributes[3]));
      line = reader.readLine();
    }
    reader.close();
    // sort the list by date
    Collections.sort(hospitalList, new Comparator<hospital>() {
      @Override
      public int compare(hospital h1, hospital h2) {
        return h1.getDate().compareTo(h2.getDate());
      }
    });
    // create a file called "daily_report.txt"
    File dailyReport = new File("src/daily_report.txt");
    // create a file called "monthly_report.txt"
    File monthlyReport = new File("src/monthly_report.txt");
    // write the report to the file
    FileWriter dailyWriter = new FileWriter(dailyReport);
    FileWriter monthlyWriter = new FileWriter(monthlyReport);
    // print the report to the console
    System.out.println("Date, Doctor, Patient, Visitor");
    dailyWriter.write("Date, Doctor, Patient, Visitor\n");
    monthlyWriter.write("Date, Doctor, Patient, Visitor\n");
    for (hospital h : hospitalList) {
      System.out.println(h.getDate() + ", " + h.getDoctor() + ", " + h.getPatient() + ", " + h.getVisitor());
      dailyWriter.write(h.getDate() + ", " + h.getDoctor() + ", " + h.getPatient() + ", " + h.getVisitor() + "\n");
      monthlyWriter.write(h.getDate() + ", " + h.getDoctor() + ", " + h.getPatient() + ", " + h.getVisitor() + "\n");
    }
    // close the file
    dailyWriter.close();
    monthlyWriter.close();
  }
}