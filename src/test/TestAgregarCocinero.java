package test;

import java.time.LocalDate;

import negocio.EmpleadoABM;


public class TestAgregarCocinero {

	public static void main(String[] args) {
		EmpleadoABM eABM = EmpleadoABM.getInstancia();
		
		long idEmpleado = eABM.agregarCocinero("Agustin", "Perez", 43218765, LocalDate.of(1999, 7, 13), LocalDate.of(2021, 5, 9), 70, 3, "Pasteleria", 10);
		
		System.out.println("Ultimo ID de Empleado creado --> " + idEmpleado);
	}

}