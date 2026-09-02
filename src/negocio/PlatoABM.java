package negocio;

import java.util.List;

import dao.PlatoDao;
import datos.Plato;
import datos.UnidadVenta;

public class PlatoABM {

	private static PlatoABM abm = null;
	private PlatoDao dao = PlatoDao.getInstance();

	private PlatoABM() {}

	public static PlatoABM getInstancia() {
		if(abm == null) {
			abm = new PlatoABM();
		}
		return abm;
	}

	public int agregar(String nombre, double precioVenta, double costoProduccion) {
		Plato aux = new Plato(nombre, precioVenta, costoProduccion);
		return dao.agregar(aux);
	}

	public int agregar(String nombre, double precioVenta, double costoProduccion, UnidadVenta unidad) {
		Plato aux = new Plato(nombre, precioVenta, costoProduccion, unidad);
		return dao.agregar(aux);
	}

	public void modificar(Plato plato) {
		dao.actualizar(plato);
	}

	public void eliminar(long idPlato) {
		Plato aux = dao.traer(idPlato);
		dao.eliminar(aux);
	}
	
	public Plato traerPlato(long idPlato) {
		Plato aux = dao.traer(idPlato);
		return aux;
	}

	public List<Plato> traerPlato() {
		return dao.traer();
	}
	
}