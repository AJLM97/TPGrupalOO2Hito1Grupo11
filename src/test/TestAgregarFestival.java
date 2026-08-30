package test;

import java.time.LocalDate;

import negocio.FestivalABM;

public class TestAgregarFestival {

	public static void main(String[] args) {
		FestivalABM fAbm = FestivalABM.getInstancia();
		
		long festivalId = fAbm.agregar("Sabores del Sur", "Verano", LocalDate.of(2026, 1, 10), LocalDate.of(2026, 1, 20), 500f, 10f, 2000f);
		
		System.out.println("Ultimo ID de Festival creado --> " + festivalId);

	}

}