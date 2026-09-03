package test;

import datos.Festival;
import negocio.FestivalABM;

public class TestTraerFestival {

	public static void main(String[] args) {
		System.out.println("=== TestTraerFestival ===");
		
		FestivalABM fAbm = FestivalABM.getInstancia();
		
		Festival festival = fAbm.traerFestival(1L); // Sabores del Sur
		
		System.out.println("Festival ID " + festival.getIdFestival());
		System.out.println(festival);

	}

}
