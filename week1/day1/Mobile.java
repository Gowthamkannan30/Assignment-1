package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("make a call");
	}

	public void sendMsg() {
		System.out.println("send a msg to frnd");
	}
	
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		m.makeCall();
		m.sendMsg();
	}
}
