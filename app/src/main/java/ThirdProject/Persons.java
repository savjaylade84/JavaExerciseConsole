package ThirdProject;

import ThirdProject.Persons;

public class Persons implements person {

  private String fname, mname, lname;

  // shorter way to get the name by using this
  // constructor
  public Persons(String firstname, String middlename, String lastname) {

    setFName(firstname);
    setMName(middlename);
    setLName(lastname);
  }

  public Persons() {

    this.fname = "";
    this.mname = "";
    this.lname = "";
  }

  // setter and getter of the full name of a
  // person
  // this might help to get the specific parts of
  // a name then formatted it to any kind of format
  // to happen that you need to overridden the
  // getName method

  public void setFName(String firstname) {
    this.fname = firstname;
  }

  public String getFName() {
    return fname;
  }

  public void setMName(String middlename) {
    this.mname = middlename;
  }

  public String getMName() {
    return mname;
  }

  public void setLName(String lastName) {
    this.lname = lastName;
  }

  public String getLName() {
    return lname;
  }

  // this the getName method and its use to
  // get any object that implement the person
  // interface
  // its default format is first name,middle name
  // and then last name.you can reformat it just
  // overridden it then your done
  public static String getName(person pn) {
    return pn.getFName() + pn.getMName() + pn.getLName();
  }
}
