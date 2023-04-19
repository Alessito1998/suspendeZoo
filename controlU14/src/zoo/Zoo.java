package zoo;

import java.util.ArrayList;

public class Zoo {

	private ArrayList<Habitat> habitats = new ArrayList<>();

	public Zoo(ArrayList<Habitat> habitats) {
	
		this.habitats = habitats;
		
	}

	public ArrayList<Habitat> getHabitats() {
		
		return habitats;
		
	}

	public void setHabitats(ArrayList<Habitat> habitats) {
		
		this.habitats = habitats;
		
	}
	
	public void crearHabitat(String nombre, Animal animal) {
		
		Habitat nuevoHabitat = new Habitat(nombre);
		
		this.habitats.add(nuevoHabitat);
		
	}
	
	//NO ME ACUERDO CÓMO SE HACÍA EL OVERRIDE DEL CONTAINS ASÍ QUE TE LO HAGO ASÍ
	
	public void eliminaHabitat(String nombre) {
		
		for (int n = 0; n < this.habitats.size(); n++) {
			
			if (this.habitats.get(n).getNombre().equals(nombre)) {
				
				this.habitats.remove(this.habitats.get(n));
				
			}
			
		}
		
	}
	
	public void agregaAnimal(Habitat habitat, Animal animal) {
		
		habitat.setAnimales(animal);
		
	}
	
	public void quitaAnimal(Habitat habitat, String nombre) {
		
		for (int n = 0; n < habitat.getAnimales().size(); n++) {
			
			if (habitat.getAnimales().get(n).getNombre().equals(nombre)) {
				
				habitat.getAnimales().remove(habitat.getAnimales().get(n));
				
			}
			
		}
		
	}

	@Override
	public String toString() {
		return "Zoo [habitats=" + habitats + "]";
	}
	
}
