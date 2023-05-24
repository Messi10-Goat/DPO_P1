package Pruebas;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import CatalogoServiciosyRegistroConsumos.CatalogoRegistro;
import InventarioHabitaciones.Habitacion;

public class CatalogoRegistroTest {
	
	private CatalogoRegistro catReg;
	
	public void setUp() throws Exception {
		catReg = new CatalogoRegistro();
	}
	
	public void testCargarArcHab(String archivo) {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.cargarArchivoHabitaciones(archivo);});
		
	}
	
	public void testActHab(String archivo) {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.actualizarHabitaciones(archivo);});
		
	}
	
	public void testCrearNuevasHab(int capacidad, String id, String tipo, String ubi, String extras) {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.crearNuevasHabitaciones(capacidad, id, tipo, ubi, extras);});
		
	}
	
	public void testCargarTarifas(String archivo) {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.cargarTarifas(archivo);});
		
	}
	
	public void testCrearTarifas(int valor, String fI, String fF, String dias, String tipo) {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.crearTarifas(valor, fI, fF, dias, tipo);});
		
	}
	
	public void testCambiarTarifas(int valor, String fI, String fF, String dias, String tipo) {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.cambiarTarifas(valor, fF, fI, dias, tipo);});
		
	}
	
	public void testCargarMenuRes(String archivo) {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.cargarMenuRestaurante(archivo);});
		
	}
	
	public void testCrearReserva(Habitacion habitacion_reserva, String fecha_inicio, String fecha_final, String nombre, int cedula, String correo, int numero_personas) {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.crearReserva(habitacion_reserva, fecha_inicio, fecha_final, nombre, cedula, correo, numero_personas);});
		
	}
	
	public void testBuscarResvera(int codigo) {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.buscarReserva(codigo);});
		
	}
	
	public void testCancelarResvera(int codigo) {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.cancelarReserva(codigo);});
		
	}
	
	public void testConfPlato() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.configurarPlato();});
		
	}
	
	public void testRegCon() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.registrarConsumo();});
		
	}
	
	public void testRegPago() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.registrarPago();});
		
	}
	
	public void testGenerarFactura() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {catReg.generarFactura();});
		
	}	
	
}
