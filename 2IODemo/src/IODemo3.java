import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IODemo3 {
	public static void main(String args[]) {
		try {
			//PrintWriter pw = new PrintWriter(System.out);
			//demo1
			/*
			PrintWriter pw1 = new PrintWriter(new FileOutputStream("aba.txt",true));
			pw1.println("Hello everyone");
			pw1.flush();
			pw1.close();*/
			//demo2
			
			File dir1 = new File("abc");
			dir1.mkdir();
			File dir2 = new File(dir1,"xyz");
			dir2.mkdir();
			File f = new File(dir2,"atoz.txt");
			f.createNewFile();
			
			PrintWriter pw1 = new PrintWriter(new FileOutputStream(f,true));
			pw1.println("Created using program");
			pw1.flush();
			pw1.close();
			
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}