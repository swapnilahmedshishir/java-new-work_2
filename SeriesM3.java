package JavaExercise;
import java.util.Scanner;
public class SeriesM3 {

  public static void main(String[] args) {
  /*1.5x2.5x3.5+...+n */
Scanner input = new Scanner(System. in);

double n, multi = 1;

System. out.print("Enter Your Last Number ");

n = input.nextDouble();

for(double i=1.5;i<=n; i= i+1){
System. out.print("("+i+"X" +i+") ");
  multi = multi * i;
}
System.out.println();
System. out.print("Muti = " + multi);
  }

}
