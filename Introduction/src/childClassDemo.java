
public class childClassDemo extends parentClassDemo {
	
	public void Engine()
	{
		System.out.println("engine code is implemented");
	}
	public void colour()
	{
		System.out.println(colour);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childClassDemo cd=new childClassDemo();
				cd.colour();
				cd.Brakes();
	}

}
