package LongExam;


public class Boracay implements Locations{

    int airFare = 100;

    public void accept(Tourist tourist){
        tourist.visit(this);
    }
    
}
