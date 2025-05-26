package JavaNotes;
public class notes {
    // declare field
    public String store;
    //instance fields or instance variables
    public int price;
    public double weight;
    public boolean rotten;
    // constructor method with a parameter
    public notes(String name, int prices, double kg, boolean yes){
        //instance field
        // parameter value assigend to the field vars
        // public is -----
        // notes is the class and the datatype used in the main class
        //
        store = name;
        price = prices;
        weight = kg;
        rotten = yes;
    // you can have multipe constructors, we make them differnet by the parameters
    }
}
