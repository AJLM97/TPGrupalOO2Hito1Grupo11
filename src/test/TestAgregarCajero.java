package test;

import java.time.LocalDate;

import negocio.EmpleadoABM;


public class TestAgregarCajero {

	public static void main(String[] args) {
		EmpleadoABM eABM = EmpleadoABM.getInstancia();
		
		long idEmpleado = eABM.agregarCajero("Paula", "Alvarez", 35353535, LocalDate.of(1985, 1, 15), LocalDate.of(2021, 3, 3), 50, "Noche", 7);
		
		System.out.println("Ultimo ID de Empleado creado --> " + idEmpleado);

	}

}