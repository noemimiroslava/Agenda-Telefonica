import java.util.ArrayList;

public class ConsultarAgenda {
	
	private ArrayList<Contacto> contactos;
	private int capacidadMax;
	
	public ConsultarAgenda(ArrayList<Contacto> contactos, int capacidadMax) {
		this.contactos = contactos;
		this.capacidadMax = capacidadMax;
	}
	
	// 🔹 Verificar existencia (ignorando mayúsculas y espacios)
	public boolean existeContactoPorNombre(String nombre) {
		
		String nombreNormalizado = nombre.trim().toLowerCase();
		
		for (Contacto c : contactos) {
			
	        String nombreGuardado = c.getNombre().trim().toLowerCase();
	        
	        if (nombreGuardado.equals(nombreNormalizado)) {
	            return true;
	        }
	    }

	    return false;
	}//existeContacto
	
	
	public void listarContactos() {
		if(contactos.isEmpty()) {
			System.out.println("La lista está vacía");
		} else {
			for(Contacto c: contactos) {
				System.out.println(c);
			}
		}
	}//listarContactos
	
	
	// 🔹 Buscar contacto con normalización correcta
	public void buscaContacto(String nombre) {

		String nombreNormalizado = nombre.trim().toLowerCase();

	    for (Contacto c : contactos) {
	    	
	    	String nombreGuardado = c.getNombre().trim().toLowerCase();
	    	
	        if (nombreGuardado.equals(nombreNormalizado)) {
	            System.out.println("Contacto encontrado:");
	            System.out.println("Nombre: " + c.getNombre());
	            System.out.println("Teléfono: " + c.getTelefono());
	            return;
	        }
	    }

	    System.out.println("Contacto no encontrado.");
	}//buscaContacto
	
	
	public int espacioLibres() {
		return capacidadMax - contactos.size();
	}//espaciosLibres

}//ConsultarAgenda
