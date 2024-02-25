package thread;

public class test extends Thread {
public void run()
{
	for(int j=6;j<=10;j++)
	{
		System.out.println(j);
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
