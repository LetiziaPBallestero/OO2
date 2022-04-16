package FileManager.fileManager;

public class DecoratorDateU extends DecoratorHandler {

	public DecoratorDateU (FileOO2 file) {
		super(file);
	}
	@Override
	String basePrint() {
		return this.getDateUpdate().toString();
	}

}
