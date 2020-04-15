/**
 * An exception of StudentSubjectNotFoundException is created by extending the Exception class.
 * A constructor is declared with String parameter and in that method it calls superclass method
 * and passes the string parameter .
 */
public class StudentSubjectNotFoundException extends Exception {
    public StudentSubjectNotFoundException(String s)
    {
        super(s);
    }
}
