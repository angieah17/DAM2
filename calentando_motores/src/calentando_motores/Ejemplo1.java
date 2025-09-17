package calentando_motores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejemplo1 {
	
	public static void main(String[] args) {
		
		//Contar del 1 al 10 separado por guiones y que el último no esté
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print(i);
			System.out.print(i != 10 ? "-" : "" );
		}
		
		System.out.println();
		
		//Bucle para obtener de igual forma los números que suman 100 sin pararse
		
		int suma = 0;
		
		 
			for (int i = 1; suma <= 100; i++) {
				System.out.print(i);
				suma += i;
				System.out.print( suma <= 100 ? "-" : "" );
				
			}
		
			System.out.println();
			
		/*Bucle para mostrar de igual forma las notas musicales
		 * usando un array con las notas musicales*/
			
		String [] notasMusicales = {"do", "re", "mi", "fa", "sol", "la", "si"};
			
		for (int i = 0; i < notasMusicales.length; i++) {
			System.out.print(notasMusicales[i]);
			System.out.print( i == notasMusicales.length - 1 ? "" : "-" );
						
		}
		
		System.out.println();
		
		//El mismo que el anterior en List
		
		
		List<String> notas = Arrays.asList("do", "re", "mi", "fa", "sol", "la", "si");
		
		/*List<String> notas = new ArrayList<String>();
		
		notas.add("do");
		notas.add("re");
		notas.add("mi");
		notas.add("fa");
		notas.add("sol");
		notas.add("la");
		notas.add("si");
		
		*/
		
		
		for (int i = 0; i < notas.size(); i++) {
			System.out.print(notas.get(i));
			System.out.print( i == notas.size() - 1 ? "" : "-" );
						
		}
		
		System.out.println();
		
		//Con ArrayList
		
		List<String> notasAL = new ArrayList<>();
		
		/*notasAL.add("do");
		notasAL.add("re");
		notasAL.add("mi");
		notasAL.add("fa");
		notasAL.add("sol");
		notasAL.add("la");
		notasAL.add("si");*/
		
		
		for (String nota : notasMusicales) {
			notasAL.add(nota);
		}
		
		for (int i = 0; i < notasAL.size(); i++) {
			System.out.print(notasAL.get(i));
			System.out.print( i == notasAL.size() - 1 ? "" : "-" );
						
		}
		
		
		
		
		
	}
	
}
