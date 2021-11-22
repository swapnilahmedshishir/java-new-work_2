package JavaExercise;
import java.util.Scanner;
public class Series2 {

  public static void main(String[] args) {
  // 1+3+5+..+n
 Scanner input = new Scanner(System. in);

int n, sum = 0;

System. out.print("Enter Your Last Number ");

n = input.nextInt();

for(int i=1;i<=n; i= i+2){
  System. out.print(" " +i);
  sum = sum + i;
}
System. out.println();
System. out.print("sum = " + sum);
  }

}
