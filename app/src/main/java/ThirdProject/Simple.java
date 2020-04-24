package ThirdProject;

/** I use generic class with some Restriction of what data types can be use in this class */
public class Simple<t extends Number> {

  private t numone;

  // setter and getter of this class
  public t getNumone() {
    return numone;
  }

  public void setNumone(t one) {
    this.numone = one;
  }

  // print the object to a console
  public void printMe(t one) {

    System.out.println(one);
  }

  // convert object to string
  public String toString(t one) {

    String m = one.toString();

    return m;
  }

  // concatenated those two object
  public String addConcatonate(t one, t two) {

    return String.format(one + " " + two);
  }
}
