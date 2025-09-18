package profesiones;

public class Doctor extends Profesion{

	
	public Doctor(String nombre, int anioDeNacimiento, String especialidad) {
		super(nombre, anioDeNacimiento, especialidad);
	}

	
	public void recetarMedicamento(String medicamento) {
		System.out.printf("%nEl doctor %s ha recetado el medicamento %s.", getNombre(), medicamento);
	}
	
	
	
	
	@Override
	public void trabajar() {		
		
		System.out.printf("%nEl doctor %s está atendiendo pacientes de la especialidad %s.", getNombre(), getEspecialidad());
		
	}

	
	
	
	
}
