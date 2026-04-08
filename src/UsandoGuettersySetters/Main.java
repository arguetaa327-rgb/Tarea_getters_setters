package UsandoGuettersySetters;

public class Main {


	    public static void main(String[] args) {

	        PersonaEncapsulada1 persona = new PersonaEncapsulada1();
	        persona.setNombre("Carlin");
	        persona.setEdad(-5);
	        persona.setGenero("Femenino");

	        System.out.println("Persona:");
	        System.out.println(persona.getNombre());
	        System.out.println(persona.getEdad());
	        System.out.println(persona.getGenero());

	        ProducConvalidacion2 producto = new ProducConvalidacion2();
	        producto.setCodigo("P001");
	        producto.setNombre("Libro");
	        producto.setPrecio(25.50);
	        producto.setStock(10);

	        System.out.println("\nProducto:");
	        System.out.println(producto.getNombre());
	        System.out.println(producto.getPrecio());
	        System.out.println(producto.getStock());

	        producto.vender(4);
	        producto.vender(8);

	        CuentaConPin3 cuenta = new CuentaConPin3();
	        cuenta.setTitular("Carlos");
	        cuenta.setSaldo(500);
	        cuenta.setPin(1234);

	        System.out.println("\nCuenta:");
	        System.out.println(cuenta.getTitular());
	        System.out.println(cuenta.getSaldo());

	        cuenta.retirar(300, 1234);
	        cuenta.retirar(70, 1111);

	        CursoyCalificaciones4 curso = new CursoyCalificaciones4();
	        curso.setNombreCurso("Programacion");
	        curso.setNota1(80);
	        curso.setNota2(70);
	        curso.setNota3(90);

	        System.out.println("\nCurso:");
	        System.out.println(curso.getNombreCurso());
	        System.out.println("Promedio: " + curso.promedio());
	        System.out.println("Estado: " + curso.estado());

	        EstudianteyBeca5 estudiante = new EstudianteyBeca5();
	        estudiante.setCarnet("2026001");
	        estudiante.setNombre("Ana");
	        estudiante.setPromedio(88);

	        System.out.println("\nEstudiante:");
	        System.out.println(estudiante.getNombre());
	        System.out.println("Promedio: " + estudiante.getPromedio());
	        System.out.println("Becado: " + estudiante.esBecado());

	        Termometro6 termometro = new Termometro6();
	        termometro.setCelsius(25);

	        System.out.println("\nTermometro:");
	        System.out.println("Celsius: " + termometro.getCelsius());
	        System.out.println("Fahrenheit: " + termometro.getFahrenheit());

	        RelojconFormato7 reloj = new RelojconFormato7();
	        reloj.setHora(9);
	        reloj.setMinuto(5);
	        reloj.setSegundo(7);

	        System.out.println("\nReloj:");
	        System.out.println(reloj.mostrarHora());

	        ContactoConTeléfono8 contacto = new ContactoConTeléfono8();
	        contacto.setNombre("Juana");
	        contacto.setTelefono("12345678");
	        contacto.setEmail("juana@gmail.com");

	        System.out.println("\nContacto:");
	        contacto.mostrarContacto();

	        JuegoConPuntajeMax9 jugador = new JuegoConPuntajeMax9();
	        jugador.setNombre("Luis");
	        jugador.actualizarPuntaje(50);
	        jugador.actualizarPuntaje(120);
	        jugador.actualizarPuntaje(80);

	        System.out.println("\nJugador:");
	        System.out.println(jugador.getNombre());
	        System.out.println(jugador.getPuntajeActual());
	        System.out.println(jugador.getPuntajeMaximo());

	        FacturaconTotal10 factura = new FacturaconTotal10();
	        factura.setCodigoFactura("F001");
	        factura.setDescripcion("Mouse");
	        factura.setCantidad(2);
	        factura.setPrecioUnitario(75.50);

	        System.out.println("\nFactura:");
	        factura.mostrarFactura();
	    }
	}