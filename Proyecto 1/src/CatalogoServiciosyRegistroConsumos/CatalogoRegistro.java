package CatalogoServiciosyRegistroConsumos;
// comentario al azar de prueba
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import CatalogoServiciosyRegistroConsumos.Plato;
import CatalogoServiciosyRegistroConsumos.Tarifa;
import Excepciones.HabitacionExcpecion;
import InventarioHabitaciones.Habitacion;
import ReservasHuespedesPagos.Reserva;

import Excepciones.HabitacionExcpecion;

@SuppressWarnings("unused")
public class CatalogoRegistro {
	
	//Cambio de nombre de las importaciones
	private CatalogoServiciosyRegistroConsumos.Plato Menu;
	private CatalogoServiciosyRegistroConsumos.Tarifa Tarifas;
	
	//Atributos Clase
	private List<Habitacion> habitaciones = new ArrayList();
	private List<Reserva> reservas = new ArrayList();
	private List<Plato> menu = new ArrayList();
	private List<Tarifa> tarifas = new ArrayList();
	private List<Integer> calendario_tarifas = new ArrayList();
	private double pagos;
	
	//Métodos
	
	
   public void cargarArchivoHabitaciones(String archivo) throws IOException {
		
		BufferedReader archivoHabit;
		File file = new File(archivo);
		System.out.println("archivo-> "+file.getAbsolutePath());
		System.out.println("existe? "+file.exists());
		archivoHabit = new BufferedReader(new FileReader(archivo)); 
		String habitacion = archivoHabit.readLine();
		
		while(habitacion != null) {
			
			String[] partesHabit = habitacion.split(";");
			System.out.println("nuevaLinea: "+habitacion);
			int capacidad = parseInt(partesHabit[0]); 
			String identificador = partesHabit[1];
			String tipo = partesHabit[2];
			String ubicacion = partesHabit[3];
			String extras = partesHabit[4];
			
			String tam = partesHabit[5];
			String aire = partesHabit[6];
			String cal = partesHabit[7];
			String cam = partesHabit[8];
			String tv = partesHabit[9];
			String caf = partesHabit[10];
			String rYt = partesHabit[11];
			String pla = partesHabit[12];
			String sec = partesHabit[13];
			String ac = partesHabit[14];
			String usbA = partesHabit[15];
			String usbC = partesHabit[16];
			String des = partesHabit[17];
			
			HashMap<String, String> caracteristicas = new HashMap<String, String>();
			caracteristicas.put("Tamaño (m2)", tam);
			caracteristicas.put("Aire acondicionado", aire);
			caracteristicas.put("Calefacción", cal);
			caracteristicas.put("Tamaño cama", cam);
			caracteristicas.put("TV", tv);
			caracteristicas.put("Cafetera", caf);
			caracteristicas.put("Ropa de Cama & Tapetes Hipoalergenicos", rYt);
			caracteristicas.put("Plancha", pla);
			caracteristicas.put("Secador de Pelo", sec);
			caracteristicas.put("Voltaje AC", ac);
			caracteristicas.put("Tomas USB-A", usbA);
			caracteristicas.put("Tomas USB-C", usbC);
			caracteristicas.put("Desayuno", des);
			
			
			Habitacion nuevaH = new Habitacion(capacidad, identificador, tipo, ubicacion, extras, caracteristicas);
			habitaciones.add(nuevaH);
			
			System.out.println(nuevaH);
			
			habitacion = archivoHabit.readLine();
			
		}
   }
		
		public void actualizarHabitaciones(String archivo) throws IOException {
			
			BufferedReader archivoHabit;
			File file = new File(archivo);
			System.out.println("archivo-> "+file.getAbsolutePath());
			System.out.println("existe? "+file.exists());
			archivoHabit = new BufferedReader(new FileReader(archivo)); 
			String habitacion = archivoHabit.readLine();
			
			while(habitacion != null) {
				String[] partesHabit = habitacion.split(";");
				System.out.println("nuevaLinea: "+habitacion);
				int capacidad = parseInt(partesHabit[0]); 
				String identificador = partesHabit[1];
				String tipo = partesHabit[2];
				String ubicacion = partesHabit[3];
				String extras = partesHabit[4];
				

				habitaciones.forEach(hab -> {
					if(hab.getIdentificador() == identificador) {
						hab.setTipo(tipo);
						hab.setExtras(extras);
						hab.setUbicacion(ubicacion);
						hab.setCapacidad(capacidad);
					}
				});
				
				
				
				
				
				habitacion = archivoHabit.readLine();
				
			}
		
	
	}
   

	public void crearNuevasHabitaciones(int capacidad, String identificador, String tipo, String ubicacion, String extras, HashMap<String, String> caracteristicas) {
		Habitacion nuevaH = new Habitacion(capacidad, identificador, tipo, ubicacion, extras, caracteristicas);
		habitaciones.add(nuevaH);
	}
	
	private int parseInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void cargarTarifas(String archivo)throws IOException {
		
		BufferedReader archivoHabit;
		File file = new File(archivo);
		System.out.println("archivo-> "+file.getAbsolutePath());
		System.out.println("existe? "+file.exists());
		archivoHabit = new BufferedReader(new FileReader(archivo)); 
		String tarifa = archivoHabit.readLine();
		
		while(tarifa != null) {
			String[] partesTarifa = tarifa.split(";");
			System.out.println("nuevaLinea: "+tarifa);
			int valor = parseInt(partesTarifa[0]); 
			String fecha_inicio = partesTarifa[1];
			String fecha_fin = partesTarifa[2];
			String dias = partesTarifa[3];
			String tipo_habitacion = partesTarifa[4];
			
			Tarifa nuevaTarifa = new Tarifa(fecha_inicio, fecha_fin, valor, dias, tipo_habitacion);
			tarifas.add(nuevaTarifa);
			
			
			
			
			tarifa = archivoHabit.readLine();
			
		}
		
	}
	
	public void crearTarifas(int valor, String fecha_inicio, String fecha_fin, String dias, String tipo) {
		Tarifa nuevaTarifa = new Tarifa(fecha_inicio, fecha_fin,valor, dias, tipo);
		tarifas.add(nuevaTarifa);
			
	}
	
	public void cambiarTarifas(int valor, String fecha_inicio, String fecha_fin, String dias, String tipo) {
		
		tarifas.forEach(tar -> {
			if((tar.getFechainicio() == fecha_inicio)&&(tar.getFechafin() == fecha_fin)&&(tar.getDias()==dias)&&(tar.getTipohab()==tipo)) {
				tar.setValor(valor);
			}
		});
			
	
		
	}
	
	public void cargarMenuRestaurante(String archivo)throws IOException {
		BufferedReader archivoHabit;
		File file = new File(archivo);
		System.out.println("archivo-> "+file.getAbsolutePath());
		System.out.println("existe? "+file.exists());
		archivoHabit = new BufferedReader(new FileReader(archivo)); 
		String plato = archivoHabit.readLine();
		
		while(plato != null) {
			String[] partesPlato = plato.split(";");
			System.out.println("nuevaLinea: "+plato);
			int valor = parseInt(partesPlato[3]); 
			String nombre = partesPlato[0];
			boolean habitacion = valueOf(partesPlato[1]);
			String horas = partesPlato[4];
			String tipo_plato = partesPlato[2];
			
			
			Plato nuevoPlato = new Plato(nombre, habitacion, valor, horas,tipo_plato);
			menu.add(nuevoPlato);
			
			
			
			
			plato = archivoHabit.readLine();
			
		}
		
	}
	
	public void crearReserva( Habitacion habitacion_reserva, String fecha_inicio, String fecha_final, String nombre, int cedula, String correo, int numero_personas){
		Habitacion hab = new Habitacion(numero_personas, correo, correo, correo, correo, null);
		String rango_fecha = fecha_inicio + "-" + fecha_final;
		habitacion_reserva.getReservas().add(rango_fecha);
		int codigo_reserva = reservas.size();
		Reserva nuevaReserva = new Reserva(habitacion_reserva,fecha_inicio,fecha_final,nombre,cedula,correo,numero_personas,codigo_reserva);
		reservas.add(nuevaReserva);
		}
		
	
	 public List<Habitacion> filtrarHabitacionesporCapacidadyTipo(String tipo,int capacidad)  {
		 List<Habitacion> habitaciones_filtradas = new ArrayList();
		 habitaciones.forEach(hab -> {
				if((hab.getTipo() == tipo)&&(hab.getCapacidad()==capacidad)) {
					habitaciones_filtradas.add(hab);
				}
			});
		 return habitaciones_filtradas;
	    }
	public void buscarReserva(int codigoRes) {
		    
			
			reservas.forEach(res -> {
				if(res.getCodigo() == codigoRes) {
					String fecha_in = res.getFechaIncio();
					System.out.println(fecha_in);
				}
				else {
					String fecha_in = "no hay fecha";
					System.out.println(fecha_in);
				}
				
			});
			
	}
			
	public void cancelarReserva(int codigo_reserva){
		
		reservas.forEach(res -> {
			if(res.getCodigo() == codigo_reserva) {
				Habitacion habitacion = res.getHabitacion();
				String rango_fechas = res.getFechaIncio() + "-" + res.getFechaSalida();
				habitacion.setReservas(habitacion.getReservas()
						.stream()
						.filter(h -> !h.equals(rango_fechas))
						.collect(Collectors.toList()));
			}
		});
		reservas = reservas.stream().filter(r -> r.getCodigo() != codigo_reserva).collect(Collectors.toList());
		
		
	}
	private boolean valueOf(String string) {
		// TODO Auto-generated method stub
		return false;
	}

	public void configurarPlato() {
		
	}
	
	public void registrarConsumo() {
	
	}
	
	public void registrarPago() {
		
	}
	
	public void generarFactura() {
		List nuevasHabitaciones = habitaciones
				.stream()
				.filter(h -> h.getCapacidad()==4)
				///
				.collect(Collectors.toList());
			
			habitaciones.forEach(hab -> {
				if(hab.getCapacidad() == 4) {
					hab.setTipo("sencilla");
				}
			});
		
	}

}
