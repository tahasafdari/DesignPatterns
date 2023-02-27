
public class Ananas extends Tayte {

	private String nimi = "Ananas";
	private double hinta = 3.0;
	
	public Ananas(Pizza pizza) {
		super(pizza);
	}
	
	@Override
	public String tayta() {
		String taytteet = super.tayta();
		taytteet += ", " + getNimi();
		return taytteet;
	}
		
	@Override
	public double hinta() {
		return super.hinta() + hinta;
	}
	
	private String getNimi() {
		return nimi;
	}
}