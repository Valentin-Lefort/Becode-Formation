import java.util.*;

public class HelloArrays {
  public static void main(String[] args){
    
    String[] strGroup = new String[4];
    strGroup[0] = "Justine";
    strGroup[1] = "Virginie";
    strGroup[2] = "Kimi";
    strGroup[3] = "Valentin";
    System.out.println(Arrays.toString(strGroup));
    
    String[] names = {"Justine", "Virginie", "Kimi", "Valentin"};
    System.out.println(Arrays.toString(names));
    
  }
}