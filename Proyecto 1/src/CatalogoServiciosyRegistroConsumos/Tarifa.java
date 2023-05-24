package CatalogoServiciosyRegistroConsumos;

@SuppressWarnings("unused")
public class Tarifa {
	
	//Atributos Clase
	private String fecha_inicio;
	private String fecha_fin;
	private int valor;
	private String dias;
	private String tipo_habitacion;
	
	//Métodos
	
	public Tarifa(String fecha_inicio2, String fecha_fin2, int valor2, String dias2, String tipo_habitacion2) {
		this.fecha_inicio = fecha_inicio2;
		this.fecha_fin = fecha_fin2;
		this.valor = valor2;
		this.dias = dias2;
		this.tipo_habitacion = tipo_habitacion2;
		
	}
	public void consultarTarifa() {
		
	}

	public void asignarTarifa() {
		
	}
	
	public void fijarTarifa() {
		
	}
	
	
	//Setters & Getters
	
	public String getFechainicio() {
		return fecha_inicio;
	}
	public String getFechafin() {
		return fecha_fin;
	}
	public String getTipohab() {
		return tipo_habitacion;
	}
	public int getvalor() {
		return valor;
	}
	public String getDias() {
		return dias;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
}

