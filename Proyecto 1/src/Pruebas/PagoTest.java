package Pruebas;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import ReservasHuespedesPagos.Pago;

public class PagoTest {
	
	private Pago pago;
	
	public void setUp(double precio, String metodoPago, int numeroCuotas, String servicio, String estado) throws Exception{
		
		pago = new Pago(precio, metodoPago, numeroCuotas, servicio, estado);
		
	}
	
	public void testPagRes() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {pago.pagarReserva();});
		
	}
	
	public void testPedRem() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {pago.pedirReembolso();});
		
	}
	
	public void testModCuo() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {pago.modificarCuotas();});
		
	}

	public void testAgrProp() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {pago.agregarPropina();});
		
	}
	
}
