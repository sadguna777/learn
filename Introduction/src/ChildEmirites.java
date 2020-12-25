
public class ChildEmirites extends ParentAirCraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildEmirites a=new ChildEmirites();
		a.bodyColour();
		a.engine();
		a.safetyGuideLines();

	}

	@Override
	public void bodyColour() {
		// TODO Auto-generated method stub
		System.out.println("Red colour on body");
	}

}
