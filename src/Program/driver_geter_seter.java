package Program;

public class driver_geter_seter {

	public static void main(String[] args) {
		getter_and_seter g=new getter_and_seter(11,"rani", 23);
		System.out.println(g.getId());
		g.setId(12);
		System.out.println(g.getId());
	}

}
