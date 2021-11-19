package JavaExercise;

import JavaExercise.Example;


public class Example {
int slary;

public void show(){
  int value = 2;
  
  value = value + 10;
  System.out.println("the total day worke " + value);
  slary = 10900;
  System.out.print("your total salary " + slary);
}

public static void main(String[] args) {
Example eg = new Example ();
eg.show();
}
}
