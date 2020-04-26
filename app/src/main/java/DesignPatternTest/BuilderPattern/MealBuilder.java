package DesignPatternTest.BuilderPattern;
import DesignPatternTest.BuilderPattern.Meal;
public class MealBuilder {

    public Meal Conservative() {

        Meal meal = new Meal();
        meal.addItem(new Jollibee1());
        meal.addItem(new Kopiko2());

        return meal;
    }

    public Meal nonConservative() {

        Meal meal = new Meal();
        meal.addItem(new Jollibee3());
        meal.addItem(new Kopiko3());

        return meal;
    }
}
