package JavaExercise ;
import java.util.Scanner ;
public class UserInputMandNValue {

  public static void main(String[] args) {
 Scanner input = new Scanner(System. in);
 int m, n;
 
 System. out.print("Enter Your inisitial Number ");
 m = input.nextInt();
 
 System. out.print("Enter Your End Number ");
 n = input.nextInt();
 
 int sum = 0;
 
 for(int i = m; i<=n; i++){
   sum = sum + i;
 }
 System. out.print("total Value  = "+sum);
  }

}
