public class CommandLinePrintValueUsingFunction 
{

    void display(String[] arg)
    {
        
        for(int i=0; i<arg.length; i++)
        {
           
            System.out.println(arg[i]);
        }

        // System.out.println(arg);

    }
   
    public static void main(String[] args) {
      
        CommandLinePrintValueUsingFunction c = new CommandLinePrintValueUsingFunction();
        c.display(args);
    }
}