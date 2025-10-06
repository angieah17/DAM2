package cuentas;

public class CuentaAtras {
	
	private int valorInicial;
	private String nombre;
	final static int milis = 300;
	
	
	public CuentaAtras(int valorInicial, String nombre) {
		this.valorInicial = valorInicial;
		this.nombre = nombre;
	}
	
	
	public void arranca() {      
		for (int i =valorInicial; i >= 0 ; i--) {
			System.out.printf("%s: %d%n", nombre, i);
			
			for (int j = 0; j < 1_000_000_000; j++) {
				i++;
				i--;
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		
		CuentaAtras c1 = new CuentaAtras(10, "C-1");
		
		c1.arranca();
		
		
		
		
	}
	
	
	
	
	
}
