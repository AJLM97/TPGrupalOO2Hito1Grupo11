package test;

import java.time.LocalDate;

import negocio.EmpleadoABM;

public class TestAgregarEmpleado {

	public static void main(String[] args) {
		System.out.println("=== TestAgregarEmpleado ===");
        
        EmpleadoABM eABM = EmpleadoABM.getInstancia();
		
		try {
			long idEmpleado = eABM.agregarCajero("Alejandro", "Ledesma", 40389074, LocalDate.of(1997, 6, 18), LocalDate.of(2021, 6, 22), 700000, "Mañana", 500);
			System.out.printf("Id Empleado: %d", idEmpleado);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
			long idEmpleado = eABM.agregarCocinero("María", "González", 40389075, LocalDate.of(1998, 7, 15), LocalDate.of(2021, 6, 22), 800000, 1, "Pizza", 10);
			System.out.printf("Id Cocinero: %d", idEmpleado);

		} catch(Exception e) {
			e.printStackTrace();
		}

        try {
            long idEmpleado = eABM.agregarCajero("Juan", "Pérez", 40389076, LocalDate.of(1999, 8, 20), LocalDate.of(2021, 6, 22), 700000, "Noche", 700);
            System.out.printf("Id Empleado: %d", idEmpleado);

        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            long idEmpleado = eABM.agregarCocinero("Lucía", "Martínez", 40389077, LocalDate.of(2000, 9, 25), LocalDate.of(2021, 6, 22), 800000, 1, "Hamburguesa", 800);
            System.out.printf("Id Cocinero: %d", idEmpleado);

        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            long idEmpleado = eABM.agregarCajero("Carlos", "Rodríguez", 40389078, LocalDate.of(2001, 10, 30), LocalDate.of(2021, 6, 22), 50, "Tarde", 900);
            System.out.printf("Id Empleado: %d", idEmpleado);

        } catch(Exception e) {
            e.printStackTrace();
        }

        try {
            long idEmpleado = eABM.agregarCajero( "Carlos", "López", 31000555, LocalDate.of(1988, 11, 18), LocalDate.of(2022, 3, 20), 31000, "Mañana", 2100);
            System.out.printf("Id Empleado: %d", idEmpleado);

        } catch(Exception e) {
            e.printStackTrace();
        }

	}

}