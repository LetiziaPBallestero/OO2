package FileManager.fileManager;

public class DecoratorPermissions extends DecoratorHandler {

	public DecoratorPermissions (FileOO2 file) {
		super(file);
	}
	@Override
	String basePrint() {
		return this.getPermissions();
	}

}
