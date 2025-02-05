package service;

import java.util.List;
import java.util.Optional;

import model.PedidosW;

public interface PedidosService {
	
	boolean addPedido(PedidosW pedido);
	
	List<PedidosW> getPedidos();
	
	void updatePedido(PedidosW pedido);
	
	boolean deletePedido(int idPedido);
	
	Optional<PedidosW> getPedido(int idPedido);
	

}
