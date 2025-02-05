package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.pedidosDAO;
import model.PedidosW;


@Service
public class PedidosServiceImpl implements PedidosService {

	@Autowired
	pedidosDAO dao;
	@Override
	public boolean addPedido(PedidosW pedido) {
		// TODO Auto-generated method stub
		if(dao.getPedido(pedido.getId())==null) {
			dao.addPedido(pedido);
			return true;
		}
		
		return false;
	}

	@Override
	public List<PedidosW> getPedidos() {
		// TODO Auto-generated method stub
		return dao.getPedidos();
	}

	@Override
	public void updatePedido(PedidosW pedido) {
		// TODO Auto-generated method stub
		dao.updatePedido(pedido);

	}

	@Override
	public boolean deletePedido(int idPedido) {
		// TODO Auto-generated method stub
		if(dao.getPedido(idPedido)!=null) {
			dao.deletePedido(idPedido);
			return true;
		}
		return false;
	}

	@Override
	public Optional<PedidosW> getPedido(int idPedido) {
		// TODO Auto-generated method stub
		return dao.getPedido(idPedido);
	}

}
