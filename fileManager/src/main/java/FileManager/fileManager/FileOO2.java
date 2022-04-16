package FileManager.fileManager;

import java.time.LocalDate;
// clase abstracta que usan el componente y el decorator
public interface FileOO2 {
	
	public String prettyPrint();
	// accessosr
	public String getName();
	public String getExtension();
	public Double getSize();
	public LocalDate getDateCreation();
	public LocalDate getDateUpdate();
	public String getPermissions();

}
