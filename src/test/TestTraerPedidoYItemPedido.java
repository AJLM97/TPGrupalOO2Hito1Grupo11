package test;

import java.util.Set;

import datos.ItemPedido;
import datos.Pedido;
import negocio.PedidoABM;

public class TestTraerPedidoYItemPedido {

	public static void main(String[] args) {
		System.out.println("=== TestTraerPedidoYItemPedido ===");

		PedidoABM pedidoABM = PedidoABM.getInstancia();

		try {
			Pedido pedido = pedidoABM.traerPedidoYItemPedidos(1L);
			System.out.println("Pedido: " + pedido);
			System.out.println("Estado cerrado: " + pedido.isCerrado());

			Set<ItemPedido> items = pedido.getItems();
			if (items != null && !items.isEmpty()) {
				System.out.println("Cantidad de items: " + items.size());
				for (ItemPedido item : items) {
					System.out.println("  " + item);
				}
			} else {
				System.out.println("El pedido no tiene items");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
