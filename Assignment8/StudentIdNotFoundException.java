/**
 * An exception of StudentIdNotFoundException is created by extending the Exception class.
 * A constructor is declared with String parameter and in that method it calls superclass method
 * and passes the string parameter .
 */
public class StudentIdNotFoundException extends Exception {
   public StudentIdNotFoundException(String s)
   {
       super(s);
   }
}
