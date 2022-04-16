package FileManager.fileManager;

public class DecoratorExtension extends DecoratorHandler {

	public DecoratorExtension (FileOO2 file) {
		super(file);
	}
	@Override
	String basePrint() {
		return this.getExtension();
	}

}
