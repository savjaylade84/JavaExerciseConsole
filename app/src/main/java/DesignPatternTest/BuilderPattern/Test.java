package DesignPatternTest.BuilderPattern;

import DesignPatternTest.BuilderPattern.MealBuilder;


public class Test {

  public static void main(String[] args) {
  
  MealBuilder mb = new MealBuilder();
  
  Meal m1 = mb.Conservative();
  m1.showItems();
  System.out.println("Total Cost :" + m1.getCost());
  
  Meal m2 = mb.nonConservative();
  m2.showItems();
  System.out.println("Total Cost :" + m2.getCost());
  
  }

}
