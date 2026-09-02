package test;

import java.time.LocalDate;

import datos.FoodTruck;
import datos.Pedido;
import negocio.EmpleadoABM;
import negocio.FestivalABM;
import negocio.PedidoABM;
import negocio.UnidadVentaABM;

public class TestPedido {

	public static void main(String[] args) {
		System.out.println("=== TestPedido ===");

		FestivalABM festivalABM = FestivalABM.getInstancia();
		long idFestival = festivalABM.agregar(
				"Festival de Otoño",
				"Otoño",
				LocalDate.of(2026, 3, 15),
				LocalDate.of(2026, 3, 25),
				20.0,
				140.0,
				45.0);

		EmpleadoABM empleadoABM = EmpleadoABM.getInstancia();
		long idEmpleado = empleadoABM.agregarCajero(
				"Juan",
				"García",
				28000333L,
				LocalDate.of(1995, 6, 20),
				LocalDate.of(2023, 1, 15),
				28000,
				"Noche",
				1500);

		UnidadVentaABM unidadVentaABM = UnidadVentaABM.getInstancia();
		long idUnidadVenta = unidadVentaABM.agregarFoodTruck(
				"Tacos Mexicanos",
				"TM-001",
				15.0,
				empleadoABM.traerEmpleado(idEmpleado),
				festivalABM.traerFestival(idFestival),
				"DEF456",
				false);

		FoodTruck foodTruck = (FoodTruck) unidadVentaABM.traerUnidadVenta(idUnidadVenta);

		// Crear y traer un pedido
		PedidoABM pedidoABM = PedidoABM.getInstancia();
		long idPedido = pedidoABM.agregar(LocalDate.of(2026, 3, 20), foodTruck);
		System.out.println("Pedido creado con id: " + idPedido);

		Pedido pedidoTraido = pedidoABM.traerPedido(idPedido);
		System.out.println("Pedido traído: " + pedidoTraido);
		System.out.println("¿Está cerrado? " + pedidoTraido.isCerrado());
	}
}
