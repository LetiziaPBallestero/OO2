package FileManager.fileManager;

public class DecoratorSize extends DecoratorHandler {

	public DecoratorSize (FileOO2 file) {
		super(file);
	}
	@Override
	String basePrint() {
		return this.getSize().toString();
	}

}
