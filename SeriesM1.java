package JavaExercise;
import java. util.Scanner;
public class SeriesM1 {

  public static void main(String[] args) {
 /*1x2x3+...+n */
Scanner input = new Scanner(System. in);

int n, multi = 1;

System. out.print("Enter Your Last Number ");

n = input.nextInt();

for(int i=1;i<=n; i= i+1){
System. out.print(i+"X" +i+" ");
  multi = multi * i;
}
System.out.println();
System. out.print("Muti = " + multi);
  }

}
