import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeserializableDemo {
	public static void main(String args[]) {
		try {
			ObjectInputStream ob = new ObjectInputStream(new FileInputStream("person.ser"));
			Person p = (Person)ob.readObject();
			System.out.println(p.name);
			System.out.println(p.age);
			
			System.out.println("Deserialize successfully");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
