package aparatos;

public class Dispositivo {
	
	String modelo;
	int horasDeUso;
	boolean encendido;
	int limiteHorasUso;
		
	
	
	public Dispositivo() {
		this("GENÉRICO", 10_000);
	}

	
	private static boolean modeloValido (String modelo) {
		
		
		if (modelo.length() > 15) return false;
		
		for (char c : modelo.toCharArray()) {
			
			if(!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9')) {
				return false;
			}
			
		}
		
		return true;
		
	}


	public Dispositivo(String modelo, int limiteHorasUso) {
		this.modelo = modeloValido(modelo) ? modelo : "GENÉRICO";
		this.limiteHorasUso = limiteHorasUso < 1_000 ? 1_000 : limiteHorasUso;
	}
	
	
	
	public Dispositivo(Dispositivo c) {
		modelo = c.modelo;
		horasDeUso = c.horasDeUso;
		encendido = c.encendido;
		limiteHorasUso = c.limiteHorasUso;
	}
	
	
	@Override
	public String toString() {
		
		return String.format("Dispositivo con las siguientes características:%nModelo: %s%nHoras de Uso: %d%n"
				+ "Encendido: %b%nLimite de Horas de Uso: %d%n", modelo, horasDeUso, encendido, limiteHorasUso);
		
		
	}
	
	
	//MÉTODOS
	
	public boolean encender() {
		
		if(!encendido) {
			encendido = true;
			return true;
		}
			
		return false;
		
	}
	
	
	public boolean apagarr() {
		
		if(encendido) {
			encendido = false;
			return true;
		}
			
		return false;
		
	}
	
	public boolean registrarUso(int horas) {
			
		if(!encendido) return false;
		
		if(horas <= 0) {
			System.out.println("No puedes registrar horas de uso en cero o negativas");
			return false;
		}
		
		
		if(horasDeUso + horas <= limiteHorasUso) {
			
			horasDeUso = horasDeUso + horas;
			
			return true;
		}
		
		horasDeUso = limiteHorasUso;
		
		return false;
	}
	
	
	public boolean requiereMantenimiento() {
		
		double porcentaje = limiteHorasUso * 0.8;
		
		if(horasDeUso >= porcentaje) return true;
		
		return false;
	}
	
	public boolean reiniciarUso() {
		
		if (!encendido && horasDeUso == limiteHorasUso) {
			horasDeUso = 0;
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		
		Dispositivo d = new Dispositivo();
		
		System.out.println(d);
		
		System.out.println(new Dispositivo("aSis6a", 20));
		
		System.out.println(d.encender());
		
		
		System.out.println(d);
		System.out.println(d.encender());
		
		System.out.println(d);
		
		System.out.println("PROBANDO REGISTRAR USO");
		
		
		System.out.println(d.registrarUso(-10));
		
		System.out.println(d);
		

		System.out.println(d.registrarUso(10_000));
		
		System.out.println(d);
		
		System.out.println("PROBANDO REINICIAR USO");
		
		d.apagarr();
		System.out.println(d.reiniciarUso());
		
		System.out.println(d);
		
	}
	
	
	
	
	
}
