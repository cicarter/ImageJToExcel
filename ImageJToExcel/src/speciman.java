
public class speciman {
	private String specimanNumb;
	private char sideLR;
	private String studyGroup;
	private String treatmentGroup;
	private String anatomicalRegion;
	private String comments;
	private String originalFileType;
	private int numberOfImages;
	private int pixelWidth;
	private int pixelHeight;
	private double widthInInches;
	private double heightInInches;
	private int beamIntensityKV;
	private double voxelWidth;
	private double voxelHeight;
	private double voxelDepth;
	private String voxelSize;
	private double pixelValueMin;
	private double pixelValueMax;
	private double boneJThreshold;
	
	//This is the constructor
	speciman(){
		//Don't really need to do anything as of now
	}
	
	//This section is filled with the getters and setters of the private variables
	
	public String getSpecimanNumb(){
		return specimanNumb;
	}
	public void setSpecimanNumb(String specNumb){
		specimanNumb = specNumb;
	}
	public char getSideLR(){
		return sideLR;
	}
	public void setSideLR(char side){
		sideLR = side;
	}
	public String getStudyGroup(){
		return studyGroup;
	}
	public void setStudyGroup(String group){
		studyGroup = group;
	}
	public String getTreatmentGroup(){
		return treatmentGroup;
	}
	public void setTreatmentGroup(String group){
		treatmentGroup = group;
	}
	public String getAnatomiclaRegion(){
		return anatomicalRegion;
	}
	public void setAnatomicalRegion(String region){
		anatomicalRegion = region;
	}
	public String getComments(){
		return comments;
	}
	public void setComments(String comment){
		comments = comment;
	}
	public String getOriginalFileType(){
		return originalFileType;
	}
	public void setOriginalFileType(String type){
		originalFileType = type;
	}
	public int getNumbOfImages(){
		return numberOfImages;
	}
	public void setNumberOfImages(int number){
		numberOfImages = number;
	}
	public int getPixelWidth(){
		return pixelWidth;
	}
	public void setPixelWidth(int size){
		pixelWidth = size;
	}
	public int getPixelHeight(){
		return pixelHeight;
	}
	public void setPixelHeight(int size){
		pixelHeight = size;
	}
	public double getWidthInInches(){
		return widthInInches;
	}
	public void setWidthInInches(double size){
		widthInInches = size;
	}
	public double getHeightInInches(){
		return heightInInches;
	}
	public void setHeightInInches(double size){
		heightInInches = size;
	}
	public int getBeamIntensityKV(){
		return beamIntensityKV;
	}
	public void setBeamIntensityKV(int intensity){
		beamIntensityKV = intensity;
	}
	public double getVoxelWidth(){
		return voxelWidth;
	}
	public void setVoxelWidth(double pixelWidth1){
		voxelWidth = pixelWidth1;
	}
	public double getVoxelHeight(){
		return voxelHeight;
	}
	public void setVoxelHeight(double pixelHeight1){
		voxelHeight = pixelHeight1;
	}
	public double getVoxelDepth(){
		return voxelDepth;
	}
	public void setVoxelDepth(double pixelDepth){
		voxelDepth = pixelDepth;
	}
	public String getVoxelSize(){
		return voxelSize;
	}
	public void setVoxelSize(String size){
		voxelSize = size;
	}
	public double getPixelValueMin(){
		return pixelValueMin;
	}
	public void setPixelValueMin(double value){
		pixelValueMin = value;
	}
	public double getPixelValueMax(){
		return pixelValueMax;
	}
	public void setPixelValueMax(double value){
		pixelValueMax = value;
	}
	public double getBoneJThreshold(){
		return boneJThreshold;
	}
	public void setBoneJThreshold(double setValue){
		boneJThreshold = setValue;
	}
	//End of Getters and Setters
}
