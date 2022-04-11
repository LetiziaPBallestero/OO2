package ejercicio3tp3;

import java.util.zip.CRC32;

public class CRC32_Calculator implements Calculator {

	@Override
	public long crcFor(String datos) {
		CRC32 crc = new CRC32();
		datos = "un mensaje";
		crc.update(datos.getBytes());
		 long result = crc.getValue();
		 return result;
	}

}
