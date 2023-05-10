package LongExam;
import java.util.*;

public class main {
    
    public static void main(String[] args){

        

        Locations boracay = new Boracay();
        Locations elNido = new ElNido();
        Locations cagbalete = new Cagbalete();
        Locations mars = new Mars();
        Locations tomorrowLand = new TomorrowLand();
        Locations uk = new UK();

        Tourist a = new Me();
       
        boracay.accept(a);

        elNido.accept(a);

        cagbalete.accept(a);

        mars.accept(a);

        uk.accept(a);

        tomorrowLand.accept(a);
        
    }
    
}
