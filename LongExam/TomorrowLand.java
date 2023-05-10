package LongExam;

public class TomorrowLand implements Locations{

    int airFare = 1000;


    public void accept(Tourist tourist){
        tourist.visit(this);
    }

    
    
}
