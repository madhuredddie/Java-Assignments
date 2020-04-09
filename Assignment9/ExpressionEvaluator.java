import java.util.regex.*;
import java.util.*;
public class ExpressionEvaluator {
    /**
     * This method takes string as parameter and returns a boolean value true if the string Starts with
     * Capital letter and ends with period
     *
     * @param sentence
     * @return
     */
    public boolean expressionChecker(String sentence){
        Pattern pattern=Pattern.compile("^[A-Z].*[.,]$");
        Matcher mathcer= pattern.matcher(sentence);
        boolean result=mathcer.matches();
        return result;

    }

    public static void main(String args[]) {
        ExpressionEvaluator EE=new ExpressionEvaluator();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the sentence:");
        String s=scanner.nextLine();

        if(EE.expressionChecker(s)){
            System.out.println("\""+s+"\" the senstence  starts with a capital letter and ends with a period");
        }
        else{
            System.out.println("\""+s+"\"the sentence  does not match the regular expression");
        }


    }
}
