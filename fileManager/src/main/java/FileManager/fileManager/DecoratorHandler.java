package FileManager.fileManager;

import java.time.LocalDate;

// decorator que junta todo los otros decoradores
public abstract class DecoratorHandler implements FileOO2 {
	private FileOO2 component; 
	
	public DecoratorHandler (FileOO2 file) {
		this.component = file; 
	}
	
	// package 
	abstract String basePrint(); 
	
	public String prettyPrint() {
		if (this.component.prettyPrint() != " ") {
			return this.basePrint() + " ─ " + this.component.prettyPrint();
		} 
		return this.basePrint();
		
	}
	// ACCESSORS
		@Override
		public String getName() {
			return this.component.getName();
		}
		@Override
		public String getExtension() {
			return this.component.getExtension();
		}
		@Override
		public Double getSize() {
			return this.component.getSize();
		}
		@Override
		public LocalDate getDateCreation() {
			return this.component.getDateCreation();
		}

		@Override
		public LocalDate getDateUpdate() {
			return this.component.getDateUpdate();
		}

		@Override
		public String getPermissions() {
			return this.component.getPermissions();
		}

}
