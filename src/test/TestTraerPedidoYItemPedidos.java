package test;

import java.util.Set;

import datos.ItemPedido;
import datos.Pedido;
import negocio.PedidoABM;

public class TestTraerPedidoYItemPedidos {

	public static void main(String[] args) {
		System.out.println("=== TestTraerPedidoYItemPedidos ===");

		PedidoABM pedidoABM = PedidoABM.getInstancia();
		
		// Traer un pedido existente por su ID
		// Nota: Este test asume que ya existen pedidos en la base de datos
		long idPedidoABuscar = 1; // Cambiar según el ID del pedido que desees buscar
		
		Pedido pedidoTraido = pedidoABM.traerPedidoYItemPedidos(idPedidoABuscar);
		
		if (pedidoTraido != null) {
			System.out.println("Pedido traído: " + pedidoTraido);
			System.out.println("Estado cerrado: " + pedidoTraido.isCerrado());
			
			Set<ItemPedido> items = pedidoTraido.getItems();
			if (items != null && !items.isEmpty()) {
				System.out.println("Cantidad de items del pedido: " + items.size());
				for (ItemPedido item : items) {
					System.out.println("  " + item);
				}
			} else {
				System.out.println("El pedido no tiene items");
			}
		} else {
			System.out.println("No se encontró el pedido con ID: " + idPedidoABuscar);
		}
	}
}
