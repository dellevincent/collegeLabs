import java.util.*;
/**
 * This Class is date class. It keeps track of all the days in the month
 * and the day of the month.
 * 3 fields- day, month and daysOfMonth
 * @author (Vincent Delle)
 * @version (version number 1)
 */
public class Date{
    /* 
     * the 3 fields of the Date class, realize how the fields are public
     * This allows the public fields to be used outside of this class.
     * */
    private int daysOfMonth;
    public int day;
    public int month;
    
    /**
     * Constructor for objects of class Date
     * The Constructor of the class Date, this class initializes the 
     * fields.
     */
    public Date(int day, int month){
       this.day=day; 
       this.month=month;
       daysOfMonth=daysInTheMonth(month);
    }
    
     /**
     * Getter method that returns the value of the field month
     */
    public int getMonth(){
        return month;
    }
    
     /**
     *Getter method that returns the value of the field day
     */
    public int getDay(){
        return day;
    }
    
     /**
     *Getter method that returns the value of the field daysOfMonth
     */
    public int getDaysOfMonth(){
        return daysOfMonth;
    }
    
    /**
     *Mutator method that sets the day in the Class
     */
    public void setDay(int day){
        this.day=day;
    }
    
    /**
     *Mutator method that sets the month in the Class
     */
    public void setMonth(int month){
        this.month=month;
    }
    
    /**
     *Overloaded accessor method that sets and returns the value of field
     *daysOfMonth when then month is input
     */    
    public int daysInTheMonth(int month){
        int daysOfMonth=0;
        if(month==1){
            daysOfMonth=31;
        }
        else if(month==2){
            daysOfMonth=29;
        }
        else if(month==3){
            daysOfMonth=31;
        }
        else if(month==4){
            daysOfMonth=30;
        }
        else if(month==5){
            daysOfMonth=31;
        }
        else if(month==6){
            daysOfMonth=30;
        }
        else if(month==7){
            daysOfMonth=31;
        }
        else if(month==8){
            daysOfMonth=31;
        }
        else if(month==9){
            daysOfMonth=30;
        }
        else if(month==10){
            daysOfMonth=31;
        }
        else if(month==11){
            daysOfMonth=30;
        }
        else if(month==12){
            daysOfMonth=31;
        }
        return daysOfMonth;
    }
}
