
/**
 * The Zodiac Class creates an array of signs, start dates, 
 * and end dates of the Zodiac signs. This class allows users to 
 * search and view thier Zodiac signs by date or name
 * 3 fields- startDate, endDate, and sign
 * @author (Vincent Delle)
 * @version (version number 1)
 */
public class Zodiac extends Date{
    private Date[] startDate;
    private Date[] endDate;
    private String[] sign;
    
    /**
     * Constructor for objects of class Zodiac
     * The Constructor of the class Zodiac, this class initializes the 
     * fields.
     */
    public Zodiac(int day, int month){ 
        super(day,month);
        sign= new String[12];
        startDate= new Date[12];
        endDate= new Date[12];
        sign[0]="Aries";
        sign[1]="Taurus";
        sign[2]="Gemini";
        sign[3]="Cancer";
        sign[4]="Leo";
        sign[5]="Virgo";
        sign[6]="Libra";
        sign[7]="Scorpio";
        sign[8]="Sagittarius";
        sign[9]="Capricon";
        sign[10]="Aquarius";
        sign[11]="Pisces";

        Date date1 =new Date(21,3);
        Date date2 =new Date(20,4);
        Date date3 =new Date(21,5);
        Date date4 =new Date(21,6);
        Date date5 =new Date(23,7);
        Date date6 =new Date(23,8);
        Date date7 =new Date(23,9);
        Date date8 =new Date(23,10);
        Date date9 =new Date(22,11);
        Date date10 =new Date(22,12);
        Date date11 =new Date(20,1);
        Date date12 =new Date(19,2);
        startDate[0]=date1;
        startDate[1]=date2;
        startDate[2]=date3;
        startDate[3]=date4;
        startDate[4]=date5;
        startDate[5]=date6;
        startDate[6]=date7;
        startDate[7]=date8;
        startDate[8]=date9;
        startDate[9]=date10;
        startDate[10]=date11;
        startDate[11]=date12;

        Date endDate1= new Date(19,4);
        Date endDate2= new Date(20,5);
        Date endDate3= new Date(20,6);
        Date endDate4= new Date(22,7);
        Date endDate5= new Date(22,8);
        Date endDate6= new Date(22,9);
        Date endDate7= new Date(22,10);
        Date endDate8= new Date(21,11);
        Date endDate9= new Date(21,12);
        Date endDate10= new Date(19,1);
        Date endDate11= new Date(18,2);
        Date endDate12= new Date(20,3);
        endDate[0]=endDate1;
        endDate[1]=endDate2;
        endDate[2]=endDate3;
        endDate[3]=endDate4;
        endDate[4]=endDate5;
        endDate[5]=endDate6;
        endDate[6]=endDate7;
        endDate[7]=endDate8;
        endDate[8]=endDate9;
        endDate[9]=endDate10;
        endDate[10]=endDate11;
        endDate[11]=endDate12;
    }
    
    /**
     * Accessor method that returns the Zodiac name of the date
     */
    public String zodiacByDate(){
        Date dt=new Date(day,month);
        String[] dateMonth= new String[dt.daysInTheMonth(month)];
        int index= day-1;
        boolean found=true;
        if(index!=-1 && day<dateMonth.length ){        
            if(month==3 && day>=21){
                dateMonth[index]="Aries";
                found=true;
            }
            else if(month==4 && day<=19){
                dateMonth[index]="Aries";
                found=true;
            }
            else if(month==4 && day>19){
                dateMonth[index]="Taurus";
                found=true;
            }
            else if(month==5 && day<=20){
                dateMonth[index]="Taurus";
                found=true;
            }
            else if(month==5 && day>=21){
                dateMonth[index]="Gemini";
                found=true;
            }
            else if(month==6 && day<=20){
                dateMonth[index]="Gemini";
                found=true;
            }
            else if(month==6 && day>=21){
                dateMonth[index]="Cancer";
                found=true;
            }
            else if(month==7 && day<=22){
                dateMonth[index]="Cancer";
                found=true;
            }
            else if(month==7 && day>=23){
                dateMonth[index]="Leo";
                found=true;
            }
            else if(month==8 && day<=22){
                dateMonth[index]="Leo";
                found=true;
            }
            else if(month==8 && day>=23){
                dateMonth[index]="Virgo";
                found=true;
            }
            else if(month==9 && day<=22){
                dateMonth[index]="Virgo";
                found=true;
            }
            else if(month==9 && day>=23){
                dateMonth[index]="Libra";
                found=true;
            }
            else if(month==10 && day<=22){
                dateMonth[index]="Libra";
                found=true;
            }
            else if(month==10 && day>=23){
                dateMonth[index]="Scorpio";
                found=true;
            }
            else if(month==11 && day<=21){
                dateMonth[index]="Scorpio";
                found=true;
            }
            else if(month==11 && day>=22){
                dateMonth[index]="Sagittarius";
                found=true;
            }
            else if(month==12 && day<=21){
                dateMonth[index]="Sagittarius";
                found=true;
            }
            else if(month==12 && day>=22){
                dateMonth[index]="Capricon";
                found=true;
            }
            else if(month==1 && day<=19){
                dateMonth[index]="Capricon";
                found=true;
            }
            else if(month==1 && day<=20){
                dateMonth[index]="Aquarius";
                found=true;
            }
            else if(month==2 && day<=18){
                dateMonth[index]="Aquarius";
                found=true;
            }
            else if(month==2 && day>=19){
                dateMonth[index]="Pisces";
                found=true;
            }
            else if(month==3 && day<=20){
                dateMonth[index]="Pisces";
                found=true;
            }
            else{
                found=false;
            }

            return "Your Zodiac Sign is " +dateMonth[index];
        }

        else{
            return "Please enter a valid date";
        }
    }
    
    /**
     * Overloaded Accessor method that returns the Zodiac start and end date
     * of the Zodiac Name
     */
    public String zodiacDate(String zodiacName){
        int index=0;
        boolean found=false;
        for(index=0; !found && index<= sign.length; index++){
            if(sign[index].toLowerCase().equals(zodiacName.toLowerCase().trim())){
                 found=true;
                 index=index-1;
            }
        }

        if(!found){
            return "Invalid Zodiac name.";
        }
        else{
            return sign[index]+ " start Date " +Integer.toString(startDate[index].getMonth()) + "/" + Integer.toString(startDate[index].getDay()) + 
            " and end date " + Integer.toString(endDate[index].getMonth())+ "/" + Integer.toString(endDate[index].getDay());
        }
    }
    
    /**
     * Accessor method that returns the Zodiac start date of the
     * Zodiac Name
     */
    public String zodiacStartDate(String zodiacName){
        int index=0;
        boolean found=false;
        for(index=0; !found && index<= sign.length; index++){
            if(sign[index].toLowerCase().equals(zodiacName.toLowerCase().trim())){
                found=true;
                index=index-1;
            }
        }

        if(!found){
            return "Invalid Zodiac name.";
        }
        else{
            return sign[index]+ " start Date " +Integer.toString(startDate[index].getMonth()) + "/" + Integer.toString(startDate[index].getDay());
        }
    }
    
    /**
     * Accessor method that returns the Zodiac end date of the
     * Zodiac Name
     */
    public String zodiacEndDate(String zodiacName){
        int index=0;
        boolean found=false;
        for(index=0; !found && index<= sign.length; index++){
            if(sign[index].toLowerCase().equals(zodiacName.toLowerCase().trim())){
                found=true;
                index=index-1;
            }
        }

        if(!found){
            return "Invalid Zodiac name.";
        }
        else{
            return sign[index]+ " " + Integer.toString(endDate[index].getMonth())+ "/" + Integer.toString(endDate[index].getDay());
        }
    }
    
    /**
     * Overloaded Accessor method that returns the Zodiac name of a
     * date
     */
    public String zodiacByDate(int month, int day){
        Date dt=new Date(day,month);
        String[] dateMonth= new String[dt.daysInTheMonth(month)];
        int index= day-1;
        boolean found=true;
        if(index!=-1 && day<dateMonth.length ){        
            if(month==3 && day>=21){
                dateMonth[index]="Aries";
                found=true;
            }
            else if(month==4 && day<=19){
                dateMonth[index]="Aries";
                found=true;
            }
            else if(month==4 && day>19){
                dateMonth[index]="Taurus";
                found=true;
            }
            else if(month==5 && day<=20){
                dateMonth[index]="Taurus";
                found=true;
            }
            else if(month==5 && day>=21){
                dateMonth[index]="Gemini";
                found=true;
            }
            else if(month==6 && day<=20){
                dateMonth[index]="Gemini";
                found=true;
            }
            else if(month==6 && day>=21){
                dateMonth[index]="Cancer";
                found=true;
            }
            else if(month==7 && day<=22){
                dateMonth[index]="Cancer";
                found=true;
            }
            else if(month==7 && day>=23){
                dateMonth[index]="Leo";
                found=true;
            }
            else if(month==8 && day<=22){
                dateMonth[index]="Leo";
                found=true;
            }
            else if(month==8 && day>=23){
                dateMonth[index]="Virgo";
                found=true;
            }
            else if(month==9 && day<=22){
                dateMonth[index]="Virgo";
                found=true;
            }
            else if(month==9 && day>=23){
                dateMonth[index]="Libra";
                found=true;
            }
            else if(month==10 && day<=22){
                dateMonth[index]="Libra";
                found=true;
            }
            else if(month==10 && day>=23){
                dateMonth[index]="Scorpio";
                found=true;
            }
            else if(month==11 && day<=21){
                dateMonth[index]="Scorpio";
                found=true;
            }
            else if(month==11 && day>=22){
                dateMonth[index]="Sagittarius";
                found=true;
            }
            else if(month==12 && day<=21){
                dateMonth[index]="Sagittarius";
                found=true;
            }
            else if(month==12 && day>=22){
                dateMonth[index]="Capricon";
                found=true;
            }
            else if(month==1 && day<=19){
                dateMonth[index]="Capricon";
                found=true;
            }
            else if(month==1 && day<=20){
                dateMonth[index]="Aquarius";
                found=true;
            }
            else if(month==2 && day<=18){
                dateMonth[index]="Aquarius";
                found=true;
            }
            else if(month==2 && day>=19){
                dateMonth[index]="Pisces";
                found=true;
            }
            else if(month==3 && day<=20){
                dateMonth[index]="Pisces";
                found=true;
            }
            else{
                found=false;
            }

           return "Your Zodiac Sign is " + dateMonth[index]; 
        }

        else{
            return "Please enter a valid date";
        }
    }
}
