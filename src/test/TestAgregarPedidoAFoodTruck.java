package test;

import java.time.LocalDate;
import java.util.Set;

import datos.FoodTruck;
import datos.ItemPedido;
import datos.Pedido;
import datos.Plato;
import negocio.EmpleadoABM;
import negocio.FestivalABM;
import negocio.PedidoABM;
import negocio.PlatoABM;
import negocio.UnidadVentaABM;

public class TestAgregarPedidoAFoodTruck {

	public static void main(String[] args) {
		System.out.println("=== TestAgregarPedidoAFoodTruck ===");

		FestivalABM festivalABM = FestivalABM.getInstancia();
		long idFestival = festivalABM.agregar(
				"Festival de Verano",
				"Verano",
				LocalDate.of(2026, 1, 10),
				LocalDate.of(2026, 1, 20),
				25.0,
				150.0,
				50.0);

		EmpleadoABM empleadoABM = EmpleadoABM.getInstancia();
		long idEmpleado = empleadoABM.agregarCajero(
				"Ana",
				"López",
				30111222L,
				LocalDate.of(1990, 3, 5),
				LocalDate.of(2024, 2, 1),
				30000,
				"Mañana",
				2000);

		UnidadVentaABM unidadVentaABM = UnidadVentaABM.getInstancia();
		long idUnidadVenta = unidadVentaABM.agregarFoodTruck(
				"Burger House",
				"BH-001",
				25.0,
				empleadoABM.traerEmpleado(idEmpleado),
				festivalABM.traerFestival(idFestival),
				"ABC123",
				true);

		FoodTruck foodTruck = (FoodTruck) unidadVentaABM.traerUnidadVenta(idUnidadVenta);

		PedidoABM pedidoABM = PedidoABM.getInstancia();
		long idPedido = pedidoABM.agregar(LocalDate.of(2026, 1, 15), foodTruck);
		System.out.println("Pedido creado con id: " + idPedido);

		PlatoABM platoABM = PlatoABM.getInstancia();
		long idPlato1 = platoABM.agregar("Hamburguesa", 450.0, 180.0, foodTruck);
		long idPlato2 = platoABM.agregar("Papas Fritas", 220.0, 90.0, foodTruck);
		long idPlato3 = platoABM.agregar("Gaseosa", 180.0, 60.0, foodTruck);

		Plato plato1 = platoABM.traerPlato(idPlato1);
		Plato plato2 = platoABM.traerPlato(idPlato2);
		Plato plato3 = platoABM.traerPlato(idPlato3);

		ItemPedido item1 = new ItemPedido(plato1, 2);
		ItemPedido item2 = new ItemPedido(plato2, 3);
		ItemPedido item3 = new ItemPedido(plato3, 1);

		pedidoABM.agregarItemPedido(idPedido, item1);
		pedidoABM.agregarItemPedido(idPedido, item2);
		pedidoABM.agregarItemPedido(idPedido, item3);

		Pedido pedido = pedidoABM.traerPedidoYItemPedidos(idPedido);
		Set<ItemPedido> items = pedido.getItems();
		System.out.println("Cantidad de items cargados: " + items.size());
		for (ItemPedido item : items) {
			System.out.println("Item: " + item.getPlato().getNombre() + " - cantidad: " + item.getCantidad());
		}

		pedido.setCerrado(true);
		pedidoABM.modificar(pedido);
		System.out.println("Pedido cerrado: " + pedido.isCerrado());
		System.out.println("Pedido final: " + pedido);
	}
}
