package ejercicio1;

import java.io.File;

public class FileUtils {
	
	//Se comprueba archivos o directorios
	
	public static boolean analiza (File f) {
		
		if(f == null) {
			System.out.println("El archivo es nulo");
			return false;
		}
		
		
		if(!f.exists()) {
			System.out.println("NO EXISTO");
			return false;
		}
		
		System.out.printf("Permisos: r:%s, w:%s, x:%s%nParent: %s%nName: %s ",f.canRead(), f.canWrite(), 
				f.canExecute(),f.getParent(), f.getName() );
		
		double megabytes = (double) f.length() / (1024 * 1024);
		
		if(f.isFile()) System.out.printf("Tamaño:%.2fMB", megabytes);
		
		
		if(f.isDirectory()) {
			
		}
		
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		
		File f = new File("D:\\DAM2\\PROGRAMACION\\texto.txt");
		System.out.println(FileUtils.analiza(f));
		
		
		
		
	}
	
	
	
}
