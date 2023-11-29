import javax.swing.*;


public class MeasurementsTransCalculation {
  public static void main(String[] args){
    
    JList<String> li = new JList<>(new String[]{ "METER", "CENTIMETER", "MILLIMETER" });
    
    JOptionPane.showMessageDialog(null, li, "Select something", JOptionPane.PLAIN_MESSAGE);
    String askLength = JOptionPane.showInputDialog("Give us a length :");
    String askWidth = JOptionPane.showInputDialog("Give us a width");
    
    String metric = li.getSelectedValue();
    
    try {
      
      double length = Double.parseDouble(askLength);
      double width = Double.parseDouble(askWidth);
      
      if (metric.equals(calc.METER.name())){
        Double mtcLength = length * 100;
        Double mtcWidth = width * 100;
        double result = mtcLength * mtcWidth;
        JOptionPane.showMessageDialog(null, result);
      } else if (metric.equals(calc.CENTIMETER.name())) {
        double result = length * width;
        JOptionPane.showMessageDialog(null,result);
      } else if (metric.equals(calc.MILLIMETER.name())) {
        Double milliTcLength = length / 10;
        Double mtmWidth = width / 10;
        Double result = milliTcLength * mtmWidth;
        JOptionPane.showMessageDialog(null,(result + "cm²"));
      } else { System.out.print("Error"); }
    } catch (NumberFormatException e) {
      String error = "Error";
      JOptionPane.showMessageDialog(null, error);
      
    }
    
  }
  
}
