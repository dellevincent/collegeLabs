import java.util.*;
/**
 * Write a description of class SingleOrderItem here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SingleOrderItem
{
    private FoodItem foodItem;
    private int quantity;
    
    public SingleOrderItem(FoodItem foodIItem, int quantity){
        this.foodItem=foodItem;
        this.quantity=quantity;
    }
    
    public FoodItem getItem(){
        return foodItem;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setItem(FoodItem newFoodItem){
        foodItem=newFoodItem;
    }
    
    public void setQuantity(int newQuantity){
        quantity=newQuantity;
    }
}
