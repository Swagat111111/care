package NoSeries;

public class Prime_no {
public static void main(String[] args) {
	int n=8;int count=0;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			count++;
			break;
		}
	}
	if(count==1)
	{
		System.out.println("not");
	}
	else
	{
		System.out.println("yes");
	}
	
	

}
}