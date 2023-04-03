package CatalogoServiciosyRegistroConsumos;

@SuppressWarnings("unused")
public class Plato {

	//Atributos
	
	private String nombre;
	private Boolean habitacion;
	private String tipo_plato;
	private int precio;
	private String horas;
	
	
	//Métodos
	
	public Plato(String nombre2, boolean habitacion2, int valor, String horas2, String tipo_plato2) {
	// TODO Auto-generated constructor stub
		this.nombre = nombre2;
		this.habitacion = habitacion2;
		this.tipo_plato = tipo_plato2;
		this.precio = valor;
		this.horas = horas2;
	}


	public void productosDisponibles() {
		
	}
	
	
	private void lugaresHotel() {
		
	}
	
	private void disponibilidadRestaurante() {
		
	}
	
	
	private void horarioReservas() {
		
	}
	
	
	//Setters & Getters
	
	public String getDesayuno() {
		return desayuno;
	}

	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}

	public String getAlmuerzo() {
		return almuerzo;
	}

	public void setAlmuerzo(String almuerzo) {
		this.almuerzo = almuerzo;
	}

	public String getCena() {
		return cena;
	}

	public void setCena(String cena) {
		this.cena = cena;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public long getHora() {
		return hora;
	}

	public void setHora(long hora) {
		this.hora = hora;
	}
}
