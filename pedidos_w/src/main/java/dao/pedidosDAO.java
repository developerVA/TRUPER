package dao;

import java.util.List;
import java.util.Optional;

import model.PedidosW;

public interface pedidosDAO {
	
	void addPedido(PedidosW pedido);
	
	List<PedidosW> getPedidos();
	
	void updatePedido(PedidosW pedido);
	
	void deletePedido(int idPedido);
	
	Optional<PedidosW> getPedido(int idPedido);
	

}
