package examen.ejercicio1;

import java.util.Set;

public class EmpresasDeServicios {
	 // Atributos de la clase Empresas de servicios
	protected String nombre;
	protected Set<String> tipo;
	public int num_cuenta;
	
	   // Métodos de la clase  Empresas de servicios
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Set<String> getTipo() {
		return tipo;
	}
	public void setTipo(Set<String> tipo) {
		this.tipo = tipo;
	}
	public int getNum_cuenta() {
		return num_cuenta;
	}
	public void setNum_cuenta(int num_cuenta) {
		this.num_cuenta = num_cuenta;
	}
	
	
}
