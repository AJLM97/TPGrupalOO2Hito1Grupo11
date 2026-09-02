package test;

import java.time.LocalDate;

import negocio.EmpleadoABM;
import negocio.FestivalABM;
import negocio.PlatoABM;
import negocio.UnidadVentaABM;

public class AgregarPlatoAFoodTruck {
	
	public static void main(String[] args) {
		//Alta de Cajero
		EmpleadoABM eABM = EmpleadoABM.getInstancia(); 
		long idEmpleado = eABM.agregarCajero("Alejandro", "Ledesma", 40389074, LocalDate.of(1997, 6, 18), LocalDate.of(2021, 6, 22), 50, "Mañana", 500);
		
		//Alta de Festival
		FestivalABM fABM = FestivalABM.getInstancia();
		long festivalId = fABM.agregar("Sabores del Sur", "Verano", LocalDate.of(2026, 1, 10), LocalDate.of(2026, 1, 20), 500f, 10f, 2000f);
		
		//Alta de FoodTruck
		UnidadVentaABM uABM = UnidadVentaABM.getInstancia();
		long idUnidadVenta = uABM.agregarFoodTruck("Pizzas Ledesma", "AJL199", 10, eABM.traerEmpleado(idEmpleado), fABM.traerFestival(festivalId), "AJL199", true);
		
		System.out.println("Ultimo ID de UnidadVenta creado --> " + idUnidadVenta);
		
		//Alta de dos Platos
		PlatoABM pABM = PlatoABM.getInstancia(); 
		long idPlatoA = pABM.agregar("Pizza Napolitana", 24000, 14000);
		System.out.println("Ultimo ID de Plato creado --> " + idPlatoA);
		System.out.println(pABM.traerPlato(idPlatoA));
		long idPlatoB = pABM.agregar("Margarita", 25000, 15000);
		System.out.println("Ultimo ID de Plato creado --> " + idPlatoB);
		System.out.println(pABM.traerPlato(idPlatoB));
		
		uABM.agregarPlatoAUnidadVenta(idPlatoA, idUnidadVenta);
		uABM.agregarPlatoAUnidadVenta(idPlatoB, idUnidadVenta);
		System.out.println("Platos agregados a la unidad de venta con ID: " + idUnidadVenta);
		//System.out.println(uABM.traerFoodTruck(idUnidadVenta));
		
		//Intentar Agregar un plato repetido
		try {
			long idPlatoC = pABM.agregar("Pizza Napolitana", 24000, 14000);
			System.out.println("Ultimo ID de Plato creado --> " + idPlatoC);
			System.out.println(pABM.traerPlato(idPlatoC));
			uABM.agregarPlatoAUnidadVenta(idPlatoC, idUnidadVenta);
		} catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
