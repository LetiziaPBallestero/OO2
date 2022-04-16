package FileManager.fileManager;

public class DecoratorDateC extends DecoratorHandler {
	
	public DecoratorDateC (FileOO2 file) {
		super(file);
	}
	@Override
	String basePrint() {
		return this.getDateCreation().toString();
	}

}
