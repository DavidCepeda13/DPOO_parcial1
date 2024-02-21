package modelo;

public class Mujer extends Persona{
	//Constructor
	public Mujer(double peso, int altura, int edad) {
		super(peso, altura, edad);
	}

	
//< Metodos >====================================================x>
	@Override
	public double calcularTMB() {
		double TBM = 447.593 + (9.247 * super.peso) + (3.098 * super.altura) - (4.33 * super.edad);
		return TBM;
	}
//<x=============================================================x>
	
}
