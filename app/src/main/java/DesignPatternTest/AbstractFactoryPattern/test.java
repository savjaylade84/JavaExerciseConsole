package DesignPatternTest.AbstractFactoryPattern;

import DesignPatternTest.AbstractFactoryPattern.Airplane;
import DesignPatternTest.AbstractFactoryPattern.VichleFactory;
import DesignPatternTest.AbstractFactoryPattern.VichleGenerator;

public class test {
	
	public static void main(String[] args) {
	
	  /**
	      This pattern is same of factory pattern
	      But more complex by its flow chart and
	      I try to get coded it I got some error
	      In some files,Actually it's messy to 
	      Debug it because you have to trace every
	      Class that depend on it but I fix it and 
	      Great now.this pattern is making factory
	      Of factory that generate a instance of
	      Object and yeah its confusing in the
	      first time but its enjoyable at the end. 
	      Also I add some test there to check if
	      It's really generate instance of objects
	  
	  */
	
	    //generate vichle variations 
		VichleFactory vf;
		
		Car c;
		Airplane ap;
		
		//turn to car factory 
		vf = VichleGenerator.getVichleFactory("Car");
		assert(vf != null);
		 
		c = vf.getCar("lamborgini");
		assert(c != null); 
		c.go();
		
		c = vf.getCar("ferrari");
		assert(c != null);
		c.go();
		
		c = vf.getCar("bmw");
		assert(c != null);	
		c.go();
		
		//turn to Airplane factory
		vf = VichleGenerator.getVichleFactory("Airplane");	
		assert(vf != null );
		
		ap = vf.getAirPlane("Commercial Plane");
		assert(ap != null );
		ap.fly();
		
		ap = vf.getAirPlane("Jet");
		assert(ap != null );
		ap.fly();
		
		ap = vf.getAirPlane("Fighter Jet ");
		assert(ap != null );
		ap.fly();
		
	}
}