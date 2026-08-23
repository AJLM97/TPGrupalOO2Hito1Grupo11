package datos;

public class ItemPedido {
	private long idItemPedido;
	private Plato plato;
	private long cantidad;

	public ItemPedido() {}

	public ItemPedido(Plato plato, long cantidad) {
		super();
		this.plato = plato;
		this.cantidad = cantidad;
	}

	public long getIdItemPedido() {
		return idItemPedido;
	}

	public void setIdItemPedido(long idItemPedido) {
		this.idItemPedido = idItemPedido;
	}

	public Plato getPlato() {
		return plato;
	}

	public void setPlato(Plato plato) {
		this.plato = plato;
	}

	public long getCantidad() {
		return cantidad;
	}

	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ItemPedido [idItemPedido=" + idItemPedido + ", plato=" + plato + ", cantidad=" + cantidad + "]";
	}

}
