package Sadguna;

public class AustrilianTraffic implements CentralTraffic{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		code
		CentralTraffic a=new AustrilianTraffic();
		a.greenGo();
		a.redStop();
		a.FlashYellow();
		
		AustrilianTraffic an=new AustrilianTraffic();
		an.Walikng();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green go");
		
	}
	public void Walikng() {
		System.out.println("Left");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red stop");
		
	}

	@Override
	public void FlashYellow() {
		// TODO Auto-generated method stub
		System.out.println("Flash yellow");
		
	}
}




