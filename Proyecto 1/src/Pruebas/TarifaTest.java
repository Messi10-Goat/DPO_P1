package Pruebas;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import CatalogoServiciosyRegistroConsumos.Tarifa;

public class TarifaTest {

	private Tarifa tarifa;
	
	public void setUp(String fecha_inicio2, String fecha_fin2, int valor2, String dias2, String tipo_habitacion2) throws Exception{
		
		tarifa = new Tarifa(fecha_inicio2, fecha_fin2, valor2, dias2, tipo_habitacion2);
		
	}
	
	public void testConsTarfia() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {tarifa.consultarTarifa();});
		
	}
	
	public void testAsigTarifa() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {tarifa.asignarTarifa();});
		
	}
	
	public void testFijarTarfia() {
		
		assertTimeout(Duration.ofMinutes(1), () -> {tarifa.fijarTarifa();});
		
	}
	
}
