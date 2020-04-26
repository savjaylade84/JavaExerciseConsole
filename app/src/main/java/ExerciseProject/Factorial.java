package ExerciseProject;

public class Factorial {

  static int factor(int i) {

    System.out.println(i);

    if (i == 1) return 1;
    else return (i * factor(i - 1));
  }

  public static void main(String[] args) {

    /**
     * don't put big number if your Computer can't do it properly and yes it will crash your
     * computer.
     */
    System.out.println("<<:Factorial Program:>>");

    // you can change this number
    System.out.print(factor(5));
  }
}
