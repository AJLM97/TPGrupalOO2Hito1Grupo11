package test;

import java.time.LocalDate;

import negocio.EmpleadoABM;
import negocio.FestivalABM;
import negocio.UnidadVentaABM;

public class TestPuestoDesarmable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmpleadoABM eABM = EmpleadoABM.getInstancia(); 
		long idEmpleado = eABM.agregarCajero("Juan", "Ramirez", 22222222, LocalDate.of(1999, 7, 20), LocalDate.of(2023, 6, 22), 50, "Tarde", 2);
		
		FestivalABM fABM = FestivalABM.getInstancia();
		
		UnidadVentaABM uABM = UnidadVentaABM.getInstancia();
		long idUnidadVenta = uABM.agregarPuestoDesarmable("Taquitos", "FJK456", 10, eABM.traerEmpleado(idEmpleado), fABM.traerFestival(1), 2, 25);
		
		System.out.println("Ultimo ID de UnidadVenta creado --> " + idUnidadVenta);
	}

}
