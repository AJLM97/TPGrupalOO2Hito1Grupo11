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
				"Festival de Invierno",
				"Invierno",
				LocalDate.of(2026, 6, 1),
				LocalDate.of(2026, 6, 8),
				30.0,
				180.0,
				60.0);

		EmpleadoABM empleadoABM = EmpleadoABM.getInstancia();
		long idEmpleado = empleadoABM.agregarCajero(
				"Luis",
				"Martínez",
				29000111L,
				LocalDate.of(1992, 8, 12),
				LocalDate.of(2023, 5, 1),
				32000,
				"Tarde",
				1900);

		UnidadVentaABM unidadVentaABM = UnidadVentaABM.getInstancia();
		long idUnidadVenta = unidadVentaABM.agregarFoodTruck(
				"Pizza Time",
				"PT-010",
				20.0,
				empleadoABM.traerEmpleado(idEmpleado),
				festivalABM.traerFestival(idFestival),
				"XYZ789",
				false);

		FoodTruck foodTruck = (FoodTruck) unidadVentaABM.traerUnidadVenta(idUnidadVenta);

		PedidoABM pedidoABM = PedidoABM.getInstancia();
		long idPedido = pedidoABM.agregar(LocalDate.of(2026, 6, 4), foodTruck);

		PlatoABM platoABM = PlatoABM.getInstancia();
		long idPlato1 = platoABM.agregar("Muzzarella", 380.0, 170.0, foodTruck);
		long idPlato2 = platoABM.agregar("Empanada", 120.0, 50.0, foodTruck);

		pedidoABM.agregarItemPedido(idPedido, new datos.ItemPedido(platoABM.traerPlato(idPlato1), 2));
		pedidoABM.agregarItemPedido(idPedido, new datos.ItemPedido(platoABM.traerPlato(idPlato2), 4));

		Pedido pedidoTraido = pedidoABM.traerPedidoYItemPedidos(idPedido);
		System.out.println("Pedido traído: " + pedidoTraido);
		System.out.println("Estado cerrado: " + pedidoTraido.isCerrado());
		Set<ItemPedido> items = pedidoTraido.getItems();
		System.out.println("Cantidad de items del pedido: " + items.size());
		for (ItemPedido item : items) {
			System.out.println(item);
		}
	}
}
