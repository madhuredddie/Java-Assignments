import java.util.Scanner;

/**
 * Create a generic, singly linked list class called SList, which, to keep things simple,
 * does not implement the List interface.
 * @param <T>
 */
class SList<T>  {

    SLLNode<T> head=new SLLNode<>(null);
    SListIterator<T> iterator;

    SList(){
        iterator=new SListIterator<T>(head);
    }
    public  SListIterator<T> iterator()
    {
        return iterator;
    }
    public String toString() {


        SListIterator<T> it = this.iterator();
        if(it.getHead() == null) return "SList: []";

        StringBuilder s = new StringBuilder();

        while(it.hasNext()) {

            s.append(it.next() + (it.hasNext() ? ", " : ""));
        }
        it.setCurrentNode();
        return "SList: [" + s.toString() + "]";
    }

}

/**
 * Create your own SListIterator which, again for simplicity, does not implement ListIterator.
 * The only method in SList other than toString( ) should be iterator( ), which produces an SListIterator.
 * @param <T>
 */
class SListIterator<T> {

    int size;
    SLLNode<T> currentNode;
    SLLNode<T> head;

    public SListIterator(SLLNode<T> head)
    {
        size=0;
        this.head=head;
    }

    public void setCurrentNode(){
        currentNode=head.next;
    }
    public SLLNode<T> getHead(){
        return head.next;
    }

    public boolean hasNext()
    {
        return currentNode != null;
    }

    public T next()
    {
        T data = currentNode.data;
        currentNode = currentNode.next;
        return data;
    }
//  this is insert method
    public void insert(T data){

        SLLNode<T> newNode=new SLLNode<T>(data);
        SLLNode<T> temp=currentNode;
        if(currentNode==null){
            currentNode=newNode;

            head.next=currentNode;
        }
        else {


            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = null;

        }

        size++;

    }

//  this is remove method
    public void remove()
    {
        T removedValue;
        if(size>1) {
            SLLNode<T> secondLast = currentNode;
            while (secondLast.next!=null && secondLast.next.next != null) {
                secondLast = secondLast.next;
            }
            removedValue = secondLast.next.data;
            System.out.println("Removed data is "+removedValue);
            secondLast.next = null;
            size--;

        }
        else if(size==1){
            removedValue = currentNode.data;
            currentNode=null;
            System.out.println("Removed data is "+removedValue);
            size--;
        }
        else if(size==0){
            System.out.println("list is empty");
        }

    }

}
class SLLNode<T> {
    SLLNode<T> next;
    T data;

    public SLLNode(T data)
    {
        this.data = data;
        this.next = null;
    }
}
public class GenericListDemo {
    public void printOptions(){
        System.out.println("Options are:\n1.Insert\n2.Remove\n3.Display\n4.Exit");
    }
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);
        SList<Integer> myList=new SList<Integer>();

        SListIterator<Integer> iterator=myList.iterator();

        GenericListDemo driver=new GenericListDemo();

        driver.printOptions();
        System.out.println("Enter your option:");
        int option=scanner.nextInt();

        while(option!=4){

            if(option==1){
                System.out.print("Enter the number to add:");
                int value=scanner.nextInt();
                iterator.insert(value);
            }
            else if(option==2){
                iterator.remove();
            }
            else if(option==3)
            {

                System.out.println(myList);   //using toString()

            }
            driver.printOptions();
            System.out.println("Enter your option:");
            option=scanner.nextInt();

        }


    }
}
