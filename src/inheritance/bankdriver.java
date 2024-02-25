package inheritance;

public class bankdriver {

	public static void main(String[] args) {
bankaccount b=new bankaccount(1234, 012345, 300000, "sagar");
b.BankDetails();
LoanAccount l=new LoanAccount(1232, 012320,300000,"swagat",20000.00, 5.0);
l.LoanAccountDetails();
	}

}
