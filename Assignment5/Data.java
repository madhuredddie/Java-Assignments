public class Data {
    int mVariable1;
    char mVariable2;

    /**
     * This method prints the member variables
     */
    public void printMemberVariables() {
        System.out.println("Variable1 in the class Data:" + mVariable1);
        System.out.println("Variable2 in the class Data:" + mVariable2);
    }


    /**
     * the method printLocalVariable gives complie time error since they are not initialize
     * In java local variables are not initialized to default values they have to explicitly initialized and
     * this error can be solved by initailzing the local variables
     *
     */
    /*
    public void printLocalVariables() {
        int localVariable1;
        char localVariable2;
        System.out.println("LocalVariable1 in the class Data:" + localVariable1);
        System.out.println("LocalVariable2 in the class Data:" + localVariable2);
    }
     */

}
