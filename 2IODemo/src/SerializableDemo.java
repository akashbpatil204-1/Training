import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	public static void main(String args[]) {
		try {
			Person p1 = new Person();
			p1.name="akash";
			p1.age= 25;
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"));
			oos.writeObject(p1);
			oos.close();
			System.out.println("serialize successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
