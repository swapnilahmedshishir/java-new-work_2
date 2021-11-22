package JavaExercise;
import java.util.Scanner;
public class FactorialJava {

  public static void main(String[] args) {

 Scanner input = new Scanner(System. in);
 int m, fact = 1;
 
 System. out.print("Enter your factorial number ");
 
 m = input.nextInt();
 
 for(int i = m; i>=1; i--){
 System. out.print(i+" ");
   fact = fact*i;
 }
 System. out.println();
 System. out.print(m+"! = "+fact);
  }

}
