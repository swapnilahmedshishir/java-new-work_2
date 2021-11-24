package JavaExercise;
import java.util.Scanner;
public class PalindromOrNot {

  public static void main(String[] args) {
 Scanner input = new Scanner(System. in);
 int num, sum,mod,r;
 System. out.print("Enter your number ");
 num = input.nextInt();
 
 sum = 0;
 mod = num;
 
 while(mod!=0){
   r = mod%10;
   sum = sum*10+r;
   mod = mod/10;
 }
 if(num==sum){
   System. out.print("This Number  is Palindroma ");
 }else{
   System. out.print("This Number is not Palindroma ");
 }
  }

}
