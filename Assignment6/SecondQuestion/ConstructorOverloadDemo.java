/*
Create a class with two (overloaded) constructors. Using this, call the second constructor inside the first one
 */
public class ConstructorOverloadDemo {
    int a;
    public ConstructorOverloadDemo()
    {
         this(5);
        System.out.println("Constructor  calling without parmeter");
    }

    /**
     * this is constructor with parameter of int type
     * @param a
     */
    public ConstructorOverloadDemo(int a)
    {
        this.a=a;
        System.out.println("constructor calling with parameter "+a);
    }
    public static void main(String[] args)
    {
       ConstructorOverloadDemo CoD = new ConstructorOverloadDemo();
       ConstructorOverloadDemo CoD1= new ConstructorOverloadDemo(10);
    }
}
