package test;

import datos.Festival;
import negocio.FestivalABM;

public class TestTraerFestival {

	public static void main(String[] args) {
		FestivalABM fAbm = FestivalABM.getInstancia();
		
		long idFestival = 1;
		
		Festival f = fAbm.traerFestival(idFestival);
		
		System.out.println("Festival ID " + f.getIdFestival());
		System.out.println(f);

	}

}
