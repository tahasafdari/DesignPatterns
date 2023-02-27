//ConcreteDecorator
public class Juusto extends Tayte {

	private String nimi = "Juusto";
	private double hinta = 2.5;
	
	public Juusto(Pizza pizza) {
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
		return super.hinta() + hinta; // Lisätään hinta
	}
	
	private String getNimi() {
		return nimi;
	}
}