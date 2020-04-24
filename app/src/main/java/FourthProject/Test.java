package FourthProject;

import FourthProject.peope;

// the preTest and postTest is just a
// experiment of the topic I want to
// recall because I forgot it
class preTest {

  public void testMe() {
    peope ppl = new peope();
    assert ("hello world" == ppl.say("hello world"));
  }
}

class postTest extends preTest {

  @Override
  public void testMe() {
    peope ppl = new peope();
    assert ("I'm Jayson" == ppl.say("I'm jayson"));
  }
}

public class Test {
  public static void main(String[] args) {

    // testing the preTest and postTest
    preTest t1 = new preTest();
    t1.testMe();
    postTest t2 = new postTest();
    t2.testMe();
    // testing the movement of a person
    peope person = new peope();
    person.setPoint(200, 200);
    person.WalkUpDown(true);
    person.WalkLeftRight(false);
    System.out.println(person.say(person.getX() + " : " + person.getY()));
  }
}
