package DesignPatternTest.FactoryPattern;

import DesignPatternTest.FactoryPattern.carFactory;


public class test {

  public static void main(String[] args) {
    
    carFactory cf = new carFactory();
    
    car c;
    
    c = cf.getCar("lamborgini");
    c.go();
    
    c = cf.getCar("ferrari");
    c.go();
    
    c = cf.getCar("bmw");
    c.go();
    
    
  }

}
