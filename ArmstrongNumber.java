package JavaExercise;
import java.util.Scanner;
public class ArmstrongNumber {

  public static void main(String[] args) {
 Scanner input = new Scanner(System. in);
 int num,r,mod,sum;
 
 System. out.print("Enter your Number ");
 num = input.nextInt();
 
 sum = 0;
 mod = num;
 while(mod!=0){
   r= mod%10;
   sum= sum + r*r*r;
   mod= mod/10;
 }
 if(num==sum){
   System. out.print("this Number is Armstrong ");
 }else{
   System. out.print("this Number is not Armstrong ");
 }
  }

}
