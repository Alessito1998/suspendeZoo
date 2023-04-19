package zoo;

public class EmpleadoZoo implements Cuidador{

	private int numeroEmpleado;
	private String nombre;
	private String apellido;
	private String apellido2;
	private int salario;
	
	//TIENE DOS CONSTRUCTORES, UNO POR SI SOLO TIENE UN APELLIDO Y OTRO POR SI TIENE 2
	
	public EmpleadoZoo(int numeroEmpleado, String nombre, String apellido, String apellido2, int salario) {
	
		this.numeroEmpleado = numeroEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.apellido2 = apellido2;
		this.salario = salario;
		
	}

	public EmpleadoZoo(int numeroEmpleado, String nombre, String apellido, int salario) {
		super();
		this.numeroEmpleado = numeroEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}
	
	

	public int getNumeroEmpleado() {
		
		return numeroEmpleado;
		
	}

	public void setNumeroEmpleado(int numeroEmpleado) {
		
		this.numeroEmpleado = numeroEmpleado;
		
	}

	public String getNombre() {
		
		return nombre;
		
	}

	public void setNombre(String nombre) {
		
		this.nombre = nombre;
		
	}

	public String getApellido() {
		
		return apellido;
		
	}

	public void setApellido(String apellido) {
		
		this.apellido = apellido;
		
	}

	public String getApellido2() {
		
		return apellido2;
		
	}

	public void setApellido2(String apellido2) {
		
		this.apellido2 = apellido2;
		
	}

	public int getSalario() {
		
		return salario;
		
	}

	public void setSalario(int salario) {
		
		this.salario = salario;
		
	}

	@Override
	public double alimentar(double cantidad) {
		
		return 0;
	}

	@Override
	public String toString() {
		return "EmpleadoZoo [numeroEmpleado=" + numeroEmpleado + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", salario=" + salario + "]";
	}

}
