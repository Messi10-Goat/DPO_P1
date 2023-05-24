package Consola;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import ReservasHuespedesPagos.Reserva;
import CatalogoServiciosyRegistroConsumos.CatalogoRegistro;
import InventarioHabitaciones.Habitacion;

@SuppressWarnings("unused")
public class consola {
	//Cambio de nombre de las importaciones
	private ReservasHuespedesPagos.Reserva Reservas;
	private CatalogoServiciosyRegistroConsumos.CatalogoRegistro CatalogoRegistro;
	private InventarioHabitaciones.Habitacion Habitaciones;
	
	//Función MAIN
	public static void main(String[] args) throws IOException{
		
		consola consola = new consola();
		
		boolean continuar = true;
		while(continuar) {
			try {
				System.out.println("Sistema del Hotel\n");
				
				System.out.println("Ingrese la fecha de hoy en formato dia/mes/año");
				Scanner ar = new Scanner(System.in);
				String fecha_hoy = ar.nextLine();
				
				
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
							
							String nombreArchivo = nombre + ".txt";
							
							Path archivo = Paths.get("src/Data/"+nombreArchivo).toAbsolutePath();
							
							String nArchivo = archivo.toString();
							
							CatalogoRegistro cat = new CatalogoRegistro();
							cat.cargarArchivoHabitaciones(nArchivo);
							
						} else if (opcion1 == 2){
							
							System.out.println("ingrese la capacidad de la habitación");
							Scanner cap = new Scanner(System.in);
							int capacidad = cap.nextInt();
							System.out.println("ingrese el identificador de la habitación");
							Scanner id = new Scanner(System.in);
							String identificador = id.nextLine();
							System.out.println("ingrese el tipo de habitación");
							Scanner ti = new Scanner(System.in);
							String tipo = ti.nextLine();
							System.out.println("ingrese la ubicacion de la habitacion ");
							Scanner ub = new Scanner(System.in);
							String ubicacion = ub.nextLine();
							System.out.println("ingrese los extras que posee la habitacion ");
							Scanner ex = new Scanner(System.in);
							String extras = ex.nextLine();
							
							HashMap<String, String> caracteristicas = new HashMap<String, String>();
							
							CatalogoRegistro cat = new CatalogoRegistro();
							cat.crearNuevasHabitaciones(capacidad,identificador,tipo,ubicacion,extras, caracteristicas);
						
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
                            System.out.println("Ingrese el nombre del archivo");
							
							Scanner ar = new Scanner(System.in);
							String nombre = ar.nextLine();
							
							String nombreArchivo = nombre + ".txt";
							
							Path archivo = Paths.get("src/Data/"+nombreArchivo).toAbsolutePath();
							
							String nArchivo = archivo.toString();
							
							CatalogoRegistro cat = new CatalogoRegistro();
							cat.cargarTarifas(nArchivo);
							
							
							
							
						} else if (opcion2 == 2) {
							
							System.out.println("ingrese el valor de la tarifa");
							Scanner cap = new Scanner(System.in);
							int valor = cap.nextInt();
							System.out.println("ingrese la fecha inical de la tarifa en formato dia/mes/año");
							Scanner id = new Scanner(System.in);
							String fecha_inicio = id.nextLine();
							System.out.println("ingrese la fecha final de la tarifa en formato dia/mes/año");
							Scanner ti = new Scanner(System.in);
							String fecha_fin = ti.nextLine();
							System.out.println("ingrese los dias que seran validos escribiendo su iniciales ");
							System.out.println("ejemplo, si vale para los dias Martes, Jueves y Viernes. Escribir MJV");
							System.out.println("La inicial del miercoles es la I ");
							Scanner ub = new Scanner(System.in);
							String dias = ub.nextLine();
							System.out.println("ingrese el tipo de habitacion ");
							Scanner ex = new Scanner(System.in);
							String tipo = ex.nextLine();
							
							CatalogoRegistro cat = new CatalogoRegistro();
							cat.crearTarifas(valor,fecha_inicio,fecha_fin,dias,tipo);
							
							
						
						} else if (opcion2 == 3) {
							System.out.println("ingrese la fecha inicio de la tarifa a cambair");
							Scanner id = new Scanner(System.in);
							String fecha_inicio = id.nextLine();
							System.out.println("ingrese la fecha fin de la tarifa a cambiar");
							Scanner ti = new Scanner(System.in);
							String fecha_fin = ti.nextLine();
							System.out.println("ingrese el tipo de habitacion de la tarifa a cambiar");
							Scanner ex = new Scanner(System.in);
							String tipo = ex.nextLine();
							
							System.out.println("ingrese los dias en que la tarifa a cambiar es valida");
							System.out.println("ejemplo, si vale para los dias Martes, Jueves y Viernes. Escribir MJV");
							System.out.println("La inicial del miercoles es la I ");
							Scanner ub = new Scanner(System.in);
							String dias = ub.nextLine();
							System.out.println("Ingrese el nuevo valor de la tarifa");
							Scanner cap = new Scanner(System.in);
							int valor = cap.nextInt();
							
							
							CatalogoRegistro cat = new CatalogoRegistro();
							cat.cambiarTarifas(valor,fecha_inicio,fecha_fin,dias,tipo);
							
							
							
						
							
						
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
System.out.println("Ingrese el nombre del archivo");
							
							Scanner ar = new Scanner(System.in);
							String nombre = ar.nextLine();
							
							String nombreArchivo = nombre + ".txt";
							
							Path archivo = Paths.get("src/Data/"+nombreArchivo).toAbsolutePath();
							
							String nArchivo = archivo.toString();
							
							CatalogoRegistro cat = new CatalogoRegistro();
							cat.cargarMenuRestaurante(nArchivo);
							
							
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
							
							System.out.println("ingrese a nombre de quien queda la reserva");
							Scanner id = new Scanner(System.in);
							String nombre = id.nextLine();
							System.out.println("ingrese la cedula del cliente");
							Scanner ced = new Scanner(System.in);
							int cedula = ced.nextInt();
							System.out.println("ingrese el correo electrónico del cliente");
							Scanner cor = new Scanner(System.in);
							String correo = cor.nextLine();
							System.out.println("ingrese la fecha inicio de la reserva");
							Scanner fi = new Scanner(System.in);
							String fecha_inicio = fi.nextLine();
							System.out.println("ingrese la final de la reserva");
							Scanner ff = new Scanner(System.in);
							String fecha_final = id.nextLine();
							System.out.println("ingrese el numero de personas de la reserva");
							Scanner np = new Scanner(System.in);
							int numero_personas = np.nextInt();
							System.out.println("Seleccione el tipo de habitacion");
							Scanner ti = new Scanner(System.in);
							String tipo_habitacion = ti.nextLine();
							CatalogoRegistro cat = new CatalogoRegistro();
							List<Habitacion> habitaciones_objetivo = cat.filtrarHabitacionesporCapacidadyTipo(tipo_habitacion, numero_personas);
							habitaciones_objetivo.forEach(h ->{
								System.out.println("Id: " + h.getIdentificador() + ", Extras: " + h.getExtras() + ", Reservas:");
								System.out.println(h.getReservas().stream().collect(Collectors.joining("\n", "'", "'")));
							});
							//Falta poner Proceso de impresion para elegir la habitacion a reservar
							Scanner op = new Scanner(System.in);
							int eleccion = op.nextInt();
							Habitacion habitacion_reserva = habitaciones_objetivo.get(eleccion);
							cat.crearReserva(habitacion_reserva,fecha_inicio,fecha_final,nombre,cedula,correo,numero_personas);
							
							
							
							
							
						} else if (opcion3 == 2) {
							
							Reservas.aplazarReserva();
							
						} else if (opcion3 == 3) {
							
							System.out.println("Ingrese el codigo de la reserva a cancelar");
							Scanner cod = new Scanner(System.in);
							int codigoReserva = cod.nextInt();
							CatalogoRegistro cat = new CatalogoRegistro();
							cat.buscarReserva(codigoReserva);
							System.out.println("¿Desea eliminar la reserva? 1.si 2.no");
							Scanner in = new Scanner(System.in);
							int eleccion = in.nextInt();
							if (eleccion == 1){
								
							}
							
							
							
							
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
