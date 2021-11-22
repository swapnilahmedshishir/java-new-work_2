package JavaExercise;
import java.util.Scanner;
public class SeriesM2 {

  public static void main(String[] args) {
  /*1x3x5+...+n */
Scanner input = new Scanner(System. in);

int n, multi = 1;

System. out.print("Enter Your Last Number ");

n = input.nextInt();

for(int i=1;i<=n; i= i+2){
System. out.print(i+"X" +i+" ");
  multi = multi * i;
}
System.out.println();
System. out.print("Muti = " + multi);
  }

}
