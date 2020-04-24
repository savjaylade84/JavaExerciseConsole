package FirstProject;

public class Project {

  public static void main(String[] args) {

    // Use to get value from the keyboard
    // Scanner scan = new Scanner(System.in);

    // ask user to enter any number
    // System.out.println("enter any number");
    // int i = scan.nextInt();

    // print the value of user input number
    // System.out.println("your number is :");
    // System.out.println(i);

    // draw triangle shape
    for (int ii = 0; ii < 10; ii++) {

      // create spaces in the left part
      for (int g = 10; g > ii; g--) {
        System.out.print(" ");
      }

      // draw the line of asterisk
      for (int j = 0; j < ii; j++) {

        System.out.print(" *");
      }

      // create new line
      System.out.println();
    }

    // draw the inverted triangle shape
    for (int ii = 10; ii > 0; ii--) {

      // create spaces in the left part
      for (int g = 10; g > ii; g--) {
        System.out.print(" ");
      }

      // draw the asterisk line
      for (int j = 0; j < ii; j++) {

        System.out.print(" *");
      }

      // create new line
      System.out.println();
    }

    System.out.println();

    // create space between shape
    // System.out.println();

    // for(int ii=0;ii < 20;ii++){
    // for(int j=0;j < 10; j++){
    // System.out.print(" * ");

    // }

    // create new line
    // System.out.println();

    // }

  }
}
