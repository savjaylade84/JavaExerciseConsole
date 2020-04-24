package DesignPatternTest.AbstractFactoryPattern;

public class AirplaneFactory implements VichleFactory {

  @Override
  public Car getCar(String model) {
    return null;
  }

  @Override
  public Airplane getAirPlane(String model) {

    if (model == null) return null;
    else if (model.equalsIgnoreCase("Commercial Plane")) return new CommercialPlane();
    else if (model.equalsIgnoreCase("Jet")) return new Jet();
    else if (model.equalsIgnoreCase("Fighter Jet ")) return new FighterJet();

    return null;
  }
}
