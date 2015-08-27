package jv.colegio.models;


public class Perro {

	
	private String nombre;
	private String raza;
	private String localidad;
	private String propietaio_cc;
	private String propietario_nombre;
	private String telefono;
	private String dia_asistencia;
	
	
	/**
	 * Constructor de Perro
	 * @param nombre
	 * @param raza
	 * @param localidad
	 * @param propietaio_cc
	 * @param propietario_nombre
	 * @param telefono
	 * @param dia_asistencia
	 */
	public Perro(String nombre, String raza, String localidad, String propietaio_cc, String propietario_nombre,
			String telefono, String dia_asistencia) {
		super();
		this.nombre = nombre;
		this.raza = raza;
		this.localidad = localidad;
		this.propietaio_cc = propietaio_cc;
		this.propietario_nombre = propietario_nombre;
		this.telefono = telefono;
		this.dia_asistencia = dia_asistencia;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getPropietaio_cc() {
		return propietaio_cc;
	}
	public void setPropietaio_cc(String propietaio_cc) {
		this.propietaio_cc = propietaio_cc;
	}
	public String getPropietaio_nombre() {
		return propietario_nombre;
	}
	public void setPropietaio_nombre(String propietario_nombre) {
		this.propietario_nombre = propietario_nombre;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDia_asistencia() {
		return dia_asistencia;
	}
	public void setDia_asistencia(String dia_asistencia) {
		this.dia_asistencia = dia_asistencia;
	}

	/**
	 * Imprime información del perro
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Nombre: ");
		builder.append(nombre);
		builder.append(", Raza: ");
		builder.append(raza);
		builder.append(", Localidad: ");
		builder.append(localidad);
		builder.append(", Propietaio CC: ");
		builder.append(propietaio_cc);
		builder.append(", Nombre del propietario: ");
		builder.append(propietario_nombre);
		builder.append(", Telefono: ");
		builder.append(telefono);
		builder.append(", Dia de asistencia: ");
		builder.append(dia_asistencia);
		return builder.toString();
	}
	
}
