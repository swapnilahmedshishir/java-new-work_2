package JavaExercise;
import java.util.Scanner;
public class ArrayMatix {

  public static void main(String[] args) {
Scanner input = new Scanner(System. in);
int[][] a = new int[2][3];
int[][] b = new int[2][3];

System. out.println("ENTER YOUR A VALUE : ");
for(int row = 0 ; row<2; row++){
  for(int col = 0 ; col<3; col++){
    System. out.printf("A[%d][%d] = ",row,col);
    a[row][col] = input.nextInt();
  }
}
System. out.println("Enter your B value : ");
for(int row = 0; row<2; row++){
  for(int col = 0; col<3; col++){
   System. out.printf("B[%d][%d] = ",row,col);
    b[row][col]= input.nextInt();
  }
}


System. out.println("A =");

for(int row = 0 ; row<2; row++){
  for(int col = 0; col<3; col++){
    System. out.print("\t\t"+a[row][col]);
  }
  System.out.println();
}
System. out.print("\n\n");
System. out.println("B =");

for(int row = 0 ; row<2; row++){
  for(int col = 0; col<3; col++){
    System. out.print("\t\t"+b[row][col]);
  }
  System.out.println();
}

System. out.print("\n\n");
System. out.println("A+B = ");

for(int row=0; row<2; row++){
  for(int col=0; col<3; col++){
    System. out.print("\t\t"+ (a[row][col] + b[row][col]));
  }
  System. out.print("\n");
}

  }

}
