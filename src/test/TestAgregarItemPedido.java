package test;

import datos.ItemPedido;
import datos.Plato;
import negocio.PedidoABM;
import negocio.PlatoABM;

public class TestAgregarItemPedido {

	public static void main(String[] args) {
		System.out.println("=== TestAgregarItemPedido ===");

		PedidoABM pedidoABM = PedidoABM.getInstancia();
		PlatoABM platoABM = PlatoABM.getInstancia();

		try {
			Plato plato1 = platoABM.traerPlato(7L);
			Plato plato2 = platoABM.traerPlato(12L);
			Plato plato3 = platoABM.traerPlato(14L);

			long idPedido = 1L;

			pedidoABM.agregarItemPedido(idPedido, new ItemPedido(plato1, 2));
			pedidoABM.agregarItemPedido(idPedido, new ItemPedido(plato2, 3));
			pedidoABM.agregarItemPedido(idPedido, new ItemPedido(plato3, 1));

			System.out.println("Se agregaron 3 items al pedido con id: " + idPedido);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
