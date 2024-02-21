package vista;

import modelo.Hombre;
import modelo.Mujer;
import modelo.Persona;

public class consola {

	public static void main(String[] args) {
		Persona sujeto;
		
		/*
		 * Dado que el programa se diseña con fines academicos y para unico uso del pacial he 
		 * decidido que la edad sea un atributo y no un servicio.
		 */
		
		System.out.println("< Calcular TBM >================================================================x>");
		sujeto = new Mujer(10, 60, 1);
		System.out.println("La mujer con las siguientes caracteristicas: \n - Peso: " + sujeto.getPeso() 
							+ "kg\n - Altura: " + sujeto.getAltura() + "cm\n - Edad: " + sujeto.getEdad()
							+ " años\nTiene una tasa metabolica basal (TMB) igual a " + sujeto.calcularTMB());
		
		System.out.println("\n<x==============================================================================x>\n");
		
		sujeto = new Hombre(10, 60, 1);
		System.out.println("El hombre con las siguientes caracteristicas: \n - Peso: " + sujeto.getPeso() 
							+ "kg\n - Altura: " + sujeto.getAltura() + "cm\n - Edad: " + sujeto.getEdad()
							+ " años\nTiene una tasa metabolica basal (TMB) igual a " + sujeto.calcularTMB());
		System.out.println("<x==============================================================================x>");
	}
}
