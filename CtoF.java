package JavaExercise;
import java.util.Scanner;
public class CtoF {

  public static void main(String[] args) {
  
 Scanner input = new Scanner(System.in);
 
 double celsius, fahrenhit;
 
 System. out.print("Enter your celcius valu : ");
 
 celsius = input.nextDouble();
 
 fahrenhit = (((9*celsius)/5)+32);
 
 System. out.print("celcius to faharenhit converting : "+ fahrenhit );

  }

}
