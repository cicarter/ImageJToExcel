import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;
import java.io.*;
public class test {

	public void run(String arg){
		
		ImagePlus image = IJ.getImage();
		int size = image.getImageStackSize();
		ImageProcessor image1 = IJ.getProcessor();
		double maxPixelValue = image1.getMax();
		double minPixelValue = image1.getMin();
		double width = image1.getWidth();
		double height = image1.getHeight();
		
		File  data= new File("ImageJ Output.txt");
		
		//This is how you write to the file
		
		
		PrintWriter output;
		try {
			output = new PrintWriter(data);
			output.println(size);
			output.println(maxPixelValue);
			output.println(minPixelValue);
			output.println(width);
			output.println(height);
			output.close();
		} catch (FileNotFoundException e) {
			System.out.printf("File could not be found", e);
		} 			
		
		
	}
}
