
public class Contacto {

	private String nombre;
    private String telefono;

    // Constructor
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre.trim().toLowerCase();
        this.telefono = telefono;
        
        if (!telefono.matches("\\d{10}")) {
            throw new IllegalArgumentException("El teléfono debe contener exactamente 10 dígitos numéricos.");
        }//validación cantidad de números
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String toString() {
        return "Nombre: " + nombre + " | Teléfono: " + telefono;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Contacto other = (Contacto) obj;
        return nombre.equals(other.nombre);
    }

    @Override
    public int hashCode() {
        return nombre.hashCode();
    }
}
