package clases;

public class Persona {
	private int dni;
	private String nombre;
	private int edad;
	private int sueldo;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(int dni, String nombre, int edad, int sueldo) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

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
		this.edad = edad;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isMayo18() {
		if (this.edad >= 18) {
			return true;
		} else
			return false;
	}

	public boolean isSalarioAlto() {

		if (this.sueldo >= 500) {

			return true;
		} else
			return false;
	}

}
