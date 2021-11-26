package JavaExercise;
import java.util.Scanner;
public class SumOfMatrix {

  public static void main(String[] args) {
Scanner input = new Scanner(System. in);

int[][] a = new int[3][3];

System. out.println("Enter Your Matrix Number : ");
for(int i = 0; i<3; i++){
  for(int j =0; j<3; j++){
    a[i][j] = input.nextInt();
  }
}

for(int i = 0; i<3; i++){
  for(int j= 0; j<3; j++){
    System. out.print("\t\t"+a[i][j]);
  }
  System. out.println();
}

int SumOfDiagonal = 0;
int SumOfUpperTriangla = 0; 
int sumOfLowerTriangla = 0;

for(int i =0; i<3; i++){
  for(int j = 0; j<3; j++){
    
    if(i==j){
      SumOfDiagonal = SumOfDiagonal + a[i][j];
    }
    if(i<j){
      SumOfUpperTriangla = SumOfUpperTriangla + a[i][j];
    }
    if(i>j){
      sumOfLowerTriangla = sumOfLowerTriangla + a[i][j];
    }
  }
}

System. out.println("SumOfDiagonal = "+SumOfDiagonal);
System. out.println("SumOfUpperTriangla = "+SumOfUpperTriangla);
System. out.print("sumOfLowerTriangla = "+sumOfLowerTriangla);
  }
  
  

}
