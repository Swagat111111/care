package thread;

public class demo extends Thread{

	public void run()
	{
	for(int i=1;i<=5;i++)
	{
		System.out.println(i);
		try
		{
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}

}
