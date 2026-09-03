package test;

import datos.ItemPedido;
import datos.Plato;
import negocio.PedidoABM;
import negocio.PlatoABM;

public class TestAgregarItemPedido {

	public static void main(String[] args) {
		System.out.println("=== TestAgregarItemPedido ===");

		PedidoABM peABM = PedidoABM.getInstancia();
		PlatoABM pABM = PlatoABM.getInstancia();

		long idPedidoA = 1L; // 2026/09/05 - Pizzas Ledesma
		long idPedidoB = 2L; // 2026/09/05 - Sushi Express

		try {
			Plato platoA = pABM.traerPlato(7L); // Pizza fugazzeta
			Plato platoB = pABM.traerPlato(12L); // Pizza margarita
			Plato platoC = pABM.traerPlato(14L); // Pizza napolitana

			peABM.agregarItemPedido(idPedidoA, new ItemPedido(platoA, 2));
			peABM.agregarItemPedido(idPedidoA, new ItemPedido(platoB, 3));
			peABM.agregarItemPedido(idPedidoA, new ItemPedido(platoC, 1));

			System.out.println("Se agregaron 3 items al pedido con id: " + idPedidoA);
			peABM.cerrarPedido(idPedidoA);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			Plato platoA = pABM.traerPlato(15L); // Nigiri
			Plato platoB = pABM.traerPlato(16L); // Tempura

			peABM.agregarItemPedido(idPedidoB, new ItemPedido(platoA, 2));
			peABM.agregarItemPedido(idPedidoB, new ItemPedido(platoB, 3));

			System.out.println("Se agregaron 3 items al pedido con id: " + idPedidoB);
			peABM.cerrarPedido(idPedidoB);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
