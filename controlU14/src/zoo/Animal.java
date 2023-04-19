package zoo;

public abstract class Animal {

	private String nombre;
	private int edad;
	private String especie;
	
	public Animal (String nombre, int edad, String especie) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
		
	}

	public String getNombre() {
		
		return nombre;
		
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + "]";
	}
	
	
	
}
