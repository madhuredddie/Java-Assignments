

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Create a java program to search through the home directory and look for files that match a regular expression.
 * The program should be able to take inputs repeatedly and should print out the full absolute path
 * of the matching files found.
 */

public class FileSearch {

    /**
     *thw method getfiles takes input File as parameter .It  checks for the exsistence of directory and inserts all files
     * in the directory.If any directories are present it is added to the queue .From each directory it searches for files
     * and adds it to allfiles and returns the all fles.
     *
     *
     * @param directory
     * @return
     */
    public ArrayList<File> getFiles(File directory)
    {
       ArrayList<File> addFile =new ArrayList<File>();
       Queue<File> quOfDierct= new LinkedList<File>();
        File[] foundFiles;
        quOfDierct.add(directory);
        while(!quOfDierct.isEmpty()) {
            File currentDirectory=quOfDierct.remove();
            foundFiles=currentDirectory.listFiles();
            for(File currentFoundFile:foundFiles) {

                if (currentFoundFile.isDirectory()) {
                    quOfDierct.add(currentFoundFile);
                } else if(currentFoundFile.isFile()){
                    addFile.add(currentFoundFile);
                }
            }

        }
        return addFile;
    }
    /**
     * takeInput() method has a parameter named directory which is of type File .
     * This method calls getAllFiles().the files present in all the directories of home directory
     * This method takes input from the user, untill user enters -1 and allows users to enter regular
     * expression files.If it matches it calls the printrequired files method.
     * @param directory
     */
    public void takeInput(File directory){
        if (!directory.exists()) {
            System.out.println(directory.getName() + " does not exists");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Regular Expression or \"0\" to terminate the search : ");
        String Exp = scanner.next();
        ArrayList<File> allFiles = getFiles(directory);
        while (!Exp.equals("0")) {
            printRequiredFiles(Exp,directory,allFiles);
            System.out.print("Enter Regular Expression or \"0\" to terminate the search : ");
            Exp = scanner.next();

        }
        //scanner.close();
    }
    /**
     * printRequiredFiles() method has three parameters
     * This method prints the absolute paths
     * of only those files that are matching the given regular expression.
     * @param Exp
     * @param directory
     * @param allFiles
     */
    public void printRequiredFiles(String Exp,File directory,ArrayList<File> allFiles){
        int flag=0;

      //  System.out.println("Absolute Path of files found in " + directory.getAbsolutePath() + " and  matching the regular expression \"" + Exp + "\" are:");
        for (File currentFile : allFiles){
            String fileName=currentFile.getName();
            if(fileName.matches(Exp)) {
                flag=1;
                System.out.println(currentFile.getAbsolutePath());
            }
        }
        if(flag==0){
            System.out.println("no files exists.");
        }
    }


    public static void main(String args[])throws IOException {
        FileSearch fs = new FileSearch();
        String homeDirectory=System.getProperty("user.home");
        File homeDir = new File(homeDirectory);
        fs.takeInput(homeDir);

    }

}
