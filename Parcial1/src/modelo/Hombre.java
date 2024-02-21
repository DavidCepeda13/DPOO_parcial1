package modelo;

public class Hombre extends Persona{
	//Constructor
	public Hombre(double peso, int altura, int edad) {
		super(peso, altura, edad);
	}

//< Metodos >====================================================x>
	@Override
	public double calcularTMB() {
		double TBM = 88.362 + (13.397 * super.peso) + (4.799 * super.altura) - (5.677 * super.edad);
		return TBM;
	}
//<x=============================================================x>
	
}
