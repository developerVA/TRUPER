package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import model.PedidosW;
import service.PedidosService;

@Controller
public class PedidosController {
	
	@Autowired
	PedidosService service;
	
	@GetMapping(value="pedidos", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<PedidosW> getPedidos(){
		return service.getPedidos();
	}
	
	@PostMapping(value="pedidos",consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.TEXT_PLAIN_VALUE)
	public String addPedido(@RequestBody PedidosW pedido) {
		return String.valueOf(service.addPedido(pedido));
	}
	
	@PutMapping(value="pedidos",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void updatePedido(@RequestBody PedidosW pedido) {
		service.updatePedido(pedido);
	}
	
	@DeleteMapping(value="deleteBId/{id}")
	public void deletePedido(@PathVariable("id") int idPedido) {
		service.deletePedido(idPedido);
	}
	
	

}
