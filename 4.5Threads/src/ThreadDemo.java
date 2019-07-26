class A extends Thread {

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("k: " + i);
			try 
			{
				System.out.println(this.getName());
				this.setName("ghai");
				this.setPriority(3);
				this.sleep(300);
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}
	}

}

class B extends Thread {

	public void run() {
		for (int i = 10; i < 20; i++) {
			System.out.println("j: " + i);
			try 
			{
				this.sleep(200);
				this.setPriority(7);
				this.setName("khup ghai");
				System.out.println(this.getName());
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}
	}

}

class C extends Thread {

	public void run() {
		for (int i = 30; i < 40; i++) {
			System.out.println("i: " + i);
			
			try 
			{
				this.sleep(100);
				this.setPriority(9);
				this.setName("baju la ho re");
				System.out.println(this.getName());
			}
			catch(Exception e) 
			{
				System.out.println(e);
			}
		}
	}

}

public class ThreadDemo {

	public static void main(String args[]) throws Exception{
		 Thread t = Thread.currentThread(); 
		// System.out.println(t.getName());
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		a1.start();
		a1.run();
		b1.start();
		 Thread.sleep(1000);
		    for (int i = 10; i < 20; i++) {
				System.out.println("m: " + i);
				try 
				{
					Thread.sleep(200);
				//	Thread.setPriority(7);
			//		Thread.setName("khup ghai");
					//System.out.println(Thread.getName());
				}
				catch(Exception e) 
				{
					System.out.println(e);
				}
			}
		b1.run();
		c1.start();
		c1.run();
	   
	    System.out.println(a1);
	    
		System.out.println("zal kand");
	}
}
