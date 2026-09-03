package test;

import negocio.PlatoABM;

public class TestAgregarPlato {

	public static void main(String[] args) {
		PlatoABM platoABM = PlatoABM.getInstancia();

		try {
			long idPlato = platoABM.agregar("Choripán", 950, 420);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idPlato = platoABM.agregar("Hamburguesa doble", 1400, 620);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idPlato = platoABM.agregar("Milanesa napolitana", 1550, 700);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idPlato = platoABM.agregar("Empanada de carne", 250, 105);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idPlato = platoABM.agregar("Taco de pollo", 280, 130);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idPlato = platoABM.agregar("Lomito con papas", 1800, 900);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

		try {
			long idPlato = platoABM.agregar("Pizza fugazzeta", 1450, 680);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idPlato = platoABM.agregar("Sandwich de milanesa", 1200, 540);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idPlato = platoABM.agregar("Wrap de pollo", 1050, 470);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idPlato = platoABM.agregar("Quesadilla de carne", 11000, 470);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idPlato = platoABM.agregar("Churros con dulce de leche", 600, 220);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idPlato = platoABM.agregar("Pizza margarita", 1400, 600);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idPlato = platoABM.agregar("Ensalada César con pollo", 1300, 610);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idPlato = platoABM.agregar("Pizza napolitana", 1500, 650);
			System.out.printf("Id Plato: %d", idPlato);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
