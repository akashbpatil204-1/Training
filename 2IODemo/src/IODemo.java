import java.io.*;

public class IODemo{
	public static void main(String args[]){
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter file name");
			String fname = br.readLine();
			//String name= "C:/Users/akapatil1/Desktop/IODemo/src/IODemo.java";
			//String fileName = "src/resources/thermopylae.txt";
			File f = new File(fname);
			if(f.exists()){
				BufferedReader fr = new BufferedReader(new FileReader(fname));
				
				String line=null;
				while((line=fr.readLine())!=null)
				{
					System.out.println(line);
				}
				fr.close();
			}
			
			else{
				System.out.println("File does not exist");
				
			}
			br.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}