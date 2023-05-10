package LongExam;


public class ElNido implements Locations{

     int airFare = 70;

    public void accept(Tourist tourist){
        tourist.visit(this);
    }
    
}
