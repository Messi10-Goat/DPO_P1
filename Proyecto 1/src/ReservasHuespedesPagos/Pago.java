package ReservasHuespedesPagos;

@SuppressWarnings("unused")
public class Pago {

	//Atributos
	
	private double precio;
	private String metodoPago;
	private int numeroCuotas;
	private String servicio;
	private String estado;
	
	
	//Métodos
	
	public void pagarReserva() {
		
	}
	
	private void pedirReembolso() {
		
	}
	
	private void modificarCuotas() {
		
	}
	
	private void agregarPropina() {
		
	}
	
	
	//Setters & Getters
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMetodoPago() {
		return metodoPago;
	}

	public void setMetodoPago(String metodoPago) {
		this.metodoPago = metodoPago;
	}

	public int getNumeroCuotas() {
		return numeroCuotas;
	}

	public void setNumeroCuotas(int numeroCuotas) {
		this.numeroCuotas = numeroCuotas;
	}
}
