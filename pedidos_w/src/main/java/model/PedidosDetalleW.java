package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the pedidos_detalle_w database table.
 * 
 */
@Entity
@Table(name="pedidos_detalle_w")
@NamedQuery(name="PedidosDetalleW.findAll", query="SELECT p FROM PedidosDetalleW p")
public class PedidosDetalleW implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private double amout;

	private double price;

	private String sku;

	//bi-directional many-to-one association to PedidosW
	@ManyToOne
	@JoinColumn(name="ID_PEDIDO")
	private PedidosW pedidosW;

	public PedidosDetalleW() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAmout() {
		return this.amout;
	}

	public void setAmout(double amout) {
		this.amout = amout;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public PedidosW getPedidosW() {
		return this.pedidosW;
	}

	public void setPedidosW(PedidosW pedidosW) {
		this.pedidosW = pedidosW;
	}

}