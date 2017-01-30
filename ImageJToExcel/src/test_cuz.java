import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;
import java.io.*;
public class test_cuz {

	public void run(String arg){
		
	
		
		File  data= new File("ImageJ Output.txt");
		
		//This is how you write to the file
		
		
		try {
			PrintWriter output = new PrintWriter("the-file-name.txt", "UTF-8");
			output.println("1");
			output.close();
		} catch (IOException e) {
			System.out.printf("File could not be found", e);
		} 			
		
		
	}
}
