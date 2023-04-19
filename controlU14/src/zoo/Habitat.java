package zoo;

import java.util.ArrayList;

public class Habitat {

	private String nombre;
	private ArrayList <Animal> animales;
	
	public Habitat(String nombre) {
		
		this.nombre = nombre;
		this.animales = new ArrayList<>();
		
	}

	public String getNombre() {
		
		return nombre;
		
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}

	public ArrayList<Animal> getAnimales() {
		
		return animales;
		
	}

	public void setAnimales(Animal animal) {
		
		this.animales.add(animal);
		
	}
	
	@Override
	public String toString() {
		return "Habitat [nombre=" + nombre + ", animales=" + animales + "]";
	}

	
	
}
