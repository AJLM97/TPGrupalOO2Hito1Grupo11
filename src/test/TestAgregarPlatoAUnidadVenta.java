package test;

import negocio.UnidadVentaABM;

public class TestAgregarPlatoAUnidadVenta {
	
	public static void main(String[] args) {
		System.out.println("=== TestAgregarPlatoAUnidadVenta ===");

		UnidadVentaABM uABM = UnidadVentaABM.getInstancia();

		long idFoodTruckA = 2L; // Pizzas Ledesma
		long idFoodTruckB = 3L; // Sushi Express

		long idPlatoA = 7L; // Pizza fugazzeta
		long idPlatoB = 12L; // Pizza margarita
		long idPlatoC = 14L; // Pizza napolitana
		long idPlatoD = 15L; // Nigiri
		long idPlatoE = 16L; // Tempura
		
		try {
			uABM.agregarPlatoAUnidadVenta(idPlatoA, idFoodTruckA);
			uABM.agregarPlatoAUnidadVenta(idPlatoB, idFoodTruckA);
			uABM.agregarPlatoAUnidadVenta(idPlatoC, idFoodTruckA);

		} catch(Exception e) {
			e.printStackTrace();
		}

		try {
			uABM.agregarPlatoAUnidadVenta(idPlatoD, idFoodTruckB);
			uABM.agregarPlatoAUnidadVenta(idPlatoE, idFoodTruckB);

		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
