package test;

import datos.Empleado;
import datos.Festival;
import negocio.FestivalABM;
import negocio.UnidadVentaABM;
import negocio.EmpleadoABM;

public class TestAgregarUnidadVenta {

	public static void main(String[] args) {
		System.out.println("=== TestAgregarUnidadVenta ===");
		
		FestivalABM fABM = FestivalABM.getInstancia();
		UnidadVentaABM uABM = UnidadVentaABM.getInstancia();
        EmpleadoABM eABM = EmpleadoABM.getInstancia();

        Festival festival = fABM.traerFestival(1L); // Sabores del Sur

        Empleado cocineroA = eABM.traerEmpleado(2L); // María González
        Empleado cajeroA = eABM.traerEmpleado(1L); // Alejandro Ledesma
		Empleado cajeroB = eABM.traerEmpleado(6L); // Carlos López
		
        try {
            long idUnidadVenta = uABM.agregarPuestoDesarmable("Hamburguesas Deliciosas", "HBD123", 15, cajeroA, festival, 4, 2);
			System.out.printf("Id Puesto Desarmable: %d", idUnidadVenta);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
            long idUnidadVenta = uABM.agregarFoodTruck("Pizzas Ledesma", "AJL199", 10, cocineroA, festival, "AJL199", true);
			System.out.printf("Id FoodTruck: %d", idUnidadVenta);

		} catch(Exception e) {
			e.printStackTrace();
		}

		try {
            long idUnidadVenta = uABM.agregarFoodTruck("Sushi Express", "SE-001", 18.0, cajeroB, festival, "SUX999", true);
			System.out.printf("Id FoodTruck: %d", idUnidadVenta);

		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}