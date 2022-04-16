package DataBase.DataBase;

import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ProtectionProxy implements DatabaseAccess {
	private DatabaseAccess realDataBase; 
	private int password = 1234;
	Scanner sc = new Scanner(System.in);

	public ProtectionProxy (DatabaseAccess db) {
		this.realDataBase = db;
	}
	
	private boolean checkAccess() {
		System.out.print("Ingrese contraseña: ");
		int pass = sc.nextInt();
		return (this.password == pass) ? true : false;
	}
	
	public Collection<String> getSearchResults(String queryString) {
		if (!this.checkAccess()) 
			throw new RuntimeException("Accesso denegado"); 
		else
			return realDataBase.getSearchResults(queryString);
	}
	
	public int insertNewRow(List<String> rowData) {
		if (!this.checkAccess())
			throw new RuntimeException("Acceso denegado");
		else 
			return realDataBase.insertNewRow(rowData);
	}

}
