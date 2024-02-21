package modelo;

public abstract class Persona {
	//Atributos
	protected double peso;
	protected int altura;
	protected int edad;
	
	
	//Constructor
	public Persona(double peso, int altura, int edad) {
		this.peso = peso;
		this.altura = altura;
		this.edad = edad;
	}
	

//< Metodos >====================================================x>
	public abstract double calcularTMB();
//<x=============================================================x>
	
	
//< Getters >====================================================x>
	public double getPeso() {
		return peso;
	}

	public int getAltura() {
		return altura;
	}

	public int getEdad() {
		return edad;
	}
//<x=============================================================x>
}
