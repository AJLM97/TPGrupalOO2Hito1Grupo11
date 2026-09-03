package test;

import java.time.LocalDate;

import datos.FoodTruck;
import negocio.PedidoABM;
import negocio.UnidadVentaABM;

public class TestAgregarPedido {

	public static void main(String[] args) {
		System.out.println("=== TestAgregarPedido ===");

		UnidadVentaABM unidadVentaABM = UnidadVentaABM.getInstancia();
		PedidoABM pedidoABM = PedidoABM.getInstancia();

		try {
			FoodTruck foodTruck = (FoodTruck) unidadVentaABM.traerUnidadVenta(2L);
			long idPedido = pedidoABM.agregar(LocalDate.of(2026, 9, 5), foodTruck);
			System.out.printf("Id Pedido: %d%n", idPedido);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
