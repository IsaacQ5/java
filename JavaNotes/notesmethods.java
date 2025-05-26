package JavaNotes;
public class notesmethods{
    // this is how methods work since the other class has a lot a shit 
    int notes;
    public notesmethods(int par){ //init
        notes = par; 
    }
    public void wordPrint(){
    // public means other classes can use this method, void means the method does not have to return anything
    System.out.println("I love men");
    }
    
    //A method can have the same cool but different parameters
    //Same way a for loop in python doesn't need all 3 parameters but they can change what it does 
    public void cool(String time, String name){
        System.out.println("This methed is the same name but takes 2 parmeters " + time + " and " + name);
    //THIS IS REALLY COOL OMG
    }
    public void cool(String name){
        System.out.println("This method is the same name but takes 1 parmeter " + name);
    }
    // int is saying what datatype should be returning from the class 
    public int number(int num){
        int ans = num * 58;
        return ans;
    }

    // repr
    public String toString(){
        return "This returns a string not a memory address";
    }

}
