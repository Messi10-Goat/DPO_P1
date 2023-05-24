package Excepciones;

import java.util.ArrayList;

public class HabitacionExcpecion {
	
	private ArrayList<String> ids = new ArrayList<String>();
	
	private String id = "";
	
	public String crearHabExcepcion() throws Exception {
		
		if (ids.size() == 0) {
			
			ids.add(id);
			
		} else {
			
			for (int i = 0; i < ids.size(); i++) {
				
				if (id == ids.get(i)) {
					
					return "Ya existe una habitacion con ese id!";
					
				} else {
					
					continue;
				}
				
			}
			
		}
		
		return "Se ha creado una nueva habitacion con el id: " + id;
		
	}
	
	
}
