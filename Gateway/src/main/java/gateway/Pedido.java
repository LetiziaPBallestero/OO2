package gateway;

public class Pedido {
	private Cliente cliente;

	// calcula el costo del pedido 
	public double monto () {
		return 0.0;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	// retorna true o false dependiendo de si pudo o no realizar el pago.
	public boolean pagarCon (MedioDePago medio) {
		return medio.pagar(this);
	}
}
