package ThirdProject;

import ThirdProject.Persons;

public class Project {

  public static void main(String[] args) {

    // testing the simple objects

    Simple<Double> simple = new Simple<Double>();

    Simple<Double> simple2 = new Simple<Double>();

    simple.setNumone(80.0000);

    System.out.println(simple.getNumone());

    simple2.setNumone(90.00000);

    System.out.println(simple2.getNumone());

    System.out.println(simple.addConcatonate(simple.getNumone(), simple2.getNumone()));

    // testing the person Persons objects

    Persons me1 = new Persons();
    me1.setFName("john jayson");
    me1.setMName("Bartolay");
    me1.setLName("De Leon");

    Persons me2 = new Persons();
    me2.setFName("john");
    me2.setMName("fog");
    me2.setLName("Leon");

    Persons me3 = new Persons();
    me3.setFName("loop");
    me3.setMName("pool");
    me3.setLName("foo");

    System.out.println(Persons.getName(me3));
    System.out.println(Persons.getName(me2));
    System.out.println(Persons.getName(me1));
  }
}
