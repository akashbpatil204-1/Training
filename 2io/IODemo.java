import java.io.*;

public class IODemo{
	public static void main(String args[]){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter file name");
			String name = br.readLine();
			
			File f = new File(name);
			if(f.exists()){
				
			}
			else{
				System.out.println("File does not exist1");
				
			}
		}
		catch(Exception e){
			System.out.println("File does not exist");
		}
	}
}