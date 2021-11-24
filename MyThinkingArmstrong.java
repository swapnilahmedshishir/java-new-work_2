package JavaExercise;
import java. util.Scanner;
public class MyThinkingArmstrong {

  public static void main(String[] args) {
  Scanner input = new Scanner(System. in);
  int n,m;
 System. out.print("Give a Number  Above 10 : ");
  n = input.nextInt();
  
  System. out.print("Give a Number Below 1000 : ");
  m = input.nextInt();
  
  for(int i = m; i<=n; i++){
     int sum = 0;
    int mod,r;
    mod = i ;
    while (mod!=0){
      r = mod%10;
      sum = sum + r*r*r;
      mod = mod/10;
    }
    if(i==sum){
      System . out.print("Armstrong Number : "+sum+" ");
    }
    }
    
  }
  
  }


