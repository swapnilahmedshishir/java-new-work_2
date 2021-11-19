package JavaExercise;
import java.util.Scanner;

public class TriangleValue {

  public static void main(String[] args) {
 
 Scanner value = new Scanner(System.in);
 
 int base,height;
 
 System. out.print("Enter your base & height value :");
 
 base = value.nextInt();
 
 height = value.nextInt();
 
 int triangle = ((base*height)/2);
 
 System.out.print("total value of tiangle : "+ triangle);
 
  }

}
