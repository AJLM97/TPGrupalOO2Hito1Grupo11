package test;

import java.time.LocalDate;

import negocio.FestivalABM;

public class TestAgregarFestival {

	public static void main(String[] args) {
		FestivalABM fABM = FestivalABM.getInstancia();
		
		try {
			long idFestival = fABM.agregar("Sabores del Sur", "Verano", LocalDate.of(2027, 1, 10), LocalDate.of(2027, 1, 20), 500f, 10f, 2000f);
			System.out.printf("Id Festival: %d", idFestival);

		} catch(Exception e) {
			e.printStackTrace();
		}

		try {
			long idFestival = fABM.agregar("Festival Gastronómico", "Verano", LocalDate.of(2026, 12, 15), LocalDate.of(2026, 12, 25), 500f, 10f, 2000f);
			System.out.printf("Id Festival: %d", idFestival);

		} catch(Exception e) {
			e.printStackTrace();
		}

		try {
			long idFestival = fABM.agregar("Festival de Lanús", "Verano", LocalDate.of(2026, 11, 20), LocalDate.of(2026, 12, 10), 500f, 10f, 2000f);
			System.out.printf("Id Festival: %d", idFestival);

		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}