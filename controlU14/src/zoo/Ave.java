package zoo;

public class Ave extends Animal {

	private double longitudPico;
	private boolean rapaz;
	
	public Ave(String nombre, int edad, String especie, double longitudPico, boolean rapaz) {
		
		super(nombre, edad, especie);
		
		this.longitudPico = longitudPico;
		this.rapaz = rapaz;
		
	}

	public double getLongitudPico() {
		
		return longitudPico;
		
	}

	public void setLongitudPico(double longitudPico) {
		
		this.longitudPico = longitudPico;
		
	}

	public boolean isRapaz() {
		
		return rapaz;
	}
	

	public void setRapaz(boolean rapaz) {
		
		this.rapaz = rapaz;
		
	}

	@Override
	public String toString() {
		return super.toString() + "Ave [longitudPico=" + longitudPico + ", rapaz=" + rapaz + "]";
	}
	
}
