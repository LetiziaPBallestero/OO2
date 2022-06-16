package gateway;

public class MailAdapter implements MedioDePago {
	private DineroMailGateway adaptee;
	
	public boolean pagar(Pedido pedido) {
		return adaptee.realizarPagoParaEmail(pedido.getCliente().getEmail() , pedido.monto());
	}
}
