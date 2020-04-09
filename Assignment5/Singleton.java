/*Create another class in package yourname.assignment.singleton containing a non static String member variable.
 Add a static method that takes String as parameter and initialize the member variable and
  then return object of that class. Add a non static method to print the String.
 */
public class Singleton {
    String memberVariable;

    /**
     * this is static method which takes String as parameter and returns the object of singleton class
     * This method gves compile time error because static method try to acces the non static member
     * to overcome this error the member variable of of non static type can be accessed by creating the object
     * and accessing the member variable with the object
     * @param s
     * @return
     */
     public static Singleton singletonMethod(String s)
     {
        // memberVariable=s;
         Singleton ss= new Singleton();
         //System.out.println(ss.memberVariable);
         return ss;
     }

    /**
     * this method prints the member variable of the class;
     */
    public void printString()
     {
         System.out.println("membervariable of singleton class"+memberVariable);
     }
}
