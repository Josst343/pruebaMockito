package clases;

public class Prestamo {

	private Persona persona;
	private int capital;
	private Long id;
	private int cantCuotas;
	private int tasaInteres;
	
	
	
	public Prestamo() {
		// TODO Auto-generated constructor stub
	}
	

	public Prestamo( int capital, Long id, int cantCuotas, int tasaInteres) {
		super();
		this.capital = capital;
		this.id = id;
		this.cantCuotas = cantCuotas;
		this.tasaInteres = tasaInteres;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		if (persona.isMayo18()) {
			if (persona.isSalarioAlto()) {
				this.persona = persona;
			} else {
				throw new IllegalArgumentException("El sueldo no supera el minimo");
			}
		} else {

			throw new IllegalArgumentException("La persona debe ser mayor");
		}

	}

	public int getCapital() {
		return capital;
	}

	public void setCapital(int capital) {
		this.capital = capital;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCantCuotas() {
		return cantCuotas;
	}

	public void setCantCuotas(int cantCuotas) {
		this.cantCuotas = cantCuotas;
	}

	public int getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(int tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public int getMontoAPagar() {
		return (this.capital / this.tasaInteres) * 100 + this.capital;

	}

	public int getMontoCuota() {

		return this.getMontoAPagar() / this.cantCuotas;
	}

}
