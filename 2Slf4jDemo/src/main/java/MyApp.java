

import org.slf4j.*;

public class MyApp {
	private static Logger logger = LoggerFactory.getLogger(MyApp.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("hello");
		int res = add(10,20);
		System.out.println("Result: "+res );
	}
public static int add(int a,int b) {
	return a+b;
}
}
