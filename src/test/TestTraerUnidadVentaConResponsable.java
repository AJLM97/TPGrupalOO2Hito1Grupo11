package test;

import java.util.List;

import datos.UnidadVenta;
import negocio.UnidadVentaABM;

public class TestTraerUnidadVentaConResponsable {

	public static void main(String[] args) {
		
		UnidadVentaABM unidad = UnidadVentaABM.getInstancia();
		List<UnidadVenta> lst = unidad.traerUnidadVentaConResponsable();
		
		for(UnidadVenta u : lst) {
			System.out.println(u.getNombreComercial() + " - Responsable: " + u.getResponsable());
		}
		
	}

}
