package JavaNotes;
import java.util.ArrayList;
public class loops {
    
    public void whiles()
    {
        int loop = 0;
        // while loops are just conditionals that loop in the {}
        while(loop<5)
        {
            System.out.println(loop);
            loop++;
        }
    }
    public void fors()
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(1);
        list.add(2);
        //for loops define the variable, set the conditona, and incremnet the variable
        for (int i = 0; i < 3; i++)
        {
            System.out.println(i);
        }
        
        // : means in so it gets the value in the array
        for (int values:list)
        {
            System.out.println(values);
        }

        // going through the list with indexes dont need anyting different 
        for (int i = 0; i < 3; i++)
        {
            System.out.println("for loop index" + list.get(i));
        }
    }
}
