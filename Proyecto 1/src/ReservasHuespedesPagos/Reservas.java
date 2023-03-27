package ReservasHuespedesPagos;

import ReservasHuespedesPagos.Huespedes;
import ReservasHuespedesPagos.Pagos;

@SuppressWarnings("unused")
public class Reservas {
	
	//Atributos
	
	private String fechaIncio;
	private String fechaSalida;
	private String nombre;
	private int cedula;
	private String correo;
	private int numeroPersonas;
	private long hora;
	private String tipoHabitacion;
	
	
	//Métodos
	
	public void realizarReserva() {
		
	}
	
	
	private void cancelarReserva() {
		
		
	}
	
	private void aplazarReserva() {
		
	}
	
	public void cambiarDatos() {
		
	}
	
	
	//Setters & Getters
	
	public String getFechaIncio() {
		return fechaIncio;
	}

	public void setFechaIncio(String fechaIncio) {
		this.fechaIncio = fechaIncio;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getNumeroPersonas() {
		return numeroPersonas;
	}

	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}

	public long getHora() {
		return hora;
	}

	public void setHora(long hora) {
		this.hora = hora;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	
}
