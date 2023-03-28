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
		System.out.println("1. Menu Administrador");
		System.out.println("2. Menu Empleado");
		System.out.println("3. Menu Huesped");
		System.out.println("0. Salir");
	}
	
	public void ejecutarOpcion(int opcion) throws IOException{
		
		if (opcion == 1) {
			
			menuAdministrador();
			
			Scanner seleccion = new Scanner(System.in);
			int sel = seleccion.nextInt();
			
			if(sel == 1) {
				
				System.out.println("Opción A");
				
			} else if (sel == 2) {
				
			} else if (sel == 0) {
				System.out.println("Saliendo...");
			} else {
				System.out.println("No se ha ingresado una opción válida!");
			}
			
		} else if (opcion == 2) {
			
			menuEmpleado();
			
			Scanner seleccion = new Scanner(System.in);
			int sel = seleccion.nextInt();
			
			if(sel == 1) {
				
				System.out.println("Opción A");
				
			} else if (sel == 2) {
				
			} else if (sel == 0) {
				System.out.println("Saliendo...");
			} else {
				System.out.println("No se ha ingresado una opción válida!");
			}
			
		} else if (opcion == 3) {
			
			menuHuesped();
			
			Scanner seleccion = new Scanner(System.in);
			int sel = seleccion.nextInt();
			
			if(sel == 1) {
				
				System.out.println("Opción A");
				
			} else if (sel == 2) {
				
			} else if (sel == 0) {
				System.out.println("Saliendo...");
			} else {
				System.out.println("No se ha ingresado una opción válida!");
			}
			
		} else if (opcion == 0) {
			System.out.println("Saliendo...");
			
		} else {
			System.out.println("No se ha seleccionado una opcion válida!");
		}
		
	}
	
	public void menuAdministrador() {
		System.out.println("\nMenu Administrador");
		System.out.println("1) Crear Tarifa");
		System.out.println("2) Crear Habitación");
		System.out.println("0) Salir");
	}
	
	public void menuEmpleado() {
		System.out.println("\nMenu Empleado");
		System.out.println("1) Crear Reserva");
		System.out.println("2) Cargar Pago");
		System.out.println("0) Salir");
	}
	
	public void menuHuesped() {
		System.out.println("\nMenu Huespes");
		System.out.println("1) Ingresar Datos");
		System.out.println("2) Consultar Reserva");
		System.out.println("3) Salir");
	}
}
