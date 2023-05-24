package Pruebas;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.HashMap;

import InventarioHabitaciones.Habitacion;

public class HabitacionTest {

	private Habitacion habit;
	
	public void setUp(int capacidad2, String identificador2, String tipo2, String ubicacion2, String extras2, HashMap<String, String> caracteristicas) throws Exception{
		
		habit = new Habitacion(capacidad2, identificador2, tipo2, ubicacion2, extras2, caracteristicas);
		
	}
	
	public void testActInf() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {habit.actualizarInformacionInventario();});
		
	}
	
	public void testAsigHab() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {habit.asignarHabitacion();});
		
	}
	
	public void testResHab() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {habit.reservarHabitacion();});
		
	}
	
	public void testFilHabCap(String tipo,int capacidad) {
		
		assertTimeout(Duration.ofMinutes(1), () -> {habit.filtrarHabitacionesporCapacidadyTipo(tipo, capacidad);});
		
	}
	
	public void testCanHab() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {habit.cancelarHabitacion();});
		
	}
	
}
