
public class Kinkku extends Tayte {

	private String nimi = "Kinkku";
	private double hinta = 2.0;
	
	public Kinkku(Pizza pizza) {
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