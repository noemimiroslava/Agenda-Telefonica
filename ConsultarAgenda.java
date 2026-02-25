import java.util.ArrayList;

public class ConsultarAgenda {
	
	private static ArrayList<Contacto> contactos;
	private int capacidadMax;
	
	public ConsultarAgenda(ArrayList<Contacto> contactos, int capacidadMax) {
		this.contactos = contactos;
		this.capacidadMax = capacidadMax;
	}//constructor ConsultarAgenda
	
	public boolean existeContacto(Contacto c) {
		return contactos.contains(c);
	}//metodo existeContacto
	
	
	public static void listarContactos() {
		if(contactos.isEmpty()) {
			System.out.println("La lista esta vacía");
		} else {
			for(Contacto c: contactos) System.out.println(c);
		}//if-else
	}//metodo listarContactos
	
	
	public void buscaContacto (String nombre) {
		for(Contacto c : contactos) {
			if( c.getNombre().equalsIgnoreCase(nombre) ) {
				System.out.println("Encontrado...su número de teléfono es: " + c.getTelefono());
			}else {
				System.out.println("No se encontro contacto");
			}//if-else
		}//for
	}//metodo buscaContacto
	
	
	public int espacioLibres() {
		return capacidadMax - contactos.size();
	}//metodo espacioLibres

}//ConsultarAgenda
