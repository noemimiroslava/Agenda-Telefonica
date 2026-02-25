import java.util.ArrayList;

public class ModificarAgenda {
	
	private ArrayList<Contacto> contactos; 
	private int capacidadMax;
	
	public ModificarAgenda(ArrayList<Contacto> contactos, int capacidadMax) {
		super();
		this.contactos = contactos;
		this.capacidadMax = capacidadMax;
	}//constructor
	
    public void añadirContacto(Contacto c) {

        if (agendaLlena()) {
            System.out.println("La agenda está llena. No se pueden añadir más contactos.");
            return;
        }//añadirContacto

        
        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(c.getNombre())) {
                System.out.println("El contacto ya existe. No se pueden duplicar nombres.");
                return;
            }//validación contacto no existe
        }

        contactos.add(c);
        System.out.println("Contacto añadido correctamente.");
    }//añadir contacto

    public void eliminarContacto(Contacto c) {

        for (Contacto contacto : contactos) {
            if (contacto.getNombre().equalsIgnoreCase(c.getNombre())) {
                contactos.remove(contacto);
                System.out.println("Contacto eliminado correctamente.");
                return;
            }//if
        }//for

        System.out.println("El contacto no existe en la agenda.");
    }//eliminarContacto

    public boolean agendaLlena() {
        return contactos.size() >= capacidadMax;
    }//agendaLlena

    public int espaciosLibres() {
        return capacidadMax - contactos.size();
    }//espaciosLibres
}