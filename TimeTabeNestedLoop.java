package JavaExercise;
import java.util.Scanner;
public class TimeTabeNestedLoop {

  public static void main(String[] args) {
Scanner input = new Scanner (System. in);
int X, Y ;
System. out.print("Enter Your Start Number ");
X = input.nextInt();

System. out.print("Enter Your End Number ");
Y = input.nextInt();

for(int i = X; i<=Y; i++){
  for(int j = 1; j<=10; j++){
    System.out.print(i+"X"+j+" = "+(i*j)+"\n");
  }
  System. out.print("\n\n");
}

  }

}
