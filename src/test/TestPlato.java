package test;

import negocio.PlatoABM;

public class TestPlato {
	
	public static void main(String[] args) {
		PlatoABM pABM = PlatoABM.getInstancia(); 
		long idPlato = pABM.agregar("Hamburguesa Completa", 2500, 1200);
		
		System.out.println("Ultimo ID de Plato creado --> " + idPlato);
		System.out.println(pABM.traerPlato(idPlato));
		
	}

}
