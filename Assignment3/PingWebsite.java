import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PingWebsite {
    private ArrayList<String> command;
    private String host;
    private int packets;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPackets() {
        return packets;
    }

    public void setPackets(int packets) {
        this.packets = packets;
    }

    /**
     * this constructor initialzes the arrayList of String Type and add ping and -c to that list
     */
    public PingWebsite() {
        command = new ArrayList<String>();
        command.add("ping");
        command.add("-c");
    }

    /**
     * this method excutes the command by invoking nother methods  and prints the result in it
     * @throws Exception
     */
    public void executeCommand() throws Exception {
        try {
            ArrayList<String> commandResults = executeip();
            if(commandResults.size()==-1){
                System.out.println("the " +host+" currently not available.");
                return;
            }
          ArrayList<Double> pingTimeValues=getpingtime(commandResults);

            Double median =caluclateMedian(pingTimeValues);
            System.out.println("Median of time taken to ping the host "+host+" is "+median+" ms");

        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(host+" not available");
        }
        catch (NumberFormatException e)
        {
            e.printStackTrace();
        }

    }

    /**
     * This method takes ArrayList of string as parameter and extrxts the time for each packet transfer by
     * using string class methods and returns the Arraylist of type double of time
     * @param result
     * @return
     * @throws NumberFormatException
     */
   public ArrayList<Double> getpingtime(ArrayList<String> result )
            throws NumberFormatException
    {
        ArrayList<Double> time = new ArrayList<Double>();
        for(String s : result)
        {
            int startindex=s.indexOf("time=");
            int endindex=s.indexOf("ms");
            if (startindex!=-1 && endindex!=-1) {
                String sub = s.substring(startindex+5, endindex);
               // System.out.println(sub);
                Double timeValue = Double.parseDouble(sub);
                time.add(timeValue);
            }
        }
        return time;
    }

    /**
     * this method takes Arraylist of Double type as parameter and calcultes the median of all values by sorting
     * @param time
     * @return
     */
    double caluclateMedian(ArrayList<Double> time) {
        Double medianvalue=0.0;
        Collections.sort(time);
        int med=packets%2;
        if(med==0)
        {
            medianvalue=((time.get(med))+(time.get(med-1)))/2;
        }
        else
        {
            medianvalue=time.get(med);
        }
        return medianvalue;


    }

    /**
     * this method takes no parameter and with h processBuilder and and Process class starts a process and exeutes the
     * command stored in command arryalist and stores the result of command in Bufferedreader object which inturns stores
     * in the another arraylist of string type and returns it
     * @return
     * @throws Exception
     */
  public   ArrayList<String> executeip() throws Exception
    {
        ArrayList<String> Al=new ArrayList<String>();
        ProcessBuilder build = new ProcessBuilder(command);
        Process process = build.start();

        BufferedReader input = new BufferedReader(new InputStreamReader
                (process.getInputStream()));
        String s = null;
       // System.out.println("Standard output: ");
        while((s = input.readLine()) != null)
        {
            //System.out.println("Standard output1: ");
            Al.add(s);
            System.out.println(s);
        }
        return Al;

    }


    public  static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        PingWebsite pw= new PingWebsite();
        System.out.println("enter the host address or ip address to ping");
        String host=sc.next();
        pw.setHost(host);
        System.out.println("Enter the number of packets to be sent");
        int packets=sc.nextInt();
        pw.setPackets(packets);
        pw.command.add(String.valueOf(packets));
        pw.command.add(host);

        try
        {
            pw.executeCommand();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }


    }


}
