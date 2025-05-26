package JavaNotes;
public class child {

    private String name;
    // protected is list private but a subclass can access it
    protected int age;
    private boolean white;

    public child(String name, int age, boolean white)
    {
        this.name = name;
        this.age = age;
        this.white = white;
    }
    public void sayname()
    {

        System.out.println("I am a child and my name is " + this.name);
    }
    public void isWhite()
    {
        if (this.white)
        {
            System.out.println("I am white");
        }
        else{
            System.out.println("I am not white");
        }
    }
    //final means the method can not be changed
    public final void whatisage()
    {
        System.out.println("My age is " + this.age);
    }
    public void myChild(child yes)
    {
        System.out.println("my child's name is " + yes.name + " and he is " + yes.age + " years old");
    }
}
//extends means the class is a subclass
class child2 extends child {

    child2()
    {
        // super sets all the parameters for you 
        super("Isaac", 15, true);
    }

    public void better()
    {
        System.out.println("I am the better child ");
    }
    @Override
    public void isWhite()
    {
        System.out.println("I hate black people");
    }
}