/*Create a class with an inner class that has a non-default constructor (one that takes arguments).
        Create a second class with an inner class that inherits from the first inner class.
*
/*
This is first Outer class which has inner class .Inner class has parameterized constructor .
outer1 class and Inner1class have outermethod and Inner1method respectively
 */
 
class Outer1{

    public void outerMethod(){
        System.out.println("this is outer class method");
    }
    class Inner1{
        public Inner1(String s){
            System.out.println("This is in inner class constructor with string parameter "+s);
        }
        public void Inner1method(){
            System.out.println("This is Inner1 Class method");
        }
    }
}
/*
This is Second Outer class which has inner class .Inner2 class has no  parameterized constructor .
outer2 class and Inner2 class have outer2method and Inner2method respectively.Inner2 class inherits the inner1 class of
outer1 class and calls the constructor of super class
 */

class Outer2{
    public void outer2mehod(){
        System.out.println("this is outer2 class method");
    }
    class Inner2 extends Outer1.Inner1{

        public Inner2(){

            new Outer1().super("madhu");
            System.out.println("This is Inner2constructor with no parameter");
        }
        public void Inner2method()
        {
            System.out.println("this is Inner2 class method");
        }
    }
}
/*
In InnerClassDemo objects of outer1 ,inner1 ,outer2 and inner2 classes are created and method in each class are called
with their respective objects
 */
public class InnerClassDemo {
    public static void main (String[] args)
    {
        Outer1 O1= new Outer1();
        Outer1.Inner1 In1= O1.new Inner1("apple");
        O1.outerMethod();
        In1.Inner1method();
        Outer2 O2= new Outer2();
        Outer2.Inner2 In2=O2.new Inner2();
        O2.outer2mehod();
        In2.Inner2method();
    }
}
