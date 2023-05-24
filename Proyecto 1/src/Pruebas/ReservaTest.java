package Pruebas;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import InventarioHabitaciones.Habitacion;
import ReservasHuespedesPagos.Reserva;

public class ReservaTest {
	
	private Reserva res;
	
	public void setUp(Habitacion habitacion,String fecha_inicio, String fecha_final, String nombre, int cedula, String correo, int numero_personas, int codigo_reserva) throws Exception{
		
		res = new Reserva(habitacion, fecha_inicio, fecha_final, nombre, cedula, correo, numero_personas, codigo_reserva);
		
	}

	public void testContarReservas() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {res.contarReservas();});
		
	}
	
	public void testObtenerDatos() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {res.obtenerDatos();});
		
	}

	public void testRealizarReserva() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {res.realizarReserva();});
		
	}
	
	public void testCancelarReserva() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {res.cancelarReserva();});
		
	}
	
	public void testAplazarReserva() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {res.aplazarReserva();});
		
	}
	
	public void testCambiarDatos() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {res.cambiarDatos();});
		
	}
	
	public void testRevisarResvera() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {res.revisarReserva();});
		
	}
	
}
