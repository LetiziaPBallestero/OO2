package gateway;

public class DebitoGateway {

	/**
	 * Débito Automático: el pago requiere una autorización previa donde se valida
	 * si el cliente dispone de fondos.
	 */
	private boolean autorizarMontoConCBU(double unMonto, String cbu) {
		return true;
	}

	public boolean pagarMontoConCBU(double unMonto, String cbu) {
		if (autorizarMontoConCBU(unMonto,cbu))
			return true;
		else
			return false;
	}

}
