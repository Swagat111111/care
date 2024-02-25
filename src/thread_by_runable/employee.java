package thread_by_runable;

public class employee implements Runnable{
public void run()
{
	System.out.println("employee entered to the office");
	
	try
	{
		Thread.sleep(1000);
	}
	catch(Exception e)
	
	{
		e.printStackTrace();
	}
	System.out.println("employee left the office");
}

}
