package LongExam;
interface Tourist {

    void visit();

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
        
    };
    void visit(Boracay boracay);
    void visit(Mars mars);
    void visit(ElNido elNido);
    void visit(Cagbalete cagbalete);
    void visit(Siargao siargao);
    void visit(UK uk);
    void visit(TomorrowLand tomorrowLand);


    void checkBudget();
    
}
