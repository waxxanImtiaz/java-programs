import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
	 
	public class JavaStandardInput {
	 
	    public static void main(String args[]) {
	 
	        try {
	 
	            InputStreamReader in= new InputStreamReader(System.in);
	 
	            BufferedReader input = new BufferedReader(in);
	 
	            String str;
	 
	                System.out.print("Write something here and press Enter:");
	 
	            while ((str = input.readLine()) != null) {
	                System.out.println(str);
	            }
	 
	        } catch (IOException io) {
	            io.printStackTrace();
	        }
	    }
	}