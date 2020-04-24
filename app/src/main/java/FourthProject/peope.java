package FourthProject;

public class peope {

  private int x, y;

  public String say(String message) {
    return message;
  }

  // this will give the exact location point
  // of the person
  public void setPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // retrieve x and y location point
  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  // walk forward and backward
  // that it's means I just shorten it
  // because I'm to lazy to write a very
  // long method name
  public void WalkUpDown(boolean Up) {

    if (Up) Spoke("Person Goes Up At Location x:" + (++x));
    else Spoke("Person Goes Down At Location" + (--x));
  }

  // it's just walk left and right
  public void WalkLeftRight(boolean Right) {

    if (Right) Spoke("Person Goes Right At Location x:" + (++y));
    else Spoke("Person Goes Left At Location:" + (--y));
  }

  // I use it to shorten the printing method
  // java
  private void Spoke(String message) {
    System.out.println(message);
  }
}
