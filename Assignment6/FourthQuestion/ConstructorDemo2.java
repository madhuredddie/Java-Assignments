/*
Create a class with a constructor that takes a String argument. During construction,
 print the argument. Create an array of object references to this class,
  but don’t actually create objects to assign into the array. When you run the program,
   notice whether the initialization messages from the constructor calls are printed.

4. Complete the previous exercise by creating objects to attach to the array of references
 */
public class ConstructorDemo2 {
    /*
    this constructor for ConstructorDemo2 which takes string as parameter
     */
    public ConstructorDemo2 (String s){
        System.out.println("Constructor is called "+s);

    }
    /*
    this method takes string as parameter .This method is created to check whether objects attache array refernce is
    working efficiently
     */
    public  void checkreference(String s)
    {
        System.out.println(s);
    }
    public static void main(String[] args){
        ConstructorDemo2[] CD= new ConstructorDemo2[5];// array reference of object is created
        ConstructorDemo2 cd1= new ConstructorDemo2("1");// here the objects are created which invokes the constructor
        ConstructorDemo2 cd2= new ConstructorDemo2("2");
        ConstructorDemo2 cd3= new ConstructorDemo2("3");
        ConstructorDemo2 cd4= new ConstructorDemo2("4");
        ConstructorDemo2 cd5= new ConstructorDemo2("5");
         //here the objects are attached to the array
        CD[0]=cd1;
        CD[1]=cd2;
        CD[2]=cd3;
        CD[3]=cd4;
        CD[4]=cd5;
        // Checking the object attached to array refernce objects by calling the method
        for(int i=0;i<5;i++)
        {
            CD[i].checkreference("Attached object to array reference is checked for object cd"+(i+1));
        }


    }

}
