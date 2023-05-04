package ReservasHuespedesPagos;

import java.util.ArrayList;
import java.util.List;

import CatalogoServiciosyRegistroConsumos.Plato;

@SuppressWarnings("unused")
public class Huesped {
	
	//Atributos
	
	private String nombre;
	private int edad;
	private boolean adultosMayores;
	private boolean discapacitados;
	private List<Plato> Platos_consumidos = new ArrayList();
	private List<Pago> Pagos_hechos = new ArrayList();
	private List<Pago> Pagos_pendientes = new ArrayList();
	private boolean menoresCuatroAnos;
	private int numeroHuespedes;
	
	
	//Métodos
	
	public void consultarHuespedes() {
		
	}
	
	private void consultarNumeroHuespedes() {
		
	}
	
	private void betarHuesped() {
		
	}
	
	private void enviarEncuesta() {
		
	}
	
	
	//Setters & Getters
	
	public int getNumeroHuespedes() {
		return numeroHuespedes;
	}

	public void setNumeroHuespedes(int numeroHuespedes) {
		this.numeroHuespedes = numeroHuespedes;
	}

	public boolean isMenoresCuatroAños() {
		return menoresCuatroAños;
	}

	public void setMenoresCuatroAños(boolean menoresCuatroAños) {
		this.menoresCuatroAños = menoresCuatroAños;
	}

	public boolean isAdultosMayores() {
		return adultosMayores;
	}

	public void setAdultosMayores(boolean adultosMayores) {
		this.adultosMayores = adultosMayores;
	}

	public boolean isDiscapacitados() {
		return discapacitados;
	}

	public void setDiscapacitados(boolean discapacitados) {
		this.discapacitados = discapacitados;
	}
}
