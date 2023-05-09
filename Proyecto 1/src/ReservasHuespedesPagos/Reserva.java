package ReservasHuespedesPagos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

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
	
	
	//
	private String fecha;
	private int num;
	private ArrayList<String> res;
	private ArrayList<String> lista;
	private ArrayList<Integer> conteo;
	private HashMap<String, ArrayList<String>> reservas = new HashMap();
	
	//Métodos
	@SuppressWarnings("unchecked")
	public Reserva(Habitacion habitacion,String fecha_inicio, String fecha_final, String nombre, int cedula, String correo, int numero_personas, int codigo_reserva) {
		this.habitacion = habitacion;
		this.fechaIncio = fecha_inicio;
		this.fechaSalida = fecha_final;
		this.nombre = nombre;
		this.cedula = cedula;
		this.correo = correo;
		this.numeroPersonas = numero_personas;
		this.codigoReserva = codigo_reserva;
		
		//
		fecha = fecha_inicio.toLowerCase();
		
		if (fecha.contains("ene")){
			
			res = reservas.get("ene");
			
			if (res == null) {
				
				lista = new ArrayList<String>();
				lista.addAll((Collection<? extends String>) habitacion);
				reservas.put("ene", lista);
				
				conteo.add(1);
				
			} else {
			
				res.addAll((Collection<? extends String>) habitacion);
				reservas.put("ene", res);
				
				num = conteo.get(0);
				num += 1;
				conteo.set(0, num);
				
			}
				
		} else if (fecha.contains("feb")) {
			
			res = reservas.get("feb");
			
			if (res == null) {
				
				lista = new ArrayList<String>();
				lista.addAll((Collection<? extends String>) habitacion);
				reservas.put("feb", lista);
				
				conteo.add(1);
				
			} else {
			
				res.addAll((Collection<? extends String>) habitacion);
				reservas.put("feb", res);
				
				num = conteo.get(1);
				num += 1;
				conteo.set(1, num);
			}
		} else if (fecha.contains("mar")) {
			
			res = reservas.get("mar");
			
			if (res == null) {
				
				lista = new ArrayList<String>();
				lista.addAll((Collection<? extends String>) habitacion);
				reservas.put("mar", lista);
				
				conteo.add(1);
				
			} else {
			
				res.addAll((Collection<? extends String>) habitacion);
				reservas.put("mar", res);
				
				num = conteo.get(2);
				num += 1;
				conteo.set(2, num);
				
			}
		} else if (fecha.contains("abr")) {
			
			res = reservas.get("abr");
			
			if (res == null) {
				
				lista = new ArrayList<String>();
				lista.addAll((Collection<? extends String>) habitacion);
				reservas.put("abr", lista);
				
				conteo.add(1);
				
			} else {
			
				res.addAll((Collection<? extends String>) habitacion);
				reservas.put("abr", res);
				
				num = conteo.get(3);
				num += 1;
				conteo.set(3, num);
				
			}
		} else if (fecha.contains("may")) {
			
			res = reservas.get("may");
			
			if (res == null) {
				
				lista = new ArrayList<String>();
				lista.addAll((Collection<? extends String>) habitacion);
				reservas.put("may", lista);
				
				conteo.add(1);
				
			} else {
			
				res.addAll((Collection<? extends String>) habitacion);
				reservas.put("may", res);
				
				num = conteo.get(4);
				num += 1;
				conteo.set(4, num);
				
			}
		} else if (fecha.contains("jun")) {
			
			res = reservas.get("jun");
			
			if (res == null) {
				
				lista = new ArrayList<String>();
				lista.addAll((Collection<? extends String>) habitacion);
				reservas.put("jun", lista);
				
				conteo.add(1);
				
			} else {
			
				res.addAll((Collection<? extends String>) habitacion);
				reservas.put("jun", res);
				
				num = conteo.get(5);
				num += 1;
				conteo.set(5, num);
				
			}
		} else if (fecha.contains("jul")) {
			
			res = reservas.get("jul");
			
			if (res == null) {
				
				lista = new ArrayList<String>();
				lista.addAll((Collection<? extends String>) habitacion);
				reservas.put("jul", lista);
				
				conteo.add(1);
				
			} else {
			
				res.addAll((Collection<? extends String>) habitacion);
				reservas.put("jul", res);
				
				num = conteo.get(6);
				num += 1;
				conteo.set(6, num);
				
			}
		} else if (fecha.contains("ago")) {
			
			res = reservas.get("ago");
			
			if (res == null) {
				
				lista = new ArrayList<String>();
				lista.addAll((Collection<? extends String>) habitacion);
				reservas.put("ago", lista);
				
				conteo.add(1);
				
			} else {
			
				res.addAll((Collection<? extends String>) habitacion);
				reservas.put("ago", res);
				
				num = conteo.get(7);
				num += 1;
				conteo.set(7, num);
				
			}
		} else if (fecha.contains("sep")) {
			
			res = reservas.get("sep");
			
			if (res == null) {
				
				lista = new ArrayList<String>();
				lista.addAll((Collection<? extends String>) habitacion);
				reservas.put("sep", lista);
				
				conteo.add(1);
				
			} else {
			
				res.addAll((Collection<? extends String>) habitacion);
				reservas.put("sep", res);
				
				num = conteo.get(8);
				num += 1;
				conteo.set(8, num);
				
			}
		} else if (fecha.contains("oct")) {
			
			res = reservas.get("oct");
			
			if (res == null) {
				
				lista = new ArrayList<String>();
				lista.addAll((Collection<? extends String>) habitacion);
				reservas.put("oct", lista);
				
				conteo.add(1);
				
			} else {
			
				res.addAll((Collection<? extends String>) habitacion);
				reservas.put("oct", res);
				
				num = conteo.get(9);
				num += 1;
				conteo.set(9, num);
				
			}
		} else if (fecha.contains("nov")) {
			
			res = reservas.get("nov");
			
			if (res == null) {
				
				lista = new ArrayList<String>();
				lista.addAll((Collection<? extends String>) habitacion);
				reservas.put("nov", lista);
				
				conteo.add(1);
				
			} else {
			
				res.addAll((Collection<? extends String>) habitacion);
				reservas.put("nov", res);
				
				num = conteo.get(10);
				num += 1;
				conteo.set(10, num);
				
			}
		} else {
			
			res = reservas.get("dic");
			
			if (res == null) {
				
				lista = new ArrayList<String>();
				lista.addAll((Collection<? extends String>) habitacion);
				reservas.put("dic", lista);
				
				conteo.add(1);
				
			} else {
			
				res.addAll((Collection<? extends String>) habitacion);
				reservas.put("dic", res);
				
				num = conteo.get(11);
				num += 1;
				conteo.set(11, num);
			}
		}
		
		
	}
	
	public void contarReservas() {
		
		for (int i = 0; i < conteo.size(); i++) {
			
			switch(i) {
				
			case 0:
			
				System.out.println("Enero: " + conteo.get(i) + " reservas.");
				break;
			
			case 1:
				
				System.out.println("Febrero: " + conteo.get(i) + " reservas.");
				break;
			
			case 2:
				
				System.out.println("Marzo: " + conteo.get(i) + " reservas.");
				break;
				
			case 3:
				
				System.out.println("Abril: " + conteo.get(i) + " reservas.");
				break;
				
			case 4:
				
				System.out.println("Mayo: " + conteo.get(i) + " reservas.");
				break;
				
			case 5:
				
				System.out.println("Junio: " + conteo.get(i) + " reservas.");
				break;
				
			case 6:
				
				System.out.println("Julio: " + conteo.get(i) + " reservas.");
				break;
				
			case 7:
				
				System.out.println("Agosoto: " + conteo.get(i) + " reservas.");
				break;
				
			case 8:
				
				System.out.println("Septiembre: " + conteo.get(i) + " reservas.");
				break;
				
			case 9:
				
				System.out.println("Octubre: " + conteo.get(i) + " reservas.");
				break;
				
			case 10:
				
				System.out.println("Noviembre: " + conteo.get(i) + " reservas.");
				break;
				
			case 11:
				
				System.out.println("Diciembre: " + conteo.get(i) + " reservas.");
				break;
				
			default:
				break;
			}
			
			
		}
		
		
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
