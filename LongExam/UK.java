package LongExam;

public class UK implements Locations{

    int airFare = 200;

    public void accept(Tourist tourist){
        tourist.visit(this);
    }
    
}
