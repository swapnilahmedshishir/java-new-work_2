package JavaExercise;
import java.util.Scanner;

public class ControlStatement {

  public static void main(String[] args) {
  Scanner input = new Scanner(System. in);
  
  int num ;
  
  System.out.print("Enter any number : ");
  
  num = input.nextInt();
  
  if(num > 0){
    System. out.print("This number is positive ");
    
  }else if ( num < 0){
    System. out.print("This number is negative ");
  }else if (num == 0 ){
    System. out.print("This is a zero ");
  }else{
    System. out.print("Your not a give number ");
  }

  }

}
