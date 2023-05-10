package LongExam;
import java.util.*;


public class Me implements Tourist{

     static int budget = 1000;

    static ArrayList<String> places = new ArrayList<String>();
    static String [] place = {};
    


     @Override
     public void checkBudget() {
         System.out.println("Remaining budget: " + budget);
         System.out.println();
         
     }

   public void visit(){
       System.out.println("Enjoying my stay at ");
    }


@Override
public void visit(Boracay boracay) {
    
    if(budget>=boracay.airFare){
        budget -= boracay.airFare;
        visit();
        System.out.println("Ayayay boracay");
        checkBudget();
    }
    else{
        System.out.println("You cannot visit this location. Poor!");
        checkBudget();
    }
}

@Override
public void visit(Mars mars) {
    if(budget>=mars.airFare){
        budget -= mars.airFare;
        visit();
        System.out.println("⌿⎍⎎⎎ ⌿⎍⎎⎎ ⌿⎍⎎⎎");
        checkBudget();
    }
    else{
        System.out.println("You cannot visit this location. Poor!");
    }
}

@Override
public void visit(ElNido elNido) {
    if(budget>=elNido.airFare){
        budget -= elNido.airFare;
        visit();
        System.out.println("Bonjour Palawan");
        checkBudget();
    }
    else{
        System.out.println("You cannot visit this location. You poor thing!");
    }
}

@Override
public void visit(Cagbalete cagbalete) {
    if(budget>=cagbalete.airFare){
        budget -= cagbalete.airFare;
        visit();
        System.out.println("Sa Mauba`y, ang mga bangka`y nagkakarera`y");
        checkBudget();
    }
    else{
        System.out.println("You cannot visit this location. Poor!");
        
    }
}

@Override
public void visit(Siargao siargao) {
    if(budget>=siargao.airFare){
        budget -= siargao.airFare;
        visit();
        System.out.println("Kumusta Siargao");
        checkBudget();
    }
    else{
        System.out.println("You cannot visit this location. Poor!");
        
    }
}

@Override
public void visit(UK uk) {
    if(budget>=uk.airFare){
        budget -= uk.airFare;
        visit();
        System.out.println("Hello bri`ish peeps");
        checkBudget();
    }
    else{
        System.out.println("You cannot visit this location. Poor!");
        
    }

}

@Override
public void visit(TomorrowLand tomorrowLand) {
    if(budget>=tomorrowLand.airFare){
        budget -= tomorrowLand.airFare;
        visit();
        System.out.println("3! 2! 1! Go!");
        checkBudget();
    }
    else{
        System.out.println("Oops! You cannot visit this location. Poor!");
        
    }
}


   
    
  
}

  
