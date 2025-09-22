package sgmovil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TelefonoMovil {
	
	private int memoMax;
	private int memoMaxAplicaciones;
	private int memoMaxArchivos;
	private int cantMaxAplicaciones;
	private int cantMaxArchivos;
	private List<Aplicacion> listaAplicaciones;
	private List<Archivo> listaArchivos;
	private Set<Aplicacion> registroAplicaciones;
	private Map<TipoAplicacion, Integer> cantidadAplicacionesPorTipo;
	private Map<TipoArchivo, Integer> cantidadArchivosPorTipo;
	private Map<TipoAplicacion, Integer> cantidadMemoriaPorTipoAplicacion;
	private Map<TipoArchivo, Integer> cantidadMemoriaPorTipoArchivo;
	
	
	
	
	
	public TelefonoMovil(int memoMax, int memoMaxAplicaciones, int memoMaxArchivos, int cantMaxAplicaciones,
			int cantMaxArchivos) {
		this.memoMax = memoMax;
		this.memoMaxAplicaciones = memoMaxAplicaciones;
		this.memoMaxArchivos = memoMaxArchivos;
		this.cantMaxAplicaciones = cantMaxAplicaciones;
		this.cantMaxArchivos = cantMaxArchivos;
		listaAplicaciones = new ArrayList<Aplicacion>();
		listaArchivos = new ArrayList<Archivo>();
		registroAplicaciones = new HashSet<Aplicacion>();
		cantidadAplicacionesPorTipo = new HashMap<TipoAplicacion, Integer>();
		cantidadArchivosPorTipo = new HashMap<TipoArchivo, Integer>();
		cantidadMemoriaPorTipoAplicacion = new HashMap<TipoAplicacion, Integer>();
		cantidadMemoriaPorTipoArchivo = new HashMap<TipoArchivo, Integer>();
			
	}


	


	@Override
	public String toString() {
		return "TelefonoMovil [memoMax=" + memoMax + ", memoMaxAplicaciones=" + memoMaxAplicaciones
				+ ", memoMaxArchivos=" + memoMaxArchivos + ", cantMaxAplicaciones=" + cantMaxAplicaciones
				+ ", cantMaxArchivos=" + cantMaxArchivos + ", listaAplicaciones=" + listaAplicaciones
				+ ", listaArchivos=" + listaArchivos + ", registroAplicaciones=" + registroAplicaciones
				+ ", cantidadAplicacionesPorTipo=" + cantidadAplicacionesPorTipo + ", cantidadArchivosPorTipo="
				+ cantidadArchivosPorTipo + ", cantidadMemoriaPorTipoAplicacion=" + cantidadMemoriaPorTipoAplicacion
				+ ", cantidadMemoriaPorTipoArchivo=" + cantidadMemoriaPorTipoArchivo + "]";
	}





	public void guardarArchivo(Archivo archivo) {
		
		if (!(memoMax <= memoMax + archivo.getSizeMb())) System.out.println("El archivo supera la memoria máxima del dispositivo.");
			
		if (!(memoMaxArchivos <= memoMaxArchivos + archivo.getSizeMb())) System.out.println("El archivo supera la memoria máxima de archivos permitidos.");	
	
		if (!(cantMaxArchivos <= listaArchivos.size() + 1)) System.out.println("El archivo supera la cantidad máxima de archivos permitidos.");	
		

			
			for (Archivo ar : listaArchivos) {
				
				if(ar.equals(archivo)) {
					System.out.println("Archivo ya existente.");
				} else {
					listaArchivos.add(archivo);
					memoMax += archivo.getSizeMb();
					memoMaxArchivos += archivo.getSizeMb();
				}
				
			}
			
		
		
	}
	
	
}
