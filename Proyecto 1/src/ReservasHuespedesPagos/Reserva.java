package ReservasHuespedesPagos;

import CatalogoServiciosyRegistroConsumos.Tarifa;
import InventarioHabitaciones.Habitacion;
import ReservasHuespedesPagos.Huesped;
import ReservasHuespedesPagos.Pago;

@SuppressWarnings("unused")
public class Reserva {
	
	//Cambio de nombre de las importaciones
	private ReservasHuespedesPagos.Huesped Huespedes;
	private ReservasHuespedesPagos.Pago Pagos;
	
	//Atributos
	private String fechaIncio;
	private String fechaSalida;
	private String nombre;
	private int cedula;
	private String correo;
	private int numeroPersonas;
	private long hora;
	private String tipoHabitacion;
	private Habitacion habitacion;
	private Tarifa tarifa;
	private int codigoReserva;
	
	
	//Métodos
	public Reserva(Habitacion habitacion,String fecha_inicio, String fecha_final, String nombre, int cedula, String correo, int numero_personas, int codigo_reserva) {
		this.habitacion = habitacion;
		this.fechaIncio = fecha_inicio;
		this.fechaSalida = fecha_final;
		this.nombre = nombre;
		this.cedula = cedula;
		this.correo = correo;
		this.numeroPersonas = numero_personas;
		this.codigoReserva = codigo_reserva;
		
	}
	public void obtenerDatos() {
		
	}
	
	public void realizarReserva() {
		
		
	}
	
	
	public void cancelarReserva() {
		
		
	}
	
	public void aplazarReserva() {
		
	}
	
	public void cambiarDatos() {
		
	}
	
	public void revisarReserva() {
		
	}
	
	//Setters & Getters
	
	public String getFechaIncio() {
		return fechaIncio;
	}
	public int getCodigo() {
		return codigoReserva;
	}
	public Habitacion getHabitacion() {
		return habitacion;
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
