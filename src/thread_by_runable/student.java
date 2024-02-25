package thread_by_runable;

public class student implements Runnable{
public void run()
{
	System.out.println("student entered in the classroom");
	
	try
	{
		Thread.sleep(1000);
	}
	
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	System.out.println("student left the classroom");
}
}
