package DesignPatternTest.AbstractFactoryPattern;

public  interface VichleFactory {

  Car getCar(String model);

  Airplane getAirPlane(String model);
}
