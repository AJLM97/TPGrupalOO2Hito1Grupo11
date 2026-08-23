package datos;

import java.util.Set;

public abstract class UnidadVenta {
	protected long idUnidadVenta;
	protected String nombreComercial;
	protected String codigo;
	protected double superficie;
	protected Empleado responsable;
	protected Festival festival;
	protected Set<Empleado> staff;
	protected Set<Plato> platos;
	
	public UnidadVenta() {}

	public UnidadVenta(String nombreComercial, String codigo, double superficie, Empleado responsable,
			Festival festival) {
		super();
		this.nombreComercial = nombreComercial;
		this.codigo = codigo;
		this.superficie = superficie;
		this.responsable = responsable;
		this.festival = festival;
	}

	public long getIdUnidadVenta() {
		return idUnidadVenta;
	}

	protected void setIdUnidadVenta(long idUnidadVenta) {
		this.idUnidadVenta = idUnidadVenta;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public Empleado getResponsable() {
		return responsable;
	}

	public void setResponsable(Empleado responsable) {
		this.responsable = responsable;
	}

	public Festival getFestival() {
		return festival;
	}

	public void setFestival(Festival festival) {
		this.festival = festival;
	}

	public Set<Empleado> getStaff() {
		return staff;
	}

	public void setStaff(Set<Empleado> staff) {
		this.staff = staff;
	}

	public Set<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(Set<Plato> platos) {
		this.platos = platos;
	}

	@Override
	public String toString() {
		return "idUnidadVenta=" + idUnidadVenta + ", nombreComercial=" + nombreComercial + ", codigo="
				+ codigo + ", superficie=" + superficie + ", responsable=" + responsable;
	}

}
