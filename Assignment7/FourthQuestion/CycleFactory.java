/*
 Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle.
  Create factories for each type of Cycle, and code that uses these factories.
 */
/*
 Interface cycle is created with three methods declared in it
 */
interface Cycle1{
    public void TotalSeats();
    public void cost();
    public void totalWheels();
}
/*
class Unicycle implements the cycle interface and defines all the methods in the interface
 */
class Unicycle implements Cycle1{

    @Override
    public void TotalSeats() {
        System.out.println("total Number of seats in unicycle is 1");
    }

    @Override
    public void cost() {
        System.out.println("Total cost of unicycle is 1000");

    }

    @Override
    public void totalWheels() {
        System.out.println("Total number of wheels in Unicycle is 1");
    }
}
/*
class Bicycle implements the cycle interface and defines all the methods in the interface
 */
class Bicycle implements Cycle1{

    public void TotalSeats() {
        System.out.println("total Number of seats in bicycle is 2");
    }

    public void cost() {
        System.out.println("Total cost of bicycle is 2000");
    }

    public void totalWheels() {
        System.out.println("Total number of wheels in bicycle is 2");
    }
}
/*
class Tricycle implements the cycle interface and defines all the methods in the interface
 */
class Tricycle implements Cycle1{

    public void TotalSeats() {
        System.out.println("total Number of seats in tricycle is 3 to 4");
    }

    public void cost() {
        System.out.println("Total cost of tricycle is 3000");
    }

    public void totalWheels() {
        System.out.println("Total number of wheels in triicycle is 3");
    }
}
/*
class unicycleFactory extend Unicycle and create a method manufractureProcessOfUnicycle and call all the methods of
superclass
 */
class UnicycleFactory extends Unicycle{
    public void manufactureProcessOfUnicycle(){
        TotalSeats();
        cost();
        totalWheels();
    }

}
/*
class BicycleFactory extend Unicycle and create a method manufractureProcessOfBicycle and call all the methods of
superclass
 */

class BicycleFactory extends Bicycle{
    public void manufactureProcessOfBicycle(){
        TotalSeats();
        cost();
        totalWheels();
    }
}
/*
class tricycleFactory extend Unicycle and create a method manufractureProcessOftricycle and call all the methods of
superclass
 */

class TricycleFactory extends Tricycle {
    public void manufactureProcessOfTricycle() {
        TotalSeats();
        cost();
        totalWheels();
    }
}
/*
class CycleFactory creates the objects of unicyclefactory ,bicyclefactory and tricycleFcatory .
All objects call the manufractureprocessoof each class repectively
 */
public class CycleFactory {
    public static void main(String[] args){
        UnicycleFactory uf= new UnicycleFactory();
        BicycleFactory bf= new BicycleFactory();
        TricycleFactory tf= new TricycleFactory();
        uf.manufactureProcessOfUnicycle();
        bf.manufactureProcessOfBicycle();
        tf.manufactureProcessOfTricycle();

    }

}

