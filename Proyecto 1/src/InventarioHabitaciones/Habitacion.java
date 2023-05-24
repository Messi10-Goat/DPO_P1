package InventarioHabitaciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Habitacion {
	
	//Atributos
	private int capacidad;
	private String identificador;
	private String tipo;
	private String ubicacion;
	private String extras;
	private List<String> reservas = new ArrayList();
	
	
	//Métodos
	
	public Habitacion(int capacidad2, String identificador2, String tipo2, String ubicacion2, String extras2) {
		this.capacidad=capacidad2;
		this.identificador=identificador2;
		this.tipo=tipo2;
		this.ubicacion=ubicacion2;
		this.extras=extras2;
	}
	
	public void actualizarInformacionInventario() {
		
	}
	
	@SuppressWarnings("resource")
	
	
	public void asignarHabitacion() {
		
	}

	public void reservarHabitacion() {
		
		
	}
    public void filtrarHabitacionesporCapacidadyTipo(String tipo,int capacidad) {
    	
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
	public List<String> getReservas() {
		return reservas;
	}
	
	public void setReservas(List<String> reservas) {
		
		this.reservas = reservas;
	}
	
	
	@Override
	public String toString() {
		return "Habitacion "+identificador+": capacidad: "+capacidad+", tipo: "+tipo+", ubicacion: "+ubicacion;
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


