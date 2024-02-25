package inheritance;

public class LoanAccount extends bankaccount{
double loanamount;
double interest;

public LoanAccount(int ifsc,int accountno,int balance,String name,double loanamount,double interest)
{
	super(ifsc, accountno, balance, name);
	this.ifsc=ifsc;
	this.accountno=accountno;
	this.balance=balance;
	this.name=name;
	this.loanamount=loanamount;
	this.interest=interest;
}
public void LoanAccountDetails()
{
	System.out.println("details");
	System.out.println(ifsc);
	System.out.println(accountno);
	System.out.println(balance);
	System.out.println(name);
	System.out.println(loanamount);
	System.out.println(interest);
}
}
