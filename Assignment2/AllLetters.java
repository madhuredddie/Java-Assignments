import java.util.*;
public class AllLetters {
    /**
     * This method takes string as parameter.It keeps the count of all letters in the string
     * and returns true if string contains all alphabets otherwise it returns false
     * @param input
     * @return
     */
    public boolean alphabetChecker(String input) {
        int[] counts= new int[26] ;  // this function takes an array of size 26 of int type
        Arrays.fill(counts, 0);
        input = input.toLowerCase();
        int n=input.length();
        for (int i = 0; i < n; i++) {       //this loop executes for n+1 times
            if(input.charAt(i)>='a' && input.charAt(i)<='z') {     //this condition executes for n times
                int indexInCounts = input.charAt(i) - 'a';
                counts[indexInCounts]++;
            }
        }
        for (int i = 0; i < counts.length; i++) {     //this loops executes for constant times i,e of 26 times
            if (counts[i] == 0) {       //
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Input String to check whether it contains all alphabets or not :");
        String s=scanner.nextLine();
        AllLetters Al= new AllLetters();
        boolean result=Al.alphabetChecker(s);

        if(result==true){
            System.out.println("the string  \" "+s+"\" contains all alphabets");
        }
        else{
            System.out.println("the string  \" "+s+"\" does not contains all alphabets");
        }
    }
}

