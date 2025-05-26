package JavaNotes;
public class Conditionals{
    // java has short-circuited evaluation
    // and == &&
    // or == ||
    public int number;
    public String words;

    public Conditionals(int number)
    {
        if (number<5)
        {
            words = "gay";
        }
        else
        {
            words = "Super Gay";
        }
    }

    public int Switches(int number)
    {
        // another conditional
        switch (number)
        {
            case 1: // number == 1 
            number = 1; // body
            break; // have to break or will keep running 
            case 2: // number == 2
            number = 2*2;
            break;
            case 3:
            number = 3*3;
            break;
            case 4:
            number = 4*4;
            break;
            default: // else
            number = 69;
        }
    return number;
    }
    public String Gay()
    {
        return words;
    }
}
