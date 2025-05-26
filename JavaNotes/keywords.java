package JavaNotes;
public class keywords {
    // private means it can not be called outside of the class
    // static means it can be used without making an object of the class\
    private static String sword = "Hello";
    private String word;
    private String word2;
    private int num;

    public keywords(int num, String word, String word2)
    {
        //this is just list self 
        this.num = num;
        this.word = word;
        this.word2 = word2;
        // this sets num as a input number from the parameter 
    }
    public String Word()
    {
        //calling a helper method, you need to use this bc its calling itself 
        this.helpWord();
        return this.word;
    }
    public String setword(String set)
    {
        this.word2 = set;
        return this.word2;
    }
    //you can make private method, the perpose just being helper functions 
    private String helpWord()
    {
        this.word += this.word2;
        return this.word;
    }
    public static String st()
    {
        return sword;
    }

}
