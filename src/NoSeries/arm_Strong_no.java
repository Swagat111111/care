package NoSeries;

public class arm_Strong_no {

	public static void main(String[] args) {
int n=371;
int temp=n;
int rem;
int sum=0;
while(n>0)
{
	rem=n%10;
	
	sum=sum+(rem*rem*rem);
	n=n/10;
}
if(temp==sum)
{
	System.out.println("ok");
	}
	else
	{
		System.out.println("not");
	}
	}
}
