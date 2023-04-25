package tehtävä21;

public class ComputerFacade {

	private Memory memory = new Memory();
	private HardDrive hardDrive = new HardDrive();
	private CPU cpu = new CPU();
	private long kBootAddress = 0xbf;
	private long kBootSector = 0x7C00;
	private int kSectorSize = 320;

	public void start() {
		cpu.freeze();
		memory.load(kBootAddress, hardDrive.read(kBootSector, kSectorSize));
		cpu.jump(kBootAddress);
		cpu.execute();
	}
}