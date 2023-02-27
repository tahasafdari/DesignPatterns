// ConcreteComponent
public class Pohja implements Pizza {

	private String nimi = "Pohja";
	private double hinta = 2.0;
	
	@Override
	public String tayta() {
		return nimi;
	}

	@Override
	public double hinta() {
		return hinta;
	}
}