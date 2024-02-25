package innterface;

public class son implements father,mother{

	@Override
	public void kick() {
		System.out.println("full fight");
	}

	@Override
	public void drunk() {
		System.out.println("full tight");
	}
	public static void main(String[] args) {
		son s=new son();
		s.kick();
	}

}
