import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;
import java.io.*;

public class IJ_Txt implements PlugIn{

	void showInfo(){
		IJ.showMessage("About IJToExcel ...",
		"This program is used to get values from an image using the commands in \n"
		+ "ImageJ and output a .txt file which is used in excel for FileIO. To add\n"
		+ "a new vaule to the excel file you would first need to knwo the \n"
		+ "function for which you are trying to automate (a list of functions can\n"
		+ "be found online using the ImageJ tutorial page). First in the \n"
		+ "specoman.java file add a private variable that accurately describes \n"
		+ "what funstion you are implementing, next create getters and setters \n"
		+ "for the function, next go into IJToTxt.java and instantiate the variable\n"
		+ "you need, finally addd it to the output section. The rest of the info \n"
		+ "is in the excel macro worksheet");
	}
	public void run(String arg) {
		speciman speciman1 = new speciman();
		ImagePlus image = IJ.getImage();
		ImageProcessor image1 = IJ.getProcessor();
		File  data = new File("ImageJ Output.txt");
		String title = image.getTitle();
		char[] titleCharArray = title.toCharArray();
		String specimanName = null;
		int next = 0;
		
		//using title to get specimanNumb and side
		for(int i=0; titleCharArray[i] == ' '; i++){
			specimanName = specimanName + titleCharArray[i];
			next = i + 1;
		}
		
		char side = titleCharArray[next];
		//End of mini-function to get SpecimanNumb and side
		
		//Beginning of a lot of setting
		speciman1.setSpecimanNumb(specimanName);
		speciman1.setSideLR(side);
		speciman1.setNumberOfImages(image.getImageStackSize());
		speciman1.setPixelWidth(image1.getWidth());
		speciman1.setPixelHeight(image1.getHeight());
		speciman1.setOriginalFileType("Dicom");
		speciman1.setAnatomicalRegion("add");
		speciman1.setTreatmentGroup("add");
		speciman1.setStudyGroup("add");
		speciman1.setWidthInInches(image1.getWidth()/1544*16.04);
		speciman1.setHeightInInches(image1.getHeight()/1544*16.04);
		speciman1.setVoxelWidth(image.getCalibration().pixelWidth);
		speciman1.setVoxelHeight(image.getCalibration().pixelHeight);
		speciman1.setVoxelDepth(image.getCalibration().pixelDepth);
		speciman1.setVoxelSize(Double.toString(speciman1.getVoxelWidth())
				+ " x " + Double.toString(speciman1.getVoxelHeight()) +
				" x " + Double.toString(speciman1.getVoxelDepth()));
		speciman1.setPixelValueMin(image1.getMax());
		speciman1.setPixelValueMax(image1.getMax());
		speciman1.setBeamIntensityKV(70);
		
		//FileIO Part of Program
		PrintWriter output;
		try {
			IJ.showMessage("Your In");
			output = new PrintWriter(data);
			output.println("New File Created");
			output.println(speciman1.getSpecimanNumb());
			output.println(speciman1.getSideLR());
			output.println(speciman1.getStudyGroup());
			output.println(speciman1.getTreatmentGroup());
			output.println(speciman1.getAnatomiclaRegion());
			output.println(speciman1.getComments());
			output.print("\n");
			output.print("\n");
			output.print("\n");
			output.print("\n");
			output.println(speciman1.getOriginalFileType());
			output.println(speciman1.getNumbOfImages());
			output.println(speciman1.getPixelWidth() + " x " + speciman1.getPixelHeight());
			output.println(speciman1.getWidthInInches() + " x " + speciman1.getHeightInInches());
			output.println(speciman1.getBeamIntensityKV());
			output.println(speciman1.getVoxelSize());
			output.print("\n");
			output.println(speciman1.getPixelValueMin());
			output.println(speciman1.getPixelValueMax());
			output.println("add");
			output.print("\n");
			output.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		showInfo();
	
		
	}

}
