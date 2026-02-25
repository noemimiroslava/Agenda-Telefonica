
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

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

                    System.out.print("Teléfono: ");
                    String telefono = sc.nextLine();

                    ModificarAgenda.añadirContacto();
                    break;

                case 2:
                    ConsultarAgenda.listarContactos();
                    break;

                case 3:
                    System.out.print("Nombre a buscar: ");
                    String buscar = sc.nextLine();
                    Contacto encontrado = ConsultarAgenda.buscaContacto(buscar);

                    if (encontrado != null)
                        System.out.println(encontrado);
                    else
                        System.out.println("No encontrado.");
                    break;

                case 4:
                    System.out.print("Nombre a eliminar: ");
                    String eliminar = sc.nextLine();
                    
                    ModificarAgenda.eliminarContacto(eliminar);
                    break;

                case 5:
                    System.out.println("Espacios libres: ");
                    ModificarAgenda.espacioLibres();
                    if (ModificarAgenda.espacioLibres() == 0) {
                    	ModificarAgenda.agendaLlena();
                    }
                    break;

                case 6:
                    System.out.println("¿Existe contacto?");
                    ConsultarAgenda.existeContacto();
                    break;
                    
                case 7:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (opcion != 7);
		
		
		
	}

}
