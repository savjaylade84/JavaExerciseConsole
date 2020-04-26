package DesignPatternTest.SingletonPattern;

import DesignPatternTest.SingletonPattern.Singleton;


public class Test {

  public static void main(String[] args) {

     Singleton obj = Singleton.getIntance();
     obj.message("hello I'm back");

  }

}
