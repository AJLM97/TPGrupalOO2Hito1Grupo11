package test;

import java.time.LocalDate;

import datos.FoodTruck;
import negocio.PedidoABM;
import negocio.UnidadVentaABM;

public class TestAgregarPedido {

	public static void main(String[] args) {
		System.out.println("=== TestAgregarPedido ===");

		UnidadVentaABM uABM = UnidadVentaABM.getInstancia();
		PedidoABM peABM = PedidoABM.getInstancia();

		long idFoodTruckA = 2L; // Pizzas Ledesma
		long idFoodTruckB = 3L; // Sushi Express

		try {
			FoodTruck foodTruck = (FoodTruck) uABM.traerUnidadVenta(idFoodTruckA);
			long idPedido = peABM.agregar(LocalDate.of(2026, 9, 5), foodTruck);
			System.out.printf("Id Pedido: %d%n", idPedido);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
        	FoodTruck foodTruck = (FoodTruck) uABM.traerUnidadVenta(idFoodTruckB);
            long idPedido = peABM.agregar(LocalDate.of(2026, 9, 5), foodTruck);
            System.out.printf("Id Pedido: %d", idPedido);
        } catch(Exception e) {
            e.printStackTrace();
        }
	}
}
