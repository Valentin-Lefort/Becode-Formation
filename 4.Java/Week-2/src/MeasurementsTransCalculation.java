import javax.swing.*;


public class MeasurementsTransCalculation {
  public static void main(String[] args){
    
    JOptionPane modal = new JOptionPane();
    JList<String> li = new JList<>(new String[]{ "METER", "CENTIMETER", "MILLIMETER" });
    
    modal.showMessageDialog(null, li, "Select something", JOptionPane.PLAIN_MESSAGE);
    String askLength = modal.showInputDialog("Give us a length :");
    String askWidth = modal.showInputDialog("Give us a width");
    
    String metric = li.getSelectedValue();
    
    try {
      double length = Double.parseDouble(askLength);
      double width = Double.parseDouble(askWidth);
      
      if (metric.equals(calc.METER.name())){
        Double mtcLength = length * 100;
        Double mtcWidth = width * 100;
        double result = mtcLength * mtcWidth;
        System.out.println(result);
        modal.showMessageDialog(null, result);
        System.out.println(result);
      } else if (metric.equals(calc.CENTIMETER.name())) {
        double result = length * width;
        modal.showMessageDialog(null,result);
      } else if (metric.equals(calc.MILLIMETER.name())) {
        Double milliTcLength = length / 10;
        Double mtmWidth = width / 10;
        Double result = milliTcLength * mtmWidth;
        modal.showMessageDialog(null,(result + "cm²"));
      } else { System.out.print("Error"); }
    } catch (NumberFormatException e) {
      String error = "Error";
      modal.showMessageDialog(null, error);
      
    }
    
  }
  
}
