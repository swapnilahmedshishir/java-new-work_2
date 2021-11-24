package JavaExercise;
import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;
public class MyThinking {

  public static void main(String[] args) {
Scanner input = new Scanner (System. in);
int m, n, count= 0;

System. out.print("Enter two value ");

m = input. nextInt();
n= input.nextInt();

for(int i = m; i<=n; i++){
  for(int j = 2; j<i ; j++){
    if(i%j==0){
      count++;
      break ;
    }
    
    }
    if(count!=0){
      System. out.print("prime"+i+"\n");
    }
  count = 0;
  if(count !=0){
      System. out.print("not prime"+i+"\n");
      
  }
}

  }

}
