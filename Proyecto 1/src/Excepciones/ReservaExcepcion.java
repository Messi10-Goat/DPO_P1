package Excepciones;

import java.util.ArrayList;

public class ReservaExcepcion {

	private ArrayList<String> ids = new ArrayList<String>();
	
	private String id = "";
	
	public String crearHabExcepcion() throws Exception {
		
		if (ids.size() == 0) {
			
			ids.add(id);
			
		} else {
			
			for (int i = 0; i < ids.size(); i++) {
				
				if (id == ids.get(i)) {
					
					return "Ya existe una reserva con ese id!";
					
				} else {
					
					continue;
				}
				
			}
			
		}
		
		return "Nueva reserva creada con el id: " + id;
		
	}
	
}
