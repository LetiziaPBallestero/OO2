package gateway;

public class DebitoAdapter implements MedioDePago {
	private DebitoGateway adaptee;
	
	public boolean pagar(Pedido pedido) {
		return adaptee.pagarMontoConCBU(pedido.monto() , pedido.getCliente().getCBU());
	}

}
