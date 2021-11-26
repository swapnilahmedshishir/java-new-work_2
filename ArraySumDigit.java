package JavaExercise;
import java.util.Scanner;
public class ArraySumDigit {

  public static void main(String[] args) {
 Scanner input= new Scanner(System.in);

 double[] number = new double[5];
 
 System. out.print("Enter any Five Number ");
 
 for(int i = 0; i< number.length ; i++){
   number[i] = input.nextDouble();
 }
 double sum = 0;
 for(int j = 0; j< number.length; j++){
   sum = sum + number[j];
 }
 System. out.println("total sum "+sum);
 System. out.println("Average "+sum/5);
 
 //maximum number //
 double max = number[0];
 double min = number[0];
 for(int i=0; i< number.length ; i++){
   if(max<number[i]){
     max = number[i];
   }
   if(min>number[i]){
     min = number[i];
   }
 }
 System. out.println("Maximum number "+max);
 System. out.print("Minimum Number "+min);
  }

}
