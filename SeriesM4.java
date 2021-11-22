package JavaExercise;
import java.util.Scanner;
public class SeriesM4 {

  public static void main(String[] args) {
 /*1^2x2^2x3^2+...+n */
Scanner input = new Scanner(System. in);

int n, multi = 1;

System. out.print("Enter Your Last Number ");

n = input.nextInt();

for(int i=1;i<=n; i= i+1){
System. out.print(i+"X" +i+" ");
  multi = (multi * (i*i));
}
System.out.println();
System. out.print("Muti = " + multi);
  }

}
