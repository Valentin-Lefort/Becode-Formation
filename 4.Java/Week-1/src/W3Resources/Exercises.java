package W3Resources;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Exercises {
  public static void main(String[] args) {
    // 1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
    System.out.println("Hello");
    System.out.println("Alexandra Abramov!");
    // or
    System.out.println("Hello\nAlexandra Abramov!");
    
    // 2. Write a Java program to print the sum of two numbers.
    int a1 = 74;
    int b1 = 36;
    System.out.println(a1 + b1);
    
    // 3. Write a Java program to divide two numbers and print on the screen.
    System.out.println(a1 / b1);
    
    // 4. Write a Java program to print the result of the following operations.
    System.out.println(-5 + 8 * 6);
    System.out.println((55 + 9) % 9);
    System.out.println(20 + -3 * 5 / 8);
    System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    
    // 5. Write a Java program that takes two numbers as input and display the product of two numbers.
    int firstNumber = 25;
    int secondNumber = 5;
    System.out.println(firstNumber + " x " + secondNumber + " = " + firstNumber * secondNumber);
    
    // 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
    int number1 = 125;
    int number2 = 24;
    System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
    System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
    System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));
    System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
    System.out.println(number1 + " mod " + number2 + " = " + (number1 % number2));
    
    // 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.
    int table = 8;
    for (int i = 1; i <= 10; i++) {
      System.out.println(table + " x " + i + " = " + (table * i));
    }
    
    // 8. Write a Java program to display the JAVA pattern.
    System.out.println("   J    a   v     v  a");
    System.out.println("   J   a a   v   v  a a");
    System.out.println("J  J  aaaaa   V V  aaaaa");
    System.out.println(" JJ  a     a   V  a     a");
    
    // 9. Write a Java program to compute the specified expressions and print the output.
    System.out.println("((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = " + ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
    
    // 10. Write a Java program to compute a specified formula.
    System.out.println("Specified Formula :" + 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11)));
    
    // 11. Write a Java program to print the area and perimeter of a circle.
    double radius = 7.5;
    System.out.println("Perimeter is = " + (2 * radius * Math.PI));
    System.out.println("Area is = " + (Math.PI * radius * radius));
    
    // 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
    int numberOne = 25;
    int numberTwo = 45;
    int numberThree = 65;
    System.out.println("Average is = " + ((numberOne + numberTwo + numberThree) / 3)); // Divide by the number of numbers used.
    
    // 13. Write a Java program to print the area and perimeter of a rectangle.
    float a, b, c, d, perimeter;
    a = c = 5.6f;
    b = d = 8.5f;
    perimeter = 2 * (a + b);
    System.out.println("Perimeter is 2*( " + a + " + " + b + " ) = " + perimeter);
    
    // 14. Write a Java program to print an American flag on the screen.
    System.out.println("* * * * * * ==================================");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ==================================");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ==================================");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ==================================");
    System.out.println(" * * * * *  ==================================");
    System.out.println("* * * * * * ==================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    System.out.println("==============================================");
    
    // 15. Write a Java program to swap two variables.
    int e = 5;
    int f = 10;
    int g = e;
    e = f;
    f = g;
    System.out.println("e = " + e + " " + "f = " + f);
    
    // 16. Write a Java program to print a face.
    System.out.println(" +\"\"\"\"\"+ ");
    System.out.println("[| o o |]");
    System.out.println(" |  ^  | ");
    System.out.println(" | '-' | ");
    System.out.println(" +-----+ ");
    
    // 20. Write a Java program to convert a decimal number to a hexadecimal number.
    int decimalNumber = 15;
    System.out.println("Hexadecimal number is " + Integer.toHexString(decimalNumber));
    
  }
}
