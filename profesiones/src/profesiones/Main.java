package profesiones;

public class Main {
	
	
	public static void main(String[] args) {
		
		Profesion [] profesionales = {
				new Doctor("Pedro", 1900, "Ginecología"),
				new Doctor("Juan", 2026, "Medicina General"),
				new Doctor("María", 1995, "Radiología")
		};
		
		
		for (Profesion profesional : profesionales) {
			System.out.println(profesional);
			profesional.trabajar();
			if (profesional instanceof Doctor) {
				Doctor doctor = (Doctor) profesional;
				doctor.recetarMedicamento("Paracetamol");
				
			}
		}
		
		
		
	}
	
	
}
