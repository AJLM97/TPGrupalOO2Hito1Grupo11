package test;

import java.time.LocalDate;

import datos.Festival;
import datos.FoodTruck;
import negocio.EmpleadoABM;
import negocio.FestivalABM;
import negocio.UnidadVentaABM;

public class TestFoodTruck {

	public static void main(String[] args) {
		EmpleadoABM eABM = EmpleadoABM.getInstancia(); 
		long idEmpleado = eABM.agregarCajero("Pedro", "Gonzalez", 77777777, LocalDate.of(1995, 5, 12), LocalDate.of(2022, 6, 22), 50, "Mañana", 5);
		
		FestivalABM fABM = FestivalABM.getInstancia();
		
		UnidadVentaABM uABM = UnidadVentaABM.getInstancia();
		long idUnidadVenta = uABM.agregarFoodTruck("Hamburguesas Carlitos", "ABC123", 10, eABM.traerEmpleado(idEmpleado), fABM.traerFestival(1), "ABC123", true);
		
		System.out.println("Ultimo ID de UnidadVenta creado --> " + idUnidadVenta);
		
	}

}
