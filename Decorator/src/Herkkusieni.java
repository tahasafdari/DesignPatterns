
public class Herkkusieni extends Tayte {

	private String nimi = "Herkkusieni";
	private double hinta = 1.5;
	
	public Herkkusieni(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String tayta() {
		String taytteet = super.tayta(); // Delegointimetodin kutsu
		taytteet += ", " + getNimi(); // Lisätty toiminnallisuus (Lisätään täytteisiin uusi täyte)
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