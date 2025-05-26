package JavaNotes;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayNotes {
    //need to import java.util.Arrays to print array not memory address 
    //arrays are just listes but for the same datatype
    String[] list = {"men", "gay", "yes"}; 
    int[] intlist = {0,1,2,3};

    int[] empty = new int[5];
    // empty arrays have a fixed size
    // int is full of 0, strings None, boolean false, and doubles 0.0
    
    public String ListReturn()
    {
        //.length gets the len
        System.out.println(intlist.length);

        empty[3] = 3;
        //this works bc the indexes are filled what the commment says up top
        System.out.println(empty);
        //just the memory address
        System.out.println(Arrays.toString(empty));
        //String of the array
        return "indexes start one zero " + list[1];

    }
    public void AL()
    {
        // arrayList are just lists 
        // <> tell you what data type you are using
        // have to use interger, String, Double, Charater 
        ArrayList<String> List = new ArrayList<String>();
        //append
        List.add("Men");
        //len
        System.out.println(List.size());
        List.add("kms");
        //replace
        List.set(1, "Women");
        //remove
        List.remove(1);
        //find index
        System.out.println(List.indexOf("Men"));
        //ArrayList assortment can list any datatype in the same list 
        System.out.println("You have to use get to GET the index " + List.get(0));
        this.twodList();
    }
    private void twodList()
    {
        //2d arrays are the same as python
        int[][] list = new int[5][5];
        // list[0][1] = value
        // int[][] list = {{value,value}, {value}}
        System.out.println("list: " + Arrays.deepToString(list));
        int row = list.length;
        int col = list[0].length;
        //row major
        for (int i = 0; i<row; i++)
        {
            int num = 0;
            for (int j = 0; j<col; j++)
            {
                num ++;
                list[i][j] = num;
            }
        }
        System.out.println("list: " + Arrays.deepToString(list));
        //col major 
        int num = 1;
        for (int i = 0; i < col; i++)
        {
            for (int j = 0; j< row; j++)
            {
                num ++;
                list[j][i] += num;
            }
            num ++;
        }
        System.out.println("list: " + Arrays.deepToString(list));
    }
}

