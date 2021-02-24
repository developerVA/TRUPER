package dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.PedidosW;


@Repository
public class PedidosImpl implements pedidosDAO {
	
	@Autowired
	PedidosJpa pedido;

	@Override
	public void addPedido(PedidosW pedido) {
		// TODO Auto-generated method stub
		((CrudRepository<PedidosW, Integer>) pedido).save(pedido);
		
	

	}

	@Override
	public List<PedidosW> getPedidos() {
		// TODO Auto-generated method stub
		return pedido.findAll();
	}

	@Override
	public void updatePedido(PedidosW pedido) {
		// TODO Auto-generated method stub
		((CrudRepository<PedidosW, Integer>) pedido).save(pedido);

	}

	@Override
	public void deletePedido(int idPedido) {
		// TODO Auto-generated method stub
		pedido.deleteById(idPedido);

	}

	@Override
	public Optional<PedidosW> getPedido(int idPedido) {
		// TODO Auto-generated method stub
		return pedido.findById(idPedido);
	}

}
