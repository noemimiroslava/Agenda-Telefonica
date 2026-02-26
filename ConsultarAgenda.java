import java.util.ArrayList;

public class ConsultarAgenda {
	
	private ArrayList<Contacto> contactos;
	private int capacidadMax;
	
	public ConsultarAgenda(ArrayList<Contacto> contactos, int capacidadMax) {
		this.contactos = contactos;
		this.capacidadMax = capacidadMax;
	}//constructor ConsultarAgenda
	
	public boolean existeContactoPorNombre(String nombre) {
		for (Contacto c : contactos) {
	        if (c.getNombre().equals(nombre.trim().toLowerCase())) {
	            return true;
	        }//if
	    }//or

	    return false;
	}//existecontacto
	
	
	public void listarContactos() {
		if(contactos.isEmpty()) {
			System.out.println("La lista esta vacía");
		} else {
			for(Contacto c: contactos) {
				System.out.println(c);
			}//for
		}//if-else
	}//metodo listarContactos
	
	
	public void buscaContacto(String nombre) {

	    for (Contacto c : contactos) {
	        if (c.getNombre().equals(nombre)) {
	            System.out.println("Contacto encontrado:");
	            System.out.println("Nombre: " + c.getNombre());
	            System.out.println("Teléfono: " + c.getTelefono());
	            return;
	        }//if
	    }//for

	    System.out.println("Contacto no encontrado.");
	}//metodo buscarContacto
	
	
	public int espacioLibres() {
		return capacidadMax - contactos.size();
	}//metodo espacioLibres

}//ConsultarAgenda
