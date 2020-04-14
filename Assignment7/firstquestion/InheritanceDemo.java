/*
1. Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc.
In the base class, provide methods that are common to all Rodents, and override
these in the derived classes to perform different behaviors depending on the specific type of Rodent.
Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods
 to see what happens.Make the methods of Rodent abstract whenever possible and
  all classes should have default constructors that print a message about that class.
 */
/*
this is abstract class Rodents .In this three abstract methods are declared
 */
 abstract class Rodents
        {
         abstract void eat();
         abstract void sleep();
         abstract void run();
        }
        /*
        Class mouse is extending abstract class Rodents and implementing the abstract method in abstract class
         */
        class Mouse extends Rodents{
         public Mouse()
         {
             System.out.println("Mouse is a small mammal with short fur, a pointed face, and a long tail");
         }
            @Override
            void eat() {
            }

            @Override
            void sleep() {
                System.out.println("Mouse is sleeping");
            }

            @Override
            void run() {
               System.out.println("Mouse is running");
            }
        }
/*
Class Gerbel is extending abstract class Rodents and implementing the abstract method in abstract class
*/
        class Gerbil extends Rodents{
     public Gerbil()
     {
         System.out.println(" Gerbil a small animal, similar to a mouse with long back legs, that is often kept as a pet");
     }
     @Override
            void eat() {
                System.out.println(" Gerbil is eating");
            }

            @Override
            void sleep() {
                System.out.println(" Gerbil is Sleeping");
            }

            @Override
            void run() {
                System.out.println(" Gerbil is running");
            }
        }
/*
Class Hamster is extending abstract class Rodents and implementing the abstract method in abstract class
*/
        class Hamster extends Rodents{
        public Hamster(){
            System.out.println("Hamsters are rodents belonging to the subfamily Cricetinae, which contains 19 species classified in seven genera.");
        }
            @Override
            void eat() {
                System.out.println(" Hamster is eating");
            }

            @Override
            void sleep() {
                System.out.println(" Hamster is sleeping");
            }

            @Override
            void run() {
                System.out.println(" Hamster is running");
            }
        }
public class InheritanceDemo {
     public static void main(String[] args)
     {
         Rodents[] rodent = new Rodents[3];
         rodent[0]=new Mouse();
         rodent[0].eat();
         rodent[0].run();
         rodent[0].sleep();

         rodent[1]=new Gerbil();
         rodent[1].eat();
         rodent[1].run();
         rodent[1].sleep();

         rodent[2]=new Hamster();
         rodent[2].eat();
         rodent[2].run();
         rodent[2].sleep();


     }

}
