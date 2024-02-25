package thread;

import org.testng.internal.NoOpTestClass;

public class driver {

	public static void main(String[] args) {
demo d=new  demo();
d.start();
test t=new test();
t.start();

	}

}
