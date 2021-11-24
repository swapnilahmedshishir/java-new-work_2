package JavaExercise;
import java.util.Scanner;
public class SumDigitJog {

  public static void main(String[] args) {
   Scanner input = new Scanner(System. in);
   System. out.print("Enter Your digit : ");
   int num = input.nextInt();
   
   int sum = 0,r;
   int moduls = num ;
   
   while(moduls!=0){
     r = moduls % 10;
     sum = sum + r;
     moduls = moduls/10;
   }
   System. out.print("Total Sum = "+sum);
  }

}
