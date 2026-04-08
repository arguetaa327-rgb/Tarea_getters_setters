package UsandoGuettersySetters;

public class EstudianteyBeca5 {

	    private String carnet;
	    private String nombre;
	    private double promedio;

	    public String getCarnet() {
	        return carnet;
	    }

	    public void setCarnet(String carnet) {
	        this.carnet = carnet;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public double getPromedio() {
	        return promedio;
	    }

	    public void setPromedio(double promedio) {
	        if (promedio >= 0 && promedio <= 100) {
	            this.promedio = promedio;
	        } else {
	            System.out.println("El promedio debe estar entre 0 y 100.");
	        }
	    }

	    public boolean esBecado() {
	        return promedio >= 85;
	    }
	}