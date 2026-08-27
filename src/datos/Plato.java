package datos;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Plato {
	private long idPlato;
	private String nombre;
	private double precioVenta;
	private double costoProduccion;
	private Set<UnidadVenta> unidades;

	public Plato() {}

	public Plato(String nombre, double precioVenta, double costoProduccion) {
		super();
		this.nombre = nombre;
		this.precioVenta = precioVenta;
		this.costoProduccion = costoProduccion;
	}

	public long getIdPlato() {
		return idPlato;
	}

	protected void setIdPlato(long idPlato) {
		this.idPlato = idPlato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}

	public double getCostoProduccion() {
		return costoProduccion;
	}

	public void setCostoProduccion(double costoProduccion) {
		this.costoProduccion = costoProduccion;
	}

	public Set<UnidadVenta> getUnidades() {
	    return unidades;
	}

	protected void setUnidades(Set<UnidadVenta> unidades) {
	    this.unidades = unidades;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(idPlato);
	}

	@Override
	public boolean equals(Object obj) {
		Plato other = (Plato) obj;
		return idPlato == other.idPlato;
	}
	
	public boolean agregar(UnidadVenta unidad) {
		boolean agregar = false;
		if(!(unidades.contains(unidad))) {
			agregar = unidades.add(unidad);
		}
		return agregar;
	}
	
	public boolean eliminar(UnidadVenta unidad) {
		UnidadVenta borrar = null;
		boolean eliminar = false;
		Iterator<UnidadVenta> it = unidades.iterator();
		while((it.hasNext()) && (borrar==null)) {
			UnidadVenta aux = it.next();
			if(aux.equals(unidad)) borrar = aux;
		}
		eliminar = unidades.remove(borrar);
		return eliminar;
	}

	@Override
	public String toString() {
		return "Plato [idPlato=" + idPlato + ", nombre=" + nombre + ", precioVenta=" + precioVenta
				+ ", costoProduccion=" + costoProduccion + "]";
	}

}
