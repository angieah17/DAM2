package sgmovil;

public class Archivo {
	
	private String name;
	private String extension;
	private int sizeMb;
	private TipoArchivo tipoArchivo;
	
	
	public Archivo(String name, String extension, int sizeMb, TipoArchivo tipoArchivo) {
		this.name = name;
		this.extension = extension;
		this.sizeMb = sizeMb;
		this.tipoArchivo = tipoArchivo;
	}


	public int getSizeMb() {
		return sizeMb;
	}
	
	
	
	
	
	
	
}
