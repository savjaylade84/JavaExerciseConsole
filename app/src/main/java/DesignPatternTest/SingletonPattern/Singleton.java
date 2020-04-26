package DesignPatternTest.SingletonPattern;

public class Singleton {

    private static Singleton instance = new Singleton();
    
    private Singleton(){}
   
    public static Singleton getIntance(){
      return instance;
    }
    
    public void message(String message){
      System.out.println(message);
    }
}
