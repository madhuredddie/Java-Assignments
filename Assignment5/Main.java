/**
 * Create main class in package yourname.assignment.main,
 * create object of first class and call both the methods to print the values.
 * Create object of second class using static method and then call the other method to print the String.
 */
public class Main {
    public static void main(String[] args)
    {
        Data dd= new Data();
        dd.printMemberVariables();
        //dd.printLocalVariables();
        Singleton ss=  Singleton.singletonMethod("madhu");
        ss.printString();

    }
}
