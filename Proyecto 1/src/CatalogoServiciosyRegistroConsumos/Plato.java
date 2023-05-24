package CatalogoServiciosyRegistroConsumos;

@SuppressWarnings("unused")
public class Plato {

	//Atributos
	
	private static long hora = 0;
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
	
	
	public void lugaresHotel() {
		
	}
	
	public void disponibilidadRestaurante() {
		
	}
	
	
	public void horarioReservas() {
		
	}
	
	
	//Setters & Getters
	
	public String getDesayuno() {
		return nombre;
	}

	public void setDesayuno(String desayuno) {
		this.nombre = desayuno;
	}

	public String getAlmuerzo() {
		return nombre;
	}

	public void setAlmuerzo(String almuerzo) {
		this.nombre = almuerzo;
	}

	public String getCena() {
		return nombre;
	}

	public void setCena(String cena) {
		this.nombre = cena;
	}

	public String getLugar() {
		return nombre;
	}

	public void setLugar(String lugar) {
		this.nombre = lugar;
	}

	public long getHora() {
		return hora;
	}

	public void setHora(long hora) {
		this.hora = hora;
	}
}
