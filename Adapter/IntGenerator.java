package tehtävä15;

// Adapter (Object Adapter)
public class IntGenerator implements IGenerator {

	private IGeneraattori adapteeGenerator;
	
	public IntGenerator(IGeneraattori generator) {
		adapteeGenerator = generator;
	}
	
	@Override
	public void GenerateRandomNumbers() {
		adapteeGenerator.LuoSatunnaislukuGeneraattori();
		adapteeGenerator.ArvoSatunnaisetNumerot();
	}

	@Override
	public void PrintRandomNumbers() {
		adapteeGenerator.TulostaSatunnaisetNumerot();
	}
}