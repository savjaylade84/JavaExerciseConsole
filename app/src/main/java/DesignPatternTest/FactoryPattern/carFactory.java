package DesignPatternTest.FactoryPattern;

// set a variation cars
// then assign to
// those variation its
// exact variant
public class carFactory {

  public car getCar(String carType) {

    if (carType == null) return null;
    else if (carType.equalsIgnoreCase("lamborgini")) return new lamborgini();
    else if (carType.equalsIgnoreCase("ferrari")) return new ferrari();
    else if (carType.equalsIgnoreCase("bmw")) return new bmw();

    return null;
  }
}
