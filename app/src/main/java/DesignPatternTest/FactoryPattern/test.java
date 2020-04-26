package DesignPatternTest.FactoryPattern;

import DesignPatternTest.FactoryPattern.carFactory;


public class test {

  public static void main(String[] args) {
    
    /**
         This pattern which I study its hide 
         The creation of objects under the hood
         Then I run some test using assert()
         if I can Try to code the pattern according 
         to It's flow chart. 
    
    */
    
    //generate car variation object
    carFactory cf = new carFactory();
    
    car c;
    
    /**
        Yes I use race car as car variation :) 
        Because Race car are awesome. 
    
    */
    
    c = cf.getCar("lamborgini");
    assert(c != null);
    c.go();
    
    c = cf.getCar("ferrari");
    assert(c != null);
    c.go();
    
    c = cf.getCar("bmw");
    assert(c != null);
    c.go();
    
    
  }

}
