package negocio;

import java.time.LocalDate;
import java.util.List;

import dao.PedidoDao;
import datos.ItemPedido;
import datos.Pedido;
import datos.UnidadVenta;

public class PedidoABM {

	private static PedidoABM abm = null;
	private PedidoDao dao = PedidoDao.getInstance();

	private PedidoABM() {}

	public static PedidoABM getInstancia() {
		if(abm == null) {
			abm = new PedidoABM();
		}
		return abm;
	}

	public int agregar(LocalDate fechaTransaccion, UnidadVenta unidad) {
		Pedido aux = new Pedido(fechaTransaccion, unidad);
		return dao.agregar(aux);
	}

	public void modificar(Pedido pedido) {
		dao.actualizar(pedido);
	}

	public void eliminar(long idPedido) {
		Pedido aux = dao.traer(idPedido);
		dao.eliminar(aux);
	}
	
	public Pedido traerPedido(long idPedido) {
		Pedido aux = dao.traer(idPedido);
		return aux;
	}

	public List<Pedido> traerPedido() {
		return dao.traer();
	}
	
	public Pedido traerPedidoYItemPedidos(long idPedido) {
		return dao.traerPedidoYItems(idPedido);
	}
	
	public void agregarItemPedido(long idPedido, ItemPedido itemPedido) {
		dao.agregarItemPedido(idPedido, itemPedido);
	}
	
	public void cerrarPedido(long idPedido) {
		Pedido pedido = dao.traer(idPedido);
		if (pedido != null) {
			pedido.setCerrado(true);
			dao.actualizar(pedido);
		}
	}

	public double calcularRecaudacionTotalEntreFechas(LocalDate fechaDesde, LocalDate fechaHasta) {
		return dao.calcularRecaudacionTotalEntreFechas(fechaDesde, fechaHasta);
	}
	
}