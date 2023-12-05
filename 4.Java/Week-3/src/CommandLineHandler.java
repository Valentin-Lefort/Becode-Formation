public class CommandLineHandler {
  public void handleCommand(String command) {
      switch (command) {
        case "overview":
          displayOverview();
          break;
        case "yearly_average":
          displayYearlyAvg();
          break;
        case "yearly_total":
          displayYearlyTotal();
          break;
        case "monthly_average":
          displayMonthlyAvg();
          break;
        case "monthly_total":
          displayMonthlyTotal();
          break;
        case "help":
          displayHelp();
          break;
        default:
          System.out.println("Default Case");
      }
  }
  private void displayHelp(){
    System.out.println("Help Case ");
  }
  private void displayMonthlyTotal(){
    System.out.println("Monthly Total : ");
  }
  private void displayMonthlyAvg(){
    System.out.println("Monthly Average : ");
  }
  private void displayYearlyTotal(){
    System.out.println("Yearly Total : ");
  }
  private void displayYearlyAvg(){
    System.out.println("Yearly Average : ");
  }
  private void displayOverview(){
    System.out.println("Overview : ");
  }
}