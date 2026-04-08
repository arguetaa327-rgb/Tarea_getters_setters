package UsandoGuettersySetters;

public class CuentaConPin3 {

	    private String titular;
	    private double saldo;
	    private int pin;

	    public String getTitular() {
	        return titular;
	    }

	    public void setTitular(String titular) {
	        this.titular = titular;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(double saldo) {
	        if (saldo >= 0) {
	            this.saldo = saldo;
	        } else {
	            System.out.println("El saldo no puede ser negativo.");
	        }
	    }

	    public int getPin() {
	        return pin;
	    }

	    public void setPin(int pin) {
	        this.pin = pin;
	    }

	    public void retirar(double monto, int pinIngresado) {
	        if (pinIngresado == pin) {
	            if (monto > 0) {
	                if (monto <= saldo) {
	                    saldo = saldo - monto;
	                    System.out.println("Retiro exitoso. Saldo actual: " + saldo);
	                } else {
	                    System.out.println("Saldo insuficiente.");
	                }
	            } else {
	                System.out.println("El monto debe ser mayor a 0.");
	            }
	        } else {
	            System.out.println("PIN incorrecto.");
	        }
	    }
	}

