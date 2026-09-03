package test;

import java.time.LocalDate;
import java.util.Set;

import datos.FoodTruck;
import datos.ItemPedido;
import datos.Pedido;
import negocio.EmpleadoABM;
import negocio.FestivalABM;
import negocio.PedidoABM;
import negocio.PlatoABM;
import negocio.UnidadVentaABM;

public class TestTraerPedidoYItemPedidos {

	public static void main(String[] args) {
		System.out.println("=== TestTraerPedidoYItemPedidos ===");

		FestivalABM festivalABM = FestivalABM.getInstancia();
		long idFestival = festivalABM.agregar(
				"Festival de Primavera",
				"Primavera",
				LocalDate.of(2026, 9, 1),
				LocalDate.of(2026, 9, 10),
				22.0,
				160.0,
				55.0);

		EmpleadoABM empleadoABM = EmpleadoABM.getInstancia();
		long idEmpleado = empleadoABM.agregarCajero(
				"Carlos",
				"López",
				31000555L,
				LocalDate.of(1988, 11, 18),
				LocalDate.of(2022, 3, 20),
				31000,
				"Mañana",
				2100);

		UnidadVentaABM unidadVentaABM = UnidadVentaABM.getInstancia();
		long idUnidadVenta = unidadVentaABM.agregarFoodTruck(
				"Sushi Express",
				"SE-001",
				18.0,
				empleadoABM.traerEmpleado(idEmpleado),
				festivalABM.traerFestival(idFestival),
				"SUX999",
				true);

		FoodTruck foodTruck = (FoodTruck) unidadVentaABM.traerUnidadVenta(idUnidadVenta);

		PedidoABM pedidoABM = PedidoABM.getInstancia();
		long idPedido = pedidoABM.agregar(LocalDate.of(2026, 9, 5), foodTruck);

		PlatoABM platoABM = PlatoABM.getInstancia();
		long idPlato1 = platoABM.agregar("Nigiri", 520.0, 200.0, foodTruck);
		long idPlato2 = platoABM.agregar("Tempura", 380.0, 140.0, foodTruck);

		try {
			pedidoABM.agregarItemPedido(idPedido, new ItemPedido(platoABM.traerPlato(idPlato1), 3));
			pedidoABM.agregarItemPedido(idPedido, new ItemPedido(platoABM.traerPlato(idPlato2), 2));
		} catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}

		Pedido pedidoTraido = pedidoABM.traerPedidoYItemPedidos(idPedido);
		System.out.println("Pedido: " + pedidoTraido);
		System.out.println("Estado cerrado: " + pedidoTraido.isCerrado());
		
		Set<ItemPedido> items = pedidoTraido.getItems();
		if (items != null && !items.isEmpty()) {
			System.out.println("Cantidad de items: " + items.size());
			for (ItemPedido item : items) {
				System.out.println("  " + item);
			}
		} else {
			System.out.println("El pedido no tiene items");
		}
	}
}
