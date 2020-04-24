package DesignPatternTest.AbstractFactoryPattern;

import DesignPatternTest.AbstractFactoryPattern.Airplane;
import DesignPatternTest.AbstractFactoryPattern.VichleFactory;
import DesignPatternTest.AbstractFactoryPattern.VichleGenerator;


public class test {

     public static void main(String[] args){
       
       VichleFactory vf;
       Car c;
       Airplane ap;
       
       vf = VichleGenerator.getVichleFactory("Car");
       
       c = vf.getCar("lamborgini");
       c.go();
       
       c = vf.getCar("ferrari");
       c.go();
       
       c=vf.getCar("bmw");
       c.go();
       
       vf = VichleGenerator.getVichleFactory("Airplane");
       
       ap=vf.getAirPlane("Commercial Plane");
       ap.fly();
       
       ap=vf.getAirPlane("Jet");
       ap.fly();
       
       ap=vf.getAirPlane("Fighter Jet ");
       ap.fly();
       
       
     }

}
