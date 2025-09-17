package telefono;

public class Movil {
	
	private boolean encendido;
	private int nivelBateria;
	private String modelo;
	private String marca; 
	private boolean modoBajoConsumo;
	
	
	
	public Movil(String modelo, String marca) {
		this.modelo = modelo; // si se puede limitar
		this.marca = marca;
		nivelBateria = 20;
	}
	
	/*public void encender() {
		
		encendido = encendido == false ? true : encendido;
				
	}
	
	public void apagar() {
		
		encendido = encendido == true ? false : encendido;
				
	}*/
	
	public void cambiarEstado() {
		encendido = !encendido; 
	}
	
	private boolean consumirBateria (int consumo) {
	
		if (!encendido || nivelBateria < consumo) return false;
		nivelBateria -= consumo;
		if(nivelBateria < 10) modoBajoConsumo = true;
		revisarSiBateriaBaja();
		
		return true;
		
	}
	
	private void revisarSiBateriaBaja() {
		if (nivelBateria <= 2) encendido = false;
	}
	
	
	public boolean llamar() {
		
		return consumirBateria(2);
	}
	
	public boolean navegar() {
		
		return consumirBateria(1);
	}
	
		
	
	
	
	public boolean estaEncendido() {
		return encendido;
	}
	
	public boolean estaEnBajoConsumo() {
		return modoBajoConsumo;
	}
	
	public void recargarBateria() {
		
		nivelBateria = nivelBateria + 25 <= 100 ? nivelBateria + 25 : 100; 
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return String.format("encendido:%b y bateria:%d", encendido, nivelBateria);
	}
	
	
	public static void main(String[] args) {
		
		Movil m = new Movil("adsfa", "fafda");
		
		m.cambiarEstado();
			
		System.out.println("INICAL" + m);
		for (int i = 0; i < 100; i++) {
			m.navegar();
			
		}
		
		System.out.println(m);
		
		/*for (int i = 0; i < 1000; i++) {
			m.recargarBateria();
		}
		
		System.out.println(m);*/
		
		
	}
	
	
}
