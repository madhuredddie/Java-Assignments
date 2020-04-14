/*
Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle
. Create instances of all three types and upcast them to an array of Cycle.
Try to call balance( ) on each element of the array and observe the results.
 Downcast and call balance( ) and observe what happens.
 */
//class cycle which is base class and it has two methods numberOfWheels and SeatCapacity
class Cycle {
     public void numberOfWheels(){
         System.out.println("It depend on the type of cycle");
     }
     public void seatCapacity(){
         System.out.println("Capacity depends on type of cycle");
     }
}
/*
     Class unicycle is created which extends cycle class and it overrides the methods numberofwhhels and
     seatCapacity
      */
     class UniCycle extends Cycle {
         public void numberOfWheels() {
             System.out.println(" unicycle total wheels is 1 ");
         }

         public void seatCapacity() {
             System.out.println("Unicycle Capacity is 1");
         }
         public void balance(){
             System.out.println("Balance of unicycle is not stable");
         }
     }
/*
Class biicycle is created which extends cycle class and it overrides the methods numberofwhhels and
seatCapacity
 */
     class BiCycle extends Cycle{
         public void numberOfWheels() {
             System.out.println(" bicycle total wheels is 2 ");
         }

         public void seatCapacity() {
             System.out.println("bicycle Capacity is 2 to 3");
         }
         public void balance(){
             System.out.println("Balance of bicycle is not stable");
         }
     }
     /*
     Class tricycle is created which extends cycle class and it overrides the methods numberofwhhels and
     seatCapacity
      */
     class TriCycle extends Cycle{
         public void numberOfWheels() {
             System.out.println(" tricycle total wheels is 2 ");
         }

         public void seatCapacity() {
             System.out.println("tricycle Capacity is 2 to 3");
         }

     }
     public class CycleDemo{
    public static void main(String[] args)
         {
             UniCycle un= new UniCycle();
             BiCycle  bi= new BiCycle();
             TriCycle tri=new TriCycle();
             // the array of cycle class is created
             Cycle[] cc= new Cycle[3];
             //here upcasting for unicycle bicycle nad tricycle classes are upcasted to superclass cycle
             cc[0]= (Cycle)un;
             cc[1]=(Cycle)bi;
             cc[2]=(Cycle)tri;

             for(int i=0;i<3;i++)
             {
                //cc[0].balance();
                /*
                 by calling balance method from the upcasting with array refernce of cycle class with all the
                 other classes it gives error since balance method is not in the cycle class.
                 Object in the cycle class can call only methods which are in cycle class
                 */
                cc[i].numberOfWheels();
                cc[i].seatCapacity();
                /* the  above methods executes succesfully

                 */
             }
             Cycle c1= new UniCycle();
             Cycle c2= new BiCycle();
             Cycle c3= new TriCycle();
             // here downcasting of  cycle class is done to respective classes
             UniCycle un1=(UniCycle)c1;
             BiCycle bi1=(BiCycle)c2;
             TriCycle tri1=(TriCycle)c3;
             un1.balance();//this method call is executed succesfully
             bi1.balance();
             //tri1.balance();
             /* here tri1.balance method gives error because balance method is not in the tricycle class

              */


         }
     }
