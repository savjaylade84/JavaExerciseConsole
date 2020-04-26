package ExerciseProject;

import java.util.Scanner;

public class fibonacci {

  static long fibc(long i) {

    if (i >= 1) System.out.printf("<=(%d)", i);

    if (i == 0) return 0;

    return (i + fibc(i - 1));
  }

  public static void main(String[] args) {

    try (Scanner scan = new Scanner(System.in)) {
      long num;

      System.out.println("<<:Fibonacci Program:>>");

      System.out.print("Enter Number for Fibonacci:");

      num = scan.nextLong();

      if (num > 0 && num < 2171) System.out.printf("\n((add all))\n(Result : %d) ", fibc(num));
      else throw new Exception("\n(Warning)Stack and Heap in" + "\nthe Memory are Colliding\n ");

    } catch (Exception e) {
      System.out.print("(Stack Over Flow Heap) " + e);
    }
  }
}
