package LongExam;

public class Cagbalete implements Locations{

     int airFare = 50;

    public void accept(Tourist tourist){
        tourist.visit(this);
    }
    
}
