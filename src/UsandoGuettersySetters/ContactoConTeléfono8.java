package UsandoGuettersySetters;

public class ContactoConTeléfono8 {

	    private String nombre;
	    private String telefono;
	    private String email;

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(String telefono) {
	        if (telefono != null && telefono.matches("\\d{8}")) {
	            this.telefono = telefono;
	        } else {
	            System.out.println("El telefono debe tener exactamente 8 digitos.");
	        }
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        if (email != null && email.contains("@")) {
	            this.email = email;
	        } else {
	            System.out.println("El email debe contener @.");
	        }
	    }

	    public void mostrarContacto() {
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Telefono: " + telefono);
	        System.out.println("Email: " + email);
	    }
	
}
