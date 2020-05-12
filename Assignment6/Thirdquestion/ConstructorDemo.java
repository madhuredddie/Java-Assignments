/*
Create a class with a constructor that takes a String argument. During construction, print the argument.
 Create an array of object references to this class, but don’t actually create objects to assign into the array.
 When you run the program, notice whether the initialization messages from the constructor calls are printed.
 */
public class ConstructorDemo {
     /*
      this is constructor with string as parameter it is printed during execution
      */
    public ConstructorDemo(String s)
    {
        System.out.println("Constructor is called with String "+s);
    }
    public static void main(String[] args)
    {
        ConstructorDemo[] Cd= new ConstructorDemo[5];//array reference to it is created of this class . By doing this way
                                                    // constructor is not called
       for(int i=0;i<5;i++)
       {
           Cd[i]= new ConstructorDemo(String.valueOf(i+1));//initialise automatically prints the message from constructor
       }
    }
}
