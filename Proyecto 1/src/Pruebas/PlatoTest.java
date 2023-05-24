package Pruebas;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import CatalogoServiciosyRegistroConsumos.Plato;

public class PlatoTest {

	private Plato plato;
	
	public void setUp(String nombre2, boolean habitacion2, int valor, String horas2, String tipo_plato2) throws Exception{
		
		plato = new Plato(nombre2, habitacion2, valor, horas2, tipo_plato2);
		
	}
	
	public void testProdDis() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {plato.productosDisponibles();});
		
	}
	
	public void testLugHot() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {plato.lugaresHotel();});
		
	}
	
	public void testDispRes() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {plato.disponibilidadRestaurante();});
		
	}
	
	public void testHorRes() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {plato.horarioReservas();});
		
	}
	
}
