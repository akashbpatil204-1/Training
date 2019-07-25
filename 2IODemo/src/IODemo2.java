import java.io.*;

public class IODemo2{
	public static void main(String args[]){
		try{
			RandomAccessFile rf = new RandomAccessFile("aba.txt", "rw");
			
			System.out.println(rf.readLine());
			rf.seek(rf.length());
			rf.writeBytes("akash");
			
			System.out.println(rf.readLine());
			rf.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}