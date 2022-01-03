package entities;

public class Student {
	public String Nome;
	public double NotaPrimeiroTrimestre;
	public double NotaSegundoTrimestre;
	public double NotaTerceiroTrimestre;
	
	public double NotaFinal() {
		return NotaPrimeiroTrimestre + NotaSegundoTrimestre + NotaTerceiroTrimestre;
	}
	
	public String toString() {
		double notaFinal = NotaFinal();
		if (notaFinal >= 60.00) {
			return "FINAL GRADE = " + String.format("%.2f", notaFinal) + "\n PASS";
		} else {
			double pontosFaltantes = 60 - notaFinal;
			return "FINAL GRADE = " + String.format("%.2f", notaFinal) + "\n FAILED \n MISSING " + String.format("%.2f", pontosFaltantes) + " POINTS";
		}
	}

}
