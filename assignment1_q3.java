import java.util.*;
public class assignment1_q3 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    float a = sc.nextFloat();
    float b = sc.nextFloat();
    float c = sc.nextFloat();
    float a1 = a + b + c;
    System.out.println(a1);
    float Product = a1 + (0.18f * a1);
    System.out.println(Product);
  }  
}
