/**
 * An exception of StudentNameNotFoundException is created by extending the Exception class.
 * A constructor is declared with String parameter and in that method it calls superclass method
 * and passes the string parameter .
 */
public class StudentNameNotFoundException extends Exception {
    public StudentNameNotFoundException(String s)
    {
        super(s);
    }
}
