package UsandoGuettersySetters;

public class Termometro6 {

	    private double celsius;

	    public double getCelsius() {
	        return celsius;
	    }

	    public void setCelsius(double temperatura) {
	        if (temperatura >= -273.15) {
	            this.celsius = temperatura;
	        } else {
	            System.out.println("La temperatura no puede ser menor a -273.15.");
	        }
	    }

	    public double getFahrenheit() {
	        return (celsius * 9 / 5) + 32;
	    }
	}