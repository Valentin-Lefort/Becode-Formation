import java.io.*;
import java.util.*;

class Hospital {
  private String date;
  private String doctor;
  private String patient;
  private String visitor;
  
  public Hospital(String date, String doctor, String patient, String visitor) {
    this.date = date;
    this.doctor = doctor;
    this.patient = patient;
    this.visitor = visitor;
  }
  
  public String getDate() {
    return date;
  }
  
  public String getDoctor() {
    return doctor;
  }
  
  public String getPatient() {
    return patient;
  }
  
  public String getVisitor() {
    return visitor;
  }
}

class DailyReport {
  private List<Hospital> hospitalList;
  
  public DailyReport(List<Hospital> hospitalList) {
    this.hospitalList = hospitalList;
  }
  
  public void generateReport() throws IOException {
    Collections.sort(hospitalList, Comparator.comparing(Hospital::getDate));
    
    File dailyReport = new File("src/daily_report.txt");
    FileWriter dailyWriter = new FileWriter(dailyReport);
    
    System.out.println("Date, Doctor, Patient, Visitor");
    dailyWriter.write("Date, Doctor, Patient, Visitor\n");
    
    for (Hospital h : hospitalList) {
      System.out.println(h.getDate() + ", " + h.getDoctor() + ", " + h.getPatient() + ", " + h.getVisitor());
      dailyWriter.write(h.getDate() + ", " + h.getDoctor() + ", " + h.getPatient() + ", " + h.getVisitor() + "\n");
    }
    
    dailyWriter.close();
  }
}

class MonthlyReport {
  private List<Hospital> hospitalList;
  
  public MonthlyReport(List<Hospital> hospitalList) {
    this.hospitalList = hospitalList;
  }
  
  public void generateReport() throws IOException {
    Collections.sort(hospitalList, Comparator.comparing(Hospital::getDate));
    
    File monthlyReport = new File("src/monthly_report.txt");
    FileWriter monthlyWriter = new FileWriter(monthlyReport);
    
    System.out.println("Date, Doctor, Patient, Visitor");
    monthlyWriter.write("Date, Doctor, Patient, Visitor\n");
    
    for (Hospital h : hospitalList) {
      System.out.println(h.getDate() + ", " + h.getDoctor() + ", " + h.getPatient() + ", " + h.getVisitor());
      monthlyWriter.write(h.getDate() + ", " + h.getDoctor() + ", " + h.getPatient() + ", " + h.getVisitor() + "\n");
    }
    
    monthlyWriter.close();
  }
}

public class HelloClassesPT2 {
  
  public static void main(String[] args) throws IOException {
    List<Hospital> hospitalList = new ArrayList<>();
    
    BufferedReader reader = new BufferedReader(new FileReader("src/hospital.csv"));
    String line = reader.readLine();
    
    while (line != null) {
      String[] attributes = line.split(",");
      hospitalList.add(new Hospital(attributes[0], attributes[1], attributes[2], attributes[3]));
      line = reader.readLine();
    }
    
    reader.close();
    
    DailyReport dailyReport = new DailyReport(hospitalList);
    dailyReport.generateReport();
    
    MonthlyReport monthlyReport = new MonthlyReport(hospitalList);
    monthlyReport.generateReport();
  }
}
