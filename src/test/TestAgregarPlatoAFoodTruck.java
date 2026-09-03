package test;

import negocio.UnidadVentaABM;

public class TestAgregarPlatoAFoodTruck {
	
	public static void main(String[] args) {
		UnidadVentaABM uABM = UnidadVentaABM.getInstancia();

		long idFoodTruck = 2L; // Pizzas Ledesma

		long idPlatoA = 7L; // Pizza fugazzeta
		long idPlatoB = 12L; // Pizza margarita
		long idPlatoC = 14L; // Pizza napolitana
		
		try {
			uABM.agregarPlatoAUnidadVenta(idPlatoA, idFoodTruck);
			uABM.agregarPlatoAUnidadVenta(idPlatoB, idFoodTruck);
			uABM.agregarPlatoAUnidadVenta(idPlatoC, idFoodTruck);

		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
