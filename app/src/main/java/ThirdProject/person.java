package ThirdProject;

public interface person {

  void setFName(String firstname);

  String getFName();

  void setMName(String middlename);

  String getMName();

  void setLName(String lastName);

  String getLName();

  static String getName(person pn) {
    return "";
  }
}
