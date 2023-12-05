import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    CommandLineHandler cmdHandler = new CommandLineHandler();
    Scanner sc = new Scanner(System.in);
    // Load CSV
    System.out.println("Enter the CSV Path : ");
    String filePath = sc.nextLine();
    cmdHandler.handleCommand(filePath);
  }
}