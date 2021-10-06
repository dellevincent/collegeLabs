
/**
 * Write a description of class FoodItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FoodItem
{
    private String item;
    private double price;
    
    public FoodItem(String item, double price){
        this.item=item;
        this.price=price;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getItem(){
        return item;
    }
    
    public void setPrice(double newPrice){
        price=newPrice;
    }
    
    public void setItem(String newItem){
        item=newItem;
    }
}
