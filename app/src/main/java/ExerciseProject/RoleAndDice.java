package ExerciseProject;

import java.util.Scanner;
import java.util.regex.Pattern;
public class RoleAndDice {

  public static void main(String[] args) {
       
     int die1;
     int die2;
     int total_roll;
     
     //while(true){
     

     die1 = (int)(Math.random() * 6);
     die2 = (int)(Math.random() * 6);
     total_roll = die1 + die2;
     
     System.out.print(
     "\nDice Rolls:"+
     "\nDice 1:" + die1 +
     "\nDice 2:" + die2 +
     "\nTotal Roll:" + total_roll
     );
       
     System.out.println(isYes("Yes"));
     System.out.println(isYes("Y"));
     System.out.println(isYes("yes"));
     System.out.println(isYes("y"));
     
     System.out.println(isYes("No"));
     System.out.println(isYes("N"));
     System.out.println(isYes("no"));
     System.out.println(isYes("n"));
        
     //}
    
  
    
  }
  
  
  public static boolean isYes(String answer){
   if(Pattern.matches("y[es]?",answer.toLowerCase()))
          return true;
          
     return false;
  }
  
  public static boolean isNo(String answer){
               if(Pattern.matches("n[o]?",answer.toLowerCase()))
          return true;
          
      return false;
  }
  
  public static String answer(){
    
    String answer = "";
    try(Scanner scan = new Scanner(System.in)){
    
      System.out.print("\nDo You Want to Exit:[y:yes | n:no]");
     answer = scan.next();
     return answer;

    }catch(Exception ex){
      System.out.println(ex);
    }
    return answer;
   } 
        
  
} 


