/*
. Create three interfaces, each with two methods. Inherit a new interface that combines the three,
 adding a new method. Create a class by implementing the new interface and also inheriting from a concrete class.
  Now write four methods, each of which takes one of the four interfaces as an argument.
In main( ), create an object of your class and pass it to each of the methods.
 */
/*
three interfaces with two methods is created
 */
interface IA{
    public void methodIA1();
    public void methodIA2();
}
interface IB{
    public void methodIB1();
    public void methodIB2();
}
interface IC{
    public void methodIC1();
    public void methodIC2();
}
/*
 Icommon interface extends all three interfaces
 */
interface ICommon extends IA,IB,IC{
  public void methodCommon();
}
/*
ConcreteDemo class implents Icommon interface which makes all other interface implementation. In
this class all the methods are defined.
 */
class ConcreteDemo implements ICommon{

    @Override
    public void methodIA1() {
            System.out.println("methodIA1 is implemented");
    }

    @Override
    public void methodIA2() {
        System.out.println("methodIA2 is implemented");
    }

    @Override
    public void methodIB1() {
        System.out.println("methodIB1 is implemented");
    }

    @Override
    public void methodIB2() {
        System.out.println("methodIB2 is implemented");
    }

    @Override
    public void methodIC1() {
        System.out.println("methodIC1 is implemented");
    }

    @Override
    public void methodIC2() {
        System.out.println("methodIC2 is implemented");
    }

    @Override
    public void methodCommon() {
        System.out.println("methodCommon is implemented");
    }
}
/*
class InterafceDemo  inherits the concretedemo class so that all the defines methods will be available to this class.
In this class four methods are defined in such a way that it takes each interface as a parameter to ech method
 */
public class InterafceDemo  extends ConcreteDemo{

    public void executeIA(IA ia)
    {
        ia.methodIA1();
        ia.methodIA2();
    }
    public void executeIB(IB ib){
        ib.methodIB1();
        ib.methodIB2();
    }
    public void executeIC(IC ic){
        ic.methodIC1();
        ic.methodIC2();
    }
    public void excuteMethodCommon(ICommon icommon) {
        icommon.methodCommon();
    }
    public static void main(String[] args)
    {
        InterafceDemo Id= new InterafceDemo();
        ConcreteDemo Cd= new ConcreteDemo();// to pass each interface reference of concretedemo class object is cretaed and
         //passedas an arguemnt to methods of Interfacedemo class
        Id.executeIA(Cd);
        Id.executeIB(Cd);
        Id.executeIC(Cd);
        Id.excuteMethodCommon(Cd);
    }
}
