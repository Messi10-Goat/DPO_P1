package Pruebas;

import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;

import ReservasHuespedesPagos.Huesped;

public class HuespedTest {
	
	private Huesped hues;
	
	public void setUp() throws Exception{
		
		hues = new Huesped();
		
	}
	
	public void testConsHues() {
		
		assertTimeout(Duration.ofMinutes(1), ()->{hues.consultarHuespedes();});
		
	}
	
	public void testConsNumHues() {
		
		assertTimeout(Duration.ofMinutes(1), ()->{hues.consultarNumeroHuespedes();});
		
	}
	
	public void testBetHues() {
		
		assertTimeout(Duration.ofMinutes(1), ()->{hues.betarHuesped();});
		
	}
	
	public void testEnviarEncuesta() {
		
		assertTimeout(Duration.ofMinutes(1), ()->{hues.enviarEncuesta();});
		
	}

}
