import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        
		ArrayList<Contacto> miLista = new ArrayList<>();
        
		int capacidad = 10; //Capacidad de la agenda de 10 contactos

        // Creamos la Instanciación única
        ConsultarAgenda consulta = new ConsultarAgenda(miLista, capacidad);
        ModificarAgenda modifica = new ModificarAgenda(miLista, capacidad);

        int opcion;

        do {
            System.out.println("\n--- MENÚ AGENDA ---");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Listar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Eliminar contacto");
            System.out.println("5. Espacios libres");
            System.out.println("6. Existe Contacto");
            System.out.println("7. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Teléfono (10 dígitos): ");
                    String telefono = sc.nextLine();

                    try {
                        Contacto nuevo = new Contacto(nombre, telefono);
                        modifica.añadirContacto(nuevo);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                        System.out.println("Contacto no agregado");
                    }
                    break;

                case 2:
                	 extracted(consulta);
                     break;

                case 3:
                	System.out.print("Nombre a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    consulta.buscaContacto(nombreBuscar);
                    break;

                case 4:
                	System.out.print("Nombre a eliminar: ");
                    String nombreEliminar = sc.nextLine();
                    modifica.eliminarContactoPorNombre(nombreEliminar);
                    break;

                case 5:
                	 System.out.println("Espacios disponibles: " + modifica.espaciosLibres());
                     break;

                case 6:
                	 System.out.print("Nombre del contacto a verificar: ");
                     String nombreExiste = sc.nextLine();

                     Contacto existe = new Contacto(nombreExiste, "0000000000");
                     
                     if (consulta.existeContactoPorNombre(nombreExiste)) {
                         System.out.println("El contacto existe en la agenda.");
                     } else {
                         System.out.println("El contacto NO existe en la agenda.");
                     }
                     break;
                     
                case 7:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (opcion != 7);
		
		
		
	}

	private static void extracted(ConsultarAgenda consulta) {
		consulta.listarContactos();
	}

}
