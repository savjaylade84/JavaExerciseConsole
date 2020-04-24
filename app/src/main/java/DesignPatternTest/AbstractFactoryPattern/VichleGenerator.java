package DesignPatternTest.AbstractFactoryPattern;

public class VichleGenerator {

  public static VichleFactory getVichleFactory(String type) {

    if (type == null) return null;
    else if (type.equalsIgnoreCase("Car")) return new CarFactory();
    else if (type.equalsIgnoreCase("Airplane")) return new AirplaneFactory();

    return null;
  }
}
