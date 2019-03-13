package examen.ejercicio4;

import java.util.*;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena = teclado.nextLine();
		
		List<String> caracteres= new LinkedList<String>();
		
		for (int i = 0 ; i<cadena.length();i++) {
			caracteres.add(i, Character.toString(cadena.charAt(i)));
			
		}
		
		System.out.println(caracteres);

		
		
	}

}
