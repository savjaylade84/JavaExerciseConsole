package ExerciseProject;

/**

   i imported one of tools in this program
   if you want to check it out my tool that
   i use in this program yeah sure check it 
   if you want to rise an issue in my code
   just put your name and date
   of issue in contributer in etc folder
   And also what is the issue so that i
   can fix it

*/
import  MyTools.DateCompare;


import java.util.Scanner;


public class WhatIsMyAge {

  public static void main(String[] args){
    
    // its a normal program that computing 
    // on what is your age its a simple program
    // that i thought while taking a bath
    // (i thouht that how google know the age of
    //  the person by using their birthday)that
    //  why i come with this program.
    
    DateCompare dc;
    int year,month,day,age;
    
    // i use the modified try catch so that i dont 
    // need to remember to close the scanner
    // and also to prevent that memory leak shit
    
    try(Scanner scan = new Scanner(System.in)){
      
    System.out.println("Enter Current Year:");
    year = scan.nextInt();
    
    System.out.println("Enter Current Month:");
    month = scan.nextInt();    
    
    System.out.println("Enter Current Day:");
    day = scan.nextInt();
    
    dc = new DateCompare(year,month,day);
    
    System.out.println("Enter Birth Year:");
    year = scan.nextInt();
    
    System.out.println("Enter Birth Month:");
    month = scan.nextInt();    
    
    System.out.println("Enter Birth Day:");
    day = scan.nextInt();
    
    age = dc.getMyAge(year,month,day);
    
    System.out.printf("Your Age is : %d",age);
      
    }catch(Exception e){
      
    }
    
    
  }

}
