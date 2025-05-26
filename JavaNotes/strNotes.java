package JavaNotes;
public class strNotes {
    public String word = "I love men";
    public String word2 = "I really really love men";
    public void Strings()
    {
        // UpperCase
        System.out.println(word.toUpperCase());
        // lowerCase 
        System.out.println(word.toLowerCase());
        // finds the length 
        System.out.println(word.length());
        // adds an odd string 
        System.out.println(word.concat(word2)); 
        // finds the index 
        System.out.println("men " + word.indexOf("love"));
        // where is the char
        System.out.println("men "+ word.charAt(4));
        // string slicing 
        System.out.println("men " + word.substring(2,6));
        // Strings are objects so you need to compare the instances
        System.out.println("men " + word.equals(word2));
        // checks them but ingores the upperCase and lowerCase
        System.out.println("men " + word.equalsIgnoreCase(word2));
    }
}
