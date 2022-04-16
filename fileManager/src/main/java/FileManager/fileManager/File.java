package FileManager.fileManager;

import java.time.LocalDate;
// este es el componente
public class File implements FileOO2 {
	private String name; 
	private String extension;
	private double size;
	private LocalDate dateCreation;
	private LocalDate dateUpdate;
	private String permissions;
	
	public File (String name, String ext, double size,
			LocalDate dateC, LocalDate dateU, String permissions) {
		this.name = name; 
		this.extension = ext;
		this.size = size;
		this.dateCreation = dateC; 
		this.dateUpdate = dateU;
		this.permissions = permissions;
	}

	@Override
	public String prettyPrint() {
		return " ";
	}

	// ACCESSORS
	@Override
	public String getName() {
		return this.name;
	}
	@Override
	public String getExtension() {
		return this.extension;
	}
	@Override
	public Double getSize() {
		return this.size;
	}
	@Override
	public LocalDate getDateCreation() {
		return this.dateCreation;
	}

	@Override
	public LocalDate getDateUpdate() {
		return this.dateUpdate;
	}

	@Override
	public String getPermissions() {
		return this.permissions;
	}

}
