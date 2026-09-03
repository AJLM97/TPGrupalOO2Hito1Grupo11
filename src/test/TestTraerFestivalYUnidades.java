package test;

import datos.Festival;
import datos.UnidadVenta;
import negocio.FestivalABM;

public class TestTraerFestivalYUnidades {

	public static void main(String[] args) {
		FestivalABM fABM = FestivalABM.getInstancia();
		
		Festival festival = fABM.traerFestivalYUnidades(1L); // Sabores del Sur
        System.out.println(festival);

        for(UnidadVenta uv : festival.getUnidades()) {
			System.out.println(uv);
		}

	}

}