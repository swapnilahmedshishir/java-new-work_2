package JavaExercise;
import java.util.Scanner;
public class TimeTable {

  public static void main(String[] args) {

Scanner input = new Scanner (System. in);
int x,Multi = 1;
System. out.print("Enter Your Number ");

x = input.nextInt();
for(int i = 1 ; i <= 10; i++){
  System. out.print(x+"X"+i+" = "+ x*i+"\n");
}
  }

}
