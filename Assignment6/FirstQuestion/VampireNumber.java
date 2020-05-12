import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
. A vampire number v is a number with an even number of digits n,
that can be factored into two numbers x and y each with n/2 digits and
not both with trailing zeroes, where v contains precisely all the digits from x and from y, in any order.
Write a java program to print first 100 vampire numbers.
 */
public class VampireNumber {
    /**
     * This method whether the gven number is vampire number and it checks for the permutation of given number and checks
     * it satisfies the given condition
     * @param currentNumber
     * @return
     */
    public boolean isVampireNumber(long currentNumber){
        String currentNumberStr=String.valueOf(currentNumber);
        if(currentNumberStr.length()%2!=0){
            return false;
        }
        ArrayList<String> Permutations=new ArrayList<String>();
        Permutations(currentNumberStr,0,currentNumberStr.length()-1,Permutations);
        for(String currentPermutationStr:Permutations){
            String firstHalf=currentPermutationStr.substring(0,currentNumberStr.length()/2);
            long firstHalfValue=Long.parseLong(firstHalf);
            String secondHalf=currentPermutationStr.substring(currentNumberStr.length()/2);
            long secondHalfValue=Long.parseLong(secondHalf);
            if(firstHalf.charAt(firstHalf.length()-1)=='0' && secondHalf.charAt(secondHalf.length()-1)=='0'){
                return false;
            }

            if(firstHalfValue*secondHalfValue == currentNumber){
                return true;
            }
        }
        return false;
    }

    /**
     * This method prints first 100 vampire numbers by checking each number with isVampire() method
     */
    public void printVampireNumbers(int n){
        Random random= new Random();
        int currentNumber=random.nextInt(n);
        int countOfVampireNumbers=1;
        System.out.println("First 100 Vampire numbers are:");
        while(countOfVampireNumbers<=100){
            if(isVampireNumber(currentNumber)){
                System.out.println(currentNumber);
                countOfVampireNumbers++;
            }
            currentNumber++;
        }
    }
    /**
     * This method finds all the permutations of given String with the start index and end index using recursion
     * and stores each permutation into the given arraylist.
     * @param currentNumberStr
     * @param start
     * @param end
     * @param allPermutations
     */

    public void Permutations(String currentNumberStr, int start, int end, ArrayList<String> allPermutations){
        if(start==end){
            allPermutations.add(currentNumberStr);
        }
        else{
            for(int i=start;i<=end;i++){
                currentNumberStr=swap(currentNumberStr,start,i);
                Permutations(currentNumberStr,start+1,end,allPermutations);
                currentNumberStr=swap(currentNumberStr,start,i);
            }
        }

    }

    /**
     * This method swaps character at given indexes
     * @param currentNumberStr
     * @param index1
     * @param index2
     * @return
     */

    public String swap(String currentNumberStr,int index1,int index2){
        StringBuilder currentNumber=new StringBuilder(currentNumberStr);
        char temp=currentNumber.charAt(index1);
        currentNumber.setCharAt(index1,currentNumber.charAt(index2));
        currentNumber.setCharAt(index2,temp);
        return currentNumber.toString();
    }

    /**
     * this method takes input from the console  and generates random number of upto given size
     */
    void takeinput()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any random number of even size");
        int n=sc.nextInt();
        sc.close();
        printVampireNumbers(n);
    }


    public static void main(String args[]){
        VampireNumber vampireNumber=new VampireNumber();
        vampireNumber.takeinput();
    }
}

