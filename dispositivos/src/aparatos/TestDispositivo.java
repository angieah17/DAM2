package aparatos;

public class TestDispositivo {
	
	public static void main(String[] args) {
		
		Dispositivo [] dispositivos = {
				new Dispositivo("RELOJ01", 10_000),
				new Dispositivo("TABLETX", 15_000),
				new Dispositivo("LAPTOP-PRO", 8_000),
				new Dispositivo("GENÉRICO", 12_000)
		};
		
		
		for (Dispositivo dispositivo : dispositivos) {
			System.out.println(dispositivo);
		}
		
		
		for (int i = 0; i < dispositivos.length; i++) {
			
			System.out.println(dispositivos[i].encender());
		}
		
		for (Dispositivo dispositivo : dispositivos) {
			dispositivo.registrarUso(1_0000);
		}
		
		
		for (Dispositivo dispositivo : dispositivos) {
			System.out.println(dispositivo.requiereMantenimiento());
			
		}
		
		for (Dispositivo dispositivo : dispositivos) {
			dispositivo.apagarr();
		}
		
		for (Dispositivo dispositivo : dispositivos) {
		
			if(dispositivo.reiniciarUso()) {
				System.out.println(dispositivo);
			}
			
			
		}
		
		
		
	}
	
	
}
