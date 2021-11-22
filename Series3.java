package JavaExercise;
import java.util.Scanner;
public class Series3 {

  public static void main(String[] args) {
  /*1.5+2.5+3.5+...+n */
Scanner input = new Scanner(System. in);

double  n, sum = 0;

System. out.print("Enter Your Last Number ");

n = input.nextDouble();

for(double i=1.5;i<=n; i= i+1){
System. out.print(" " +i);
  sum = sum + i;
}
System.out.println();
System. out.print("sum = " + sum);
  }

}
