package FileManager.fileManager;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDecorator {
	
	FileOO2 file;
	
	@BeforeEach
	void setUp() {
		file = new File ("Mate" , ".mp4" , 523.2 
				, LocalDate.of(2022, 3,15) 
				, LocalDate.of(2022, 4, 14) , "lectura");				
	}
	
    @Test
    public void example1() {
    	DecoratorExtension ext1 = new DecoratorExtension (file);
    	DecoratorName n1 = new DecoratorName(ext1);
    	assertEquals("Mate ─ .mp4" , n1.prettyPrint());
    }
    @Test
    public void example2() {
    	DecoratorDateC cre2 = new DecoratorDateC (file);
    	DecoratorExtension ext2 = new DecoratorExtension (cre2);
    	DecoratorName n2 = new DecoratorName(ext2);
    	assertEquals("Mate ─ .mp4 ─ 2022-03-15" , n2.prettyPrint());
    }
	/** 
permisos - nombre - extensión - tamaño

**/ 
    @Test
    public void example3() {
    	DecoratorSize size3 = new DecoratorSize (file);
    	DecoratorExtension ext3 = new DecoratorExtension (size3);
    	DecoratorName n3 = new DecoratorName(ext3);
    	DecoratorPermissions per3 = new DecoratorPermissions (n3);
    	assertEquals("lectura ─ Mate ─ .mp4 ─ 523.2" , per3.prettyPrint());
    }
    
    @Test
    public void fullTest() {
    	DecoratorPermissions perF = new DecoratorPermissions (file);
    	DecoratorDateU updF = new DecoratorDateU (perF);
    	DecoratorDateC creF = new DecoratorDateC (updF);
    	DecoratorSize sizeF = new DecoratorSize (creF);
    	DecoratorExtension extF = new DecoratorExtension (sizeF);
    	DecoratorName nF = new DecoratorName(extF);
        assertEquals("Mate ─ .mp4 ─ 523.2 ─ 2022-03-15 ─ 2022-04-14 ─ lectura" 
    		   , nF.prettyPrint());
    }
}