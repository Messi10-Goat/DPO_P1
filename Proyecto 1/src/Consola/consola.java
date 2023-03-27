package Consola;

import java.io.IOException;
import java.util.Scanner;

import ReservasHuespedesPagos.Reservas;
import CatalogoServiciosyRegistroConsumos.CatalogoRegistro;
import InventarioHabitaciones.Habitaciones;

@SuppressWarnings("unused")
public class consola {
	
	public static void main(String[] args) throws IOException{
		
		consola consola = new consola();
		
		boolean continuar = true;
		while(continuar) {
			try {
				System.out.println("Sistema del Hotel\n");
				
				consola.menu();
				System.out.println("\nIngrese una opcion: ");
				Scanner op = new Scanner(System.in);
				int opcion = op.nextInt();
				
				if (opcion == 0) {
					continuar = false;
				}
				
				consola.ejecutarOpcion(opcion);
				System.out.println("\n");
				
			} catch (NumberFormatException e) {
			
				System.out.println("Seleccione una opción válida!\n");
				
			}
		}
	}
	
	
	public void menu() {
		System.out.println("1. A");
		System.out.println("2. B");
		System.out.println("3. C");
		System.out.println("0. Salir");
	}
	
	public void ejecutarOpcion(int opcion) throws IOException{
		
		if (opcion == 1) {
			
		} else if (opcion == 2) {
			
		} else if (opcion == 3) {
			
		} else if (opcion == 0) {
			System.out.println("Saliendo...");
			
		} else {
			System.out.println("No se ha seleccionado una opcion válida!");
		}
		
	}
}
