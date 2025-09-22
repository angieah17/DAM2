package sgmovil;

import java.util.Objects;

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


	@Override
	public int hashCode() {
		return Objects.hash(extension, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Archivo other = (Archivo) obj;
		return Objects.equals(extension, other.extension) && Objects.equals(name, other.name);
	}
	
	
	
	
	
	
	
}
