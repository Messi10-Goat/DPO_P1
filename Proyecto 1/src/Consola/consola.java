package Consola;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import ReservasHuespedesPagos.Reservas;
import CatalogoServiciosyRegistroConsumos.CatalogoRegistro;
import InventarioHabitaciones.Habitaciones;

@SuppressWarnings("unused")
public class consola {
	//Cambio de nombre de las importaciones
	private ReservasHuespedesPagos.Reservas Reservas;
	private CatalogoServiciosyRegistroConsumos.CatalogoRegistro CatalogoRegistro;
	private InventarioHabitaciones.Habitaciones Habitaciones;
	
	//Función MAIN
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
	
	//Función del menu
	public void menu() {
		System.out.println("1. Menu Administrador");
		System.out.println("2. Menu Empleado");
		System.out.println("3. Menu Huesped");
		System.out.println("0. Salir");
		
		espacio();
	}
	
	//Función ejecución
	public void ejecutarOpcion(int opcion) throws IOException{
		
		if (opcion == 1) {
			
			boolean go = true;
			while(go) {
				try {
					menuAdministrador();
					
					Scanner seleccion = new Scanner(System.in);
					int sel = seleccion.nextInt();
					
					if(sel == 1) {
						entreEspacio();
						System.out.println("Centro de Habitaciones");
						entreEspacio();
						System.out.println("Seleccione una opción");
						System.out.println("1. Cargar Archivo Habitaciones");
						System.out.println("2. Crear Habitaciones");
						System.out.println("0. Regresar");
						
						Scanner op1 = new Scanner(System.in);
						int opcion1 = op1.nextInt();
						
						if(opcion1 == 1) {
							System.out.println("Ingrese el nombre del archivo");
							
							Scanner ar = new Scanner(System.in);
							String nombre = ar.nextLine();
							
							String nombreArchivo = nombre;
							
							Habitaciones.cargarArchivoHabitaciones(nombreArchivo);
						} else if (opcion1 == 2){
							Habitaciones.crearNuevasHabitaciones();
						} else if (opcion1 == 0){
							System.out.println("Volviendo...");
						} else {
							System.out.println("No se ha ingresado una opción valida!");
						}
						
					} else if (sel == 2) {
						entreEspacio();
						System.out.println("Centro de Tarifas");
						entreEspacio();
						System.out.println("Seleccione una opción");
						System.out.println("1. Cargar Tarifas");
						System.out.println("2. Crear Tarifas");
						System.out.println("3. Cambiar Tarifas");
						System.out.println("0. Volver");
						
						Scanner op2 = new Scanner(System.in);
						int opcion2 = op2.nextInt();
						
						if (opcion2 == 1) {
							CatalogoRegistro.cargarTarifas();
						} else if (opcion2 == 2) {
							CatalogoRegistro.crearTarifas();
						} else if (opcion2 == 3) {
							CatalogoRegistro.cambiarTarifas();
						} else if (opcion2 == 0) {
							System.out.println("Volviendo...");
						} else {
							System.out.println("No se ha ingresado una opción válida!");
						}
						
					} else if (sel == 3) {
						
						entreEspacio();
						System.out.println("Centro de Platos");
						entreEspacio();
						System.out.println("Seleccione una opción");
						System.out.println("1. Crear Plato");
						System.out.println("2. Cargar Menu Restaurante");
						System.out.println("0. Volver");
						
						Scanner op5 = new Scanner(System.in);
						int opcion5 = op5.nextInt();
						
						if (opcion5 == 1) {
							
							CatalogoRegistro.configurarPlato();
							
						} else if (opcion5 == 2) {
							
							CatalogoRegistro.cargarMenuRestaurante();
							
						} else if (opcion5 == 0) {
							
							System.out.println("Volviendo...");
							
						} else {
							
							System.out.println("No se ha seleccionado una opción válida!");
							
						}
						
						
					} else if (sel == 0) {
						System.out.println("Saliendo...");
						go = false;
					} else {
						System.out.println("No se ha ingresado una opción válida!");
					}
				
				} catch (NumberFormatException e) {
				
					System.out.println("Seleccione una opción válida!\n");
					
				}
			}
			
		} else if (opcion == 2) {
			
			boolean go = true;
			while(go) {
				try {
				
					menuEmpleado();
					
					Scanner seleccion = new Scanner(System.in);
					int sel = seleccion.nextInt();
					
					if(sel == 1) {
						
						entreEspacio();
						System.out.println("Centro de Reservas");
						entreEspacio();
						System.out.println("Seleccione una opción");
						System.out.println("1. Crear Reserva");
						System.out.println("2. Aplazar Reserva");
						System.out.println("3. Cancelar Reserva");
						System.out.println("0. Regresar");
						
						Scanner op3 = new Scanner(System.in);
						int opcion3 = op3.nextInt();
						
						if (opcion3 == 1) {
							
							Reservas.realizarReserva();
							
						} else if (opcion3 == 2) {
							
							Reservas.aplazarReserva();
							
						} else if (opcion3 == 3) {
							
							Reservas.cancelarReserva();
							
						} else if (opcion3 == 0) {
							
							System.out.println("Volviendo...");
							
						} else {
							
							System.out.println("No se ha ingresado una opción válida!");
							
						}
						
						
					} else if (sel == 2) {
						
						entreEspacio();
						System.out.println("Centro de Pagos");
						entreEspacio();
						System.out.println("Seleccione una opción");
						System.out.println("1. Registrar Consumo");
						System.out.println("2. Registrar Pago");
						System.out.println("3. Generar Factura");
						System.out.println("0. Volver");
						
						Scanner op4 = new Scanner(System.in);
						int opcion4 = op4.nextInt();
						
						if (opcion4 == 1) {
							
							CatalogoRegistro.registrarConsumo();
							
						} else if (opcion4 == 2) {
							
							CatalogoRegistro.registrarPago();
							
						} else if (opcion4 == 3) {
							
							CatalogoRegistro.generarFactura();
							
						} else if (opcion4 == 0) {
							
							System.out.println("Volviendo...");
							
						} else {
							
							System.out.println("No se ha seleccionado una opción válida!");
							
						}
						
					} else if (sel == 0) {
						System.out.println("Saliendo...");
						go = false;
					} else {
						System.out.println("No se ha ingresado una opción válida!");
					}
					
				} catch (NumberFormatException e) {
					
					System.out.println("Seleccione una opción válida!\n");
					
				}
			}
			
		} else if (opcion == 3) {
			
			boolean go = true;
			while(go) {
				try {
					menuHuesped();
					
					Scanner seleccion = new Scanner(System.in);
					int sel = seleccion.nextInt();
					
					if(sel == 1) {
						
						entreEspacio();
						System.out.println("Centro de Datos de Usuario");
						entreEspacio();
						
						System.out.println("Seleccione una opción");
						System.out.println("1. Ingresar Datos");
						System.out.println("2. Cambiar Datos");
						System.out.println("0. Volver");
						
						Scanner op6 = new Scanner(System.in);
						int opcion6 = op6.nextInt();
						
						if (opcion6 == 1) {
							
							Reservas.obtenerDatos();
							
						} else if (opcion6 == 2) {
							
							Reservas.cambiarDatos();
							
						} else if (opcion6 == 0) {
							
							System.out.println("Volviendo...");
							
						} else {
							
							System.out.println("No se ha ingresado una opción válida!");
							
						}
						
						Reservas.obtenerDatos();
						
					} else if (sel == 2){
						
						Reservas.revisarReserva();
						
					} else if (sel == 0) {
						System.out.println("Saliendo...");
						go = false;
					} else {
						System.out.println("No se ha ingresado una opción válida!");
					}
					
				} catch (NumberFormatException e) {
					
					System.out.println("Seleccione una opción válida!\n");
					
				}
			}
			
		} else if (opcion == 0) {
			System.out.println("Saliendo...");
			
		} else {
			System.out.println("No se ha seleccionado una opcion válida!");
		}
		
	}
	
	
	//Funcion del menu del administrador
	public void menuAdministrador() {
		System.out.println("\nMenu Administrador");
		System.out.println("1. Centro de Habitaciones");
		System.out.println("2. Centro de Tarifas");
		System.out.println("3. Centro de Platos");
		System.out.println("0. Salir");
		
		espacio();
	}
	
	//Función del menu del empleado
	public void menuEmpleado() {
		System.out.println("\nMenu Empleado");
		System.out.println("1. Centro de Reservas");
		System.out.println("2. Centro de Pagos");
		System.out.println("0. Salir");
		
		espacio();
	}
	
	//Función del menu del huesped
	public void menuHuesped() {
		System.out.println("\nMenu Huespes");
		System.out.println("1. Centro de Datos");
		System.out.println("2. Consultar Reserva");
		System.out.println("0. Salir");
	
		espacio();
	}
	
	//Funciones de estetica y formato
	public void espacio() {
		System.out.println("--------------------------------------------------------------");
	}
	
	public void entreEspacio() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}
