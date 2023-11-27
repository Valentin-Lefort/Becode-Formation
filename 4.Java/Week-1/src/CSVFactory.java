import java.io.*;
import java.util.Random;

public class CSVFactory {
  public static void main(String[] args) throws IOException {
    int rand = (int) (Math.random() * 30 + 1);
    
    File file = new File("src/factory.csv");
    try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)){
      fw.write(FirstName.getFirstName() + "," + LastName.getLastName() + "," + rand + "/08/1994" + "," + Reason.getReason() + "," + Department.getDepartment());
      bw.newLine();
    }
    
    
    System.out.println("Random Name: " + FirstName.getFirstName() +
            " " + LastName.getLastName() +
            " " + rand + "/08/1994" +
            " " + Reason.getReason() +
            " " + Department.getDepartment());

  }
  
  class Department {
    public static String getDepartment() {
      String[] department = {"Cardiology", "Radiology", "Pediatrics", "Geriatrics", "Pulmonology"};
      
      Random rdm = new Random();
      int index = rdm.nextInt(department.length);
      return department[index];
    }
  }
  
  class Reason {
    public static String getReason() {
      String[] reason = {"Appointment", "Visit"};
      
      Random rdm = new Random();
      int index = rdm.nextInt(reason.length);
      return reason[index];
    }
  }
  
  class FirstName {
    public static String getFirstName() {
      String[] firstName = {"Alice", "Bob", "Charlie", "David", "Emma", "Frank", "Grace", "Henry", "Ivy", "Jack",
              "Katherine", "Liam", "Mia", "Noah", "Olivia", "Peter", "Quinn", "Rachel", "Samuel", "Taylor",
              "Ursula", "Victor", "Wendy", "Xander", "Yasmine", "Zane"};
      
      Random rdm = new Random();
      int index = rdm.nextInt(firstName.length);
      return firstName[index];
    }
  }
  
  class LastName {
    public static String getLastName() {
      String[] lastName = {"Smith", "Johnson", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor",
              "Anderson", "Thomas", "Jackson", "White", "Harris", "Martin", "Thompson", "Garcia", "Martinez", "Robinson",
              "Clark", "Rodriguez", "Lewis", "Lee", "Walker", "Hall", "Allen", "Young", "Hernandez", "King"};
      
      Random rdm = new Random();
      int index = rdm.nextInt(lastName.length);
      return lastName[index];
    }
  }
}
