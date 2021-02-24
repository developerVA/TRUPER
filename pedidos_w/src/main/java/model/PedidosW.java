package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the pedidos_w database table.
 * 
 */
@Entity
@Table(name="pedidos_w")
@NamedQuery(name="PedidosW.findAll", query="SELECT p FROM PedidosW p")
public class PedidosW implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	@Column(name="DATE_SALE")
	private Date dateSale;

	private double total;

	//bi-directional many-to-one association to PedidosDetalleW
	@OneToMany(mappedBy="pedidosW")
	private List<PedidosDetalleW> pedidosDetalleWs;

	public PedidosW() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateSale() {
		return this.dateSale;
	}

	public void setDateSale(Date dateSale) {
		this.dateSale = dateSale;
	}

	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public List<PedidosDetalleW> getPedidosDetalleWs() {
		return this.pedidosDetalleWs;
	}

	public void setPedidosDetalleWs(List<PedidosDetalleW> pedidosDetalleWs) {
		this.pedidosDetalleWs = pedidosDetalleWs;
	}

	public PedidosDetalleW addPedidosDetalleW(PedidosDetalleW pedidosDetalleW) {
		getPedidosDetalleWs().add(pedidosDetalleW);
		pedidosDetalleW.setPedidosW(this);

		return pedidosDetalleW;
	}

	public PedidosDetalleW removePedidosDetalleW(PedidosDetalleW pedidosDetalleW) {
		getPedidosDetalleWs().remove(pedidosDetalleW);
		pedidosDetalleW.setPedidosW(null);

		return pedidosDetalleW;
	}

}