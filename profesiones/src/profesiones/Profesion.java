package profesiones;

public abstract class Profesion {
	
	private String nombre; 
	private int anioDeNacimiento; 
	private String especialidad; 
	
	
	
	
	public Profesion(String nombre, int anioDeNacimiento, String especialidad) {
		this.nombre = nombre;
		this.anioDeNacimiento = anioDeNacimiento > 1925 && anioDeNacimiento < 2007 ? anioDeNacimiento : 0 ;
		this.especialidad = especialidad;
	}


	public abstract void trabajar();
	
	
	public int calcularEdad() {
		
		int anioActual = 2025;
		
		return anioActual - anioDeNacimiento;
		
	}
	
	
	@Override
	public String toString() {
		return String.format("%nNombre:%s%nAño de Nacimiento:%d%nEspecialidad:%s%n", nombre, anioDeNacimiento, especialidad );
	}


	public String getNombre() {
		return nombre;
	}


	public String getEspecialidad() {
		return especialidad;
	}




	
	
	
	
	
}
