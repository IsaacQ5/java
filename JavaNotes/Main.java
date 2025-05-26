package JavaNotes;

public class Main{ //class

    public static void main(String[] args){//method
        // public means use anywhere
        // void means return nothing 
        // main is the name
        // String[] is array of string 
        // args is the list name 
        // args is how you get terminal arguments 
        // javac Main.java
        // java Main (whatever parameter)
        // System.out.println(args[0]);
        notes note = new notes("apple", 23, 12.3, true);
        // NM is better bc of notes being bad 
        notesmethods NM = new notesmethods(12345678);
        // notes is like a datatype. note is the name of the varible
        System.out.println(note.rotten); // arguments
        System.out.println(note);
        System.out.println(NM.notes);
        // note is just a memeory address bc its a referece to a datatype
        // rather then a primitve data type 

        // the dot operator  is how you call methods
        NM.wordPrint(); 

        // This method can take one or two parameters 
        NM.cool("This is time", "This is name");
        // works for one or two
        NM.cool("this only took one");

        int num = NM.number(3);
        System.out.println(num);
        
        // NM has a String return 
        System.out.println(NM);

        
        Conditionals cm = new Conditionals(5);
        System.out.println(cm.Gay());
        System.out.println(cm.Switches(3));
        System.out.println(cm.Switches(47));

        //Array Notes 
        ArrayNotes an = new ArrayNotes();
        System.out.println(an.ListReturn());
        //Array list 
        an.AL();

        //loop notes 
        loops L = new loops();
        L.whiles();
        L.fors();

        // string methods notes 
        strNotes sn = new strNotes();
        sn.Strings();

        //private notes
        keywords kw = new keywords(30, "win", "men");
        //word2 private but the method is not so you can set the variable in the method
        kw.setword("I love men");
        System.out.println(kw.Word());
        //kw.helpWord() wont work bc its private 
        //same with the variables 

        // when a method is static you do not need to make an object to run the method
        // static methods can not be used in non static methods
        System.out.println(keywords.st());

        // inheritance and polymorphism notes
        child me = new child("carmen", 82, false);
        me.sayname();
        me.isWhite();

        child meme = new child2();
        //this is really just for method override
        meme.isWhite();
        // meme.better(); does not work bc child does not have the method
        me.myChild(meme);

        child2 childs = new child2();
        childs.better();
        // you can use an array list of classes and loop thourgh to use methods but I am not doing all of that
        
        // even tho this make an error, it does not stop the run time bc catch does not run the block of code
        trys.errors();

    }   
}

