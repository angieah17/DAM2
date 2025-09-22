package sgmovil;

public class Run {

	
	public static void main(String[] args) {
		
		
		TelefonoMovil t1 = new TelefonoMovil(1_000, 600, 200, 5, 20);
		
		t1.guardarArchivo(new Archivo("DSAFA", "pdf", 2, TipoArchivo.PDF));
		
		System.out.println(t1);
		
		
		
	}
	
	
}
