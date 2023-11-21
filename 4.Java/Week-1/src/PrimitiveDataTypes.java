// Challenge 1 All primitives data types
class PrimitiveDataTypes {
  public static void main(String[] args){
    
    byte c1byte = 8; // byte is a primitive data type similar to int, except it only takes up 8 bits of memory.
    System.out.println("Variable byte : " + c1byte);
    
    short c1short = 16; // If we want to save memory and byte is too small,
    System.out.println("Variable short : " + c1short);
    
    int c1int = 32; // If we want to save memory and byte and short is too small,
    System.out.println("Variable int : " + c1int);
    
    long c1long = 64; // long is the big brother of int. It’s stored in 64 bits of memory,
    System.out.println("Variable  long : " + c1long);
    
    float c1float = 128.128f; // This type is stored in 32 bits of memory just like int. However, because of the floating decimal point, its range is much different.
    System.out.println("Variable float : " + c1float);
    
    double c1double = 254.254; // It’s stored in 64 bits of memory. This means it represents a much larger range of possible numbers than float.
    System.out.println("Variable double : " + c1double);
    
    char c1char = 5686; // Its range is from 0 to 65,535. In Unicode, this represents ‘\u0000’ to ‘\uffff’.
    System.out.println("Variable char : " + c1char);
    
    boolean c1bool = true; // It can contain only two values: true or false. It stores its value in a single bit.
    System.out.println("Variable boolean : " + c1bool);
    
  }
}
  

