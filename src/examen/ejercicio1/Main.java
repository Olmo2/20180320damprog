package examen.ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Empleados e1 = new Empleados();
		EmpresasDeServicios s1 = new EmpresasDeServicios();
		
		e1.setNombre("Paco");
		e1.setApellidos("Martinez");
		s1.setNombre("Lacera");
		int respuesta = 0;
		int cuenta =0;
		do{
			System.out.println("Introduce tipo de entidad (Emplado(0) o Emepresa (1)): ");
		respuesta = teclado.nextInt();
		
		
			if(respuesta == 1) {
		
			System.out.println("Introduce numero de cuenta: " );
			cuenta = teclado.nextInt();
			s1.setNum_cuenta(cuenta);
			System.out.println("Pago realizado a: " + s1.getNombre());
		}else if(respuesta == 0) {
			
			System.out.println("Introduce numero de cuenta: " );
			cuenta = teclado.nextInt();
			e1.setNum_cuenta(cuenta);
			System.out.println("Pago realizado a: " + e1.getNombre()+ " " +e1.getApellidos());
		}else {
			System.out.println("Respuesta no válida");

		}
		}while(respuesta !=0 && respuesta !=1);
	}

}
