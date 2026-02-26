import java.util.ArrayList;

public class ModificarAgenda {
	
	private ArrayList<Contacto> contactos; 
	private int capacidadMax;
	
	public ModificarAgenda(ArrayList<Contacto> contactos, int capacidadMax) {
		this.contactos = contactos;
		this.capacidadMax = capacidadMax;
	}//constructor
	
    public void añadirContacto(Contacto c) {

        if (agendaLlena()) {
            System.out.println("La agenda está llena. No se pueden añadir más contactos.");
            return;
        }//if

        
        if (contactos.contains(c)) {
            System.out.println("El contacto ya existe.");
            return;
        }//if

        contactos.add(c);
        System.out.println("Contacto añadido correctamente.");
    }//añadirContacto
         

    public void eliminarContactoPorNombre(String nombre) {
        Contacto temp = new Contacto(nombre, "0000000000");

        if (contactos.remove(temp)) {
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("El contacto no existe en la agenda.");
        }
    }//eliminarContacto

    public boolean agendaLlena() {
        return contactos.size() >= capacidadMax;
    }//agendaLlena

    public int espaciosLibres() {
        return capacidadMax - contactos.size();
    }//espaciosLibres
}