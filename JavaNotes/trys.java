package JavaNotes;
public class trys {
    //try catch is try this block of code and catch this error
    public static void errors()
    {
        int width = 0;
        int length = 40;
        try
        {
            int ratio = length/width;
            System.out.println(ratio);
        }catch(ArithmeticException e){
            System.err.println("ArithmeticException" + e.getMessage());
        }
    }
}
