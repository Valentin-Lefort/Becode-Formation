import java.util.Stack;

public class Stacks
{
  public static void main(String[] args)
  {
    Stack<String> stk = new Stack<>();
    
    if(stk.isEmpty()){
      
      stk.push("Justine");
      stk.push("Virginie");
      stk.push("Kimi");
      stk.push("Valentin");
      
      System.out.println("Stack : " + stk);
      
      String java = stk.peek();
      System.out.println("Top Element : " + java);
      
    } else {
      stk.pop();
      System.out.println(stk);
    }
    

    
  }
}

//String Six = int 6