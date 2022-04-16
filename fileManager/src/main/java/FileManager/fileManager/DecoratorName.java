package FileManager.fileManager;

public class DecoratorName extends DecoratorHandler {

	public DecoratorName (FileOO2 file) {
		super(file);
	}
	@Override
	String basePrint() {
		return this.getName();
	}

}
