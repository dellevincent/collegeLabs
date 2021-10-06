import java.util.*;
/**
 * Write a description of class Order here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Order
{
    private ArrayList<SingleOrderItem> order;
    
    public Order(){
        order= new ArrayList<>();
    }
    
    public ArrayList<SingleOrderItem> getOrder(){
        return order;
    }
    
    public void addOrder(SingleOrderItem newOrder){
        order.add(newOrder);
    }
    
    public void removeOrder(SingleOrderItem itemArray){
        order.remove(itemArray);
    }
    
    public boolean searchOrder(String searchString){
        boolean found=false;
        Iterator<SingleOrderItem> itr= order.iterator();
        while(itr.hasNext()){
            SingleOrderItem fd= itr.next();
            if(fd.getItem().getItem().contains(searchString)){
                found=true;
            }
        }
        return found;
    }
    
    public double computeTotalCost(){
        double cost=0;
        for(SingleOrderItem orders:order){
            cost += orders.getQuantity()*(orders.getItem().getPrice());
        }
        return cost;
    }
    
    public HashMap<String, Integer> consolidateOrder(){
        String  foodName=null;
        int quantity=0;
        HashMap<String, Integer> hash=new HashMap<>();
        for(Iterator<SingleOrderItem> itr= order.iterator(); itr.hasNext();){
             SingleOrderItem orders=itr.next();
             quantity +=orders.getQuantity();
             foodName =orders.getItem().getItem();
             hash.put(foodName,quantity);
        }     
        return hash;
    }
}
