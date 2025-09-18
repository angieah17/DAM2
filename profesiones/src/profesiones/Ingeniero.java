package profesiones;

public class Ingeniero extends Profesion{

	
	public Ingeniero(String nombre, int anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	
	
	
	
	
	@Override
	public void trabajar() {		
		
		System.out.printf("%nEl ingeniero %s está diseñando un proyecto de especialidad %s.", getNombre(), getEspecialidad());
		
	}

	
	
	
	
}
