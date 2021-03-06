import java.lang.Thread;
import java.lang.StringBuffer;

public class cThreadClass extends Thread
{

    private StringBuffer threadName;

    public cThreadClass(StringBuffer threadName)
    {
        this.threadName = threadName;
    }

    public void run()
    {
        System.out.println(">> Thread " + threadName + " is running now.");
    
        for(int i = 0; i < 10; i++)
            System.out.println("My task is running ... [" + i + "]");
        System.out.println();
    }
    
    public static void main(String[] args)
    {
    
        // Creates a Named Thread, just to indentify it
    
        ( new cThreadClass( new StringBuffer("first") ) ).start(); // In that case thread will run and after will free memory
        ( new cThreadClass( new StringBuffer("second") ) ).start(); 
    }
    
    static
    {
        System.out.println("\n[AWESOME COOL THREAD USING THE JAVA THREAD CLASS ]\n\n");    
    }

}
