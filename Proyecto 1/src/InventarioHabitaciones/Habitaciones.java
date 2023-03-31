package InventarioHabitaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

@SuppressWarnings("unused")
public class Habitaciones {
	
	//Atributos
	private int capacidad;
	private String identificador;
	private String tipo;
	private String ubicacion;
	private String extras;
	
	
	//Métodos
	
	public Habitaciones(int capacidad2, String identificador2, String tipo2, String ubicacion2, String extras2) {
		// TODO Auto-generated constructor stub
	}

	public void actualizarInformacionInventario() {
		
	}
	
	@SuppressWarnings("resource")
	public void cargarArchivoHabitaciones(String archivo) throws IOException {
		
		BufferedReader archivoHabit;
		archivoHabit = new BufferedReader(new FileReader(archivo)); 
		
		String habitacion = archivoHabit.readLine();
		
		while(habitacion != null) {
			String[] partesHabit = habitacion.split(";");
			int capacidad = parseInt(partesHabit[0]); 
			String identificador = partesHabit[1];
			String tipo = partesHabit[2];
			String ubicacion = partesHabit[3];
			String extras = partesHabit[4];
			
			Habitaciones nuevaH = new Habitaciones(capacidad, identificador, tipo, ubicacion, extras);
			
			System.out.println(nuevaH);
		}
	}
	

	public void crearNuevasHabitaciones() {
		
	}
	
	public void asignarHabitacion() {
		
	}

	public void reservarHabitacion() {
		
	}

	public void cancelarHabitacion() {
		
	}

	private int parseInt(String cap) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	//Setters & Getters

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getExtras() {
		return extras;
	}

	public void setExtras(String extras) {
		this.extras = extras;
	}
	
}


