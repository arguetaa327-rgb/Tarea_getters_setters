package UsandoGuettersySetters;

public class PersonaEncapsulada1 {

	    private String nombre;
	    private int edad;
	    private String genero;

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        if (edad >= 0) {
	            this.edad = edad;
	        } else {
	            this.edad = 0;
	            System.out.println("La edad no puede ser negativa. Se asigno 0.");
	        }
	    }

	    public String getGenero() {
	        return genero;
	    }

	    public void setGenero(String genero) {
	        this.genero = genero;
	}

}
