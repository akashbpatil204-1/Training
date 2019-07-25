import java.io.*;

class A {

	public void abc() throws IOException, NullPointerException, AirthmaticException, UserException {
		int a = 50;
		for (int i = 1; i <= 20; i++) {
			System.out.println(i);
			int res = a / (a - i);

			if (i == 150) {
				throw new NullPointerException();

			}
			if (i == 120) {
				throw new IOEException();

			}
			if (i == 100) {
				return;

			}
			if (i == 80) {
				throw new UserException("When i is 8");

			}

			if (i == 60) {
				throw new UserException("When i is 6");

			}

		}

	}

	public void xyz() throws IOException, AirthmaticException, UserException {
		abc();
	}

	public void atoz() throws IOException, AirthmaticException, UserException {
		xyz();
	}
}

public class demo {

	public static void main(String args[]) {
		try {
			A a1 = new A();
			a1.atoz();

		} catch (IOException e) {
			System.out.println("IO exception Handler");

		} catch (NullPointerException e) {
			System.out.println("Null ptr exception Handler");

		}

		catch (UserException e) {
			System.out.println("User exception Handler");
			e.printStackTrace();
			e.diplay();
			System.out.println("Reason:" + e.getMessage());

		}

		catch (Exception e) {
			System.out.println("Default exception Handler");
		} finally {
			System.out.println("Thanks");
		}
		System.out.println("Program cont...");

	}


class UserException extends Exception{

 public UserException(){
}
 public UserException(String msg){
super(msg);
	
}
public void display(){
System.out.println("Just for demo");
}

}





