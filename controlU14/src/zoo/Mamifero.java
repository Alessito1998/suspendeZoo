package zoo;

public class Mamifero extends Animal {

	private Desplazamiento desplazamiento;
	
	public Mamifero (String nombre, int edad, String especie, Desplazamiento desplazamiento) {
		
		super(nombre, edad, especie);
		
		this.desplazamiento = desplazamiento;
		
	}

	public Desplazamiento getDesplazamiento() {
		
		return desplazamiento;
		
	}

	public void setDesplazamiento(Desplazamiento desplazamiento) {
		
		this.desplazamiento = desplazamiento;
		
	}

	@Override
	public String toString() {
		return super.toString() + "Mamifero [" + "desplazamiento=" + desplazamiento + "]";
	}
	
}
