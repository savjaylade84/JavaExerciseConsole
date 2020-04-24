package SecondProject;

import java.util.HashSet;

public class project {

  private static HashSet<String> setBookName;
  private static HashSet<String> setBookAuthor;
  private static Object[] bookName;
  private static Object[] bookAuthor;

  // initialize
  public static void initObject() {

    setBookName = new HashSet<>();
    setBookAuthor = new HashSet<>();
  }

  // add book name and author in sets
  public static void StoreBook(String name, String author) {

    setBookName.add(name);

    setBookAuthor.add(author);
  }

  // return array of object
  public static Object[] getBook(Object[] name) {

    Object[] temp = name;

    return temp;
  }

  // convert name of books set to array of object
  public static Object[] getName() {

    Object[] name;
    name = getBook(setBookName.toArray());
    return name;
  }

  // convert author of books set to array of object
  public static Object[] getAuthor() {

    Object[] author;
    author = getBook(setBookAuthor.toArray());
    return author;
  }

  public static void main(String[] args) {

    // initialize object
    initObject();

    // create set of book names and authors
    String[] myBookName = {"avenger", "wonderwomen", "spiderman", "Jack in hill"};
    String[] myBookAuthor = {"loop", "pool", "polo", "pool walker"};

    // store those set
    for (int g = 0; (g < myBookName.length) && (g < myBookAuthor.length); g++) {

      StoreBook(myBookName[g], myBookAuthor[g]);
    }

    // get the set of book name
    bookName = getName();
    bookAuthor = getAuthor();

    System.out.println("Books Name:");
    // loop to the array of object then convert those value to string
    for (Object i : bookName) {

      System.out.println(i.toString());
    }

    System.out.println("Books Author:");
    // loop to the array of object then convert those value to string
    for (Object j : bookAuthor) System.out.println(j.toString());
  }
}
