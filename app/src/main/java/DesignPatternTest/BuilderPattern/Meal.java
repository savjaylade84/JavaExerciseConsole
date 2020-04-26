package DesignPatternTest.BuilderPattern;
import DesignPatternTest.BuilderPattern.Item;
import java.util.ArrayList;
import java.util.List;
public class Meal {



  private List<Item> items = new ArrayList<Item>();
  
  public void addItem(Item item){
    
    assert(item == null);
    items.add(item);
    
  }
  
  public float getCost(){
    
    float totalCost = 0.0f;
    for(Item item : items)
        totalCost += item.price();
        
     return totalCost;
    
  }
  
  public void showItems(){
    
    for(Item item : items){
      
      System.out.println(
      
      "\nItem : " + item.name() +
      ",\nPacking : " + item.packing().pack() +
      ",\nCost : " + item.price());
      
    }
    
  }
}
