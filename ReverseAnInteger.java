package JavaExercise;
import java.util.Scanner;
public class ReverseAnInteger {

  public static void main(String[] args) {
  Scanner input = new Scanner(System. in);
  int sum, r, modulas,num;
  
  System. out.print("Enter your number : ");
  num = input.nextInt();
  
  sum = 0;
  modulas = num;
  
  while(modulas!= 0){
    r= modulas%10;
    sum = sum*10+r;
    modulas = modulas/10;
  }
  System. out.print("Reverse number = "+sum);
  }

}
