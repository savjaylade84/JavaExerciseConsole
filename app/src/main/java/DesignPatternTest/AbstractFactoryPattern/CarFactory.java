package DesignPatternTest.AbstractFactoryPattern;

public class CarFactory implements VichleFactory {

  @Override
  public Car getCar(String model) {

    if (model == null) return null;
    else if (model.equalsIgnoreCase("lamborgini")) return new lamborgini();
    else if (model.equalsIgnoreCase("ferrari")) return new ferrari();
    else if (model.equalsIgnoreCase("bmw")) return new bmw();

    return null;
  }

  @Override
  public Airplane getAirPlane(String model) {
    return null;
  }
}
