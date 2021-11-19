package JavaExercise;
import java.util.Scanner;
public class FtoC {

  public static void main(String[] args) {
Scanner input = new Scanner(System. in);

double F, C;

System. out.print("Enter your Farenheit value : ");

F = input. nextDouble();

C = ((5*(F-32))/9);

System. out.print("Farenheit to celsius converting value : "+ C);
  }

}
