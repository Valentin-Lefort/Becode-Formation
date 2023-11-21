import java.util.Arrays;
import java.util.Random;

public class HelloException {
  public static void  main (String[] args) {
    int maxSize = 10;
    int upperLimit = 100;
    
    int[] randomArray = generateRandomArray(maxSize);
    System.out.println("Random Array: ");
    for (int num : randomArray){
      if(num < upperLimit){
        System.out.println(Arrays.asList(num));
      }
    }
  }
  
  //Generate a random array of non-primitive integers
  private static int[] generateRandomArray(int maxSize){
    int [] array = new int[maxSize];
    Random random = new Random();
    
    for(int i = 0; i < maxSize; i++) {
      array[i] = random.nextInt(100);
    }
    return array;
  }
}