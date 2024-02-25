package inheritance;

public class bankaccount {
int ifsc;
int accountno;
int balance;
String name;

public bankaccount(int ifsc,int accountno,int balance,String name)
{
	this.ifsc=ifsc;
	this.accountno=accountno;
	this. balance= balance;
	this.name=name;
	
}
public void BankDetails()
{
	System.out.println("bank datails");
	System.out.println(ifsc);
	System.out.println(accountno);
	System.out.println(balance);
	System.out.println(name);
}
}
