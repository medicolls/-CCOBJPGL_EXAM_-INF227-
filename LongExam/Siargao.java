package LongExam;


public class Siargao implements Locations{

    int airFare = 70;

    public void accept (Tourist tourist){
        tourist.visit(this);
    }

    
}
