package week1.day1;

public class Mobile1 {

	String mobileBrandName = "Oneplus";
	char mobileLogo = '1';
	short noOfMobilePiece = 1;
	int modelNumber = 7;
	long mobileNumber = 1234567891l;
	float mobilePrice = 53000.10f;
	boolean isDamaged = false;

	public static void main(String[] args) {

		Mobile1 m = new Mobile1();

		System.out.println("my mobile brand name is "+m.mobileBrandName);
		System.out.println("my mobile logo is "+m.mobileLogo+"+");
		System.out.println("no of mobile piece is "+m.noOfMobilePiece);
		System.out.println("my mobile model number is "+m.modelNumber+"pro");
		System.out.println("my mobile number is "+m.mobileNumber);
		System.out.println("my mobile price is "+m.mobilePrice+" Indian rupees");
		System.out.println("is my mobile damaged = "+m.isDamaged);
	}

}
