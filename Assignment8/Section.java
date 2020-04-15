/*
Create three new types of exceptions. Write a class with a method that throws all three.
 In main( ), call the method but only use a single catch clause that will catch all three types of exceptions.
Add a finally clause and verify that your finally clause is executed, even if a NullPointerException is thrown.
 */
/*
 I have created class section which has arraylist studentname,studentid ans studentsubject.
 I have declared a constructor which add elements to the arraylist of each type
 */
import java.util.ArrayList;

public class Section {
    private ArrayList<String> studentsName;
    private ArrayList<Integer> studentsID;
    private ArrayList<String> studentsSubject;
     public Section(){
         studentsName= new ArrayList<String>();
         studentsName.add("madhu");
         studentsName.add("pavan");
         studentsName.add("sriram");
         studentsID = new ArrayList<Integer>();
         studentsID.add(1);
         studentsID.add(2);
         studentsID.add(3);
         studentsSubject= new ArrayList<String>();
         studentsSubject.add("Science");
         studentsSubject.add("Social");
         studentsSubject.add("basic computer skills");
     }

    /**
     * This method takes name ,id and subject as parameter od string ,int and String respectively.
     * It checks for name ,id and subject ,if not found throws an exception
     * @param name
     * @param id
     * @param subject
     * @throws StudentNameNotFoundException
     * @throws StudentIdNotFoundException
     * @throws StudentSubjectNotFoundException
     */
     public void checkStudents(String name,int id,String subject) throws StudentNameNotFoundException,StudentIdNotFoundException,StudentSubjectNotFoundException
     {
         if(studentsName.contains(name))
         {
             System.out.println("Student with name "+name+" found in the section");
         }
         else
         {
             throw new  StudentNameNotFoundException("Student with name"+name+" not found in the section");
         }
         if(studentsID.contains(id))
         {
             System.out.println("Student with id "+id+" found in the section");
         }
         else
         {
             throw new  StudentIdNotFoundException("Student with id"+id+" not found in the section");
         }
         if(studentsSubject.contains(subject))
         {
             System.out.println(subject+" will be taught to the students ");
         }
         else
         {
             throw new  StudentSubjectNotFoundException("this "+subject+" will  not be taught to the students ");
         }
     }

    /**
     * It is main method ,In this object of section class is created and called the checkstudent method in try block.
     * catch block is also declared to handle the excepion.At last finally block is wriiten which tells message of
     * checking is done
     * @param args
     */
     public static void main(String[] args)
     {
         Section ss=  new Section();
         try{
             //ss.checkStudents("rahul",1,"Social");
            // ss.checkStudents("madhu",4,"Social");
             ss.checkStudents("madhu",2,"telugu");
         }
         catch (Exception e)
         {
             System.out.println(e);
         }
   finally {
             System.out.println("checking the students in section is done");
         }

     }

}
