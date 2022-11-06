package week1.day1;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 123456789l;
	boolean isPunctured = false;
	String bikeName = "duke390";
	double runningKm = 29687.5;
	
	public static void main(String[] args) {
		
		TwoWheeler t = new TwoWheeler();
		
		System.out.println("my bike has "+t.noOfWheels+" wheels");
		System.out.println("my bike has "+t.noOfMirrors+" mirrors");
		System.out.println("my bike chassis number is " +t.chassisNumber);
		System.out.println("my bike is punctured= " +t.isPunctured);
		System.out.println("my bike name is " +t.bikeName);
		System.out.println("my bike has done "+t.runningKm+"kms");

		
		

	}

}
