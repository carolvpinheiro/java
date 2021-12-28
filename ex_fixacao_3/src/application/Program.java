package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Preencha nome do aluno e suas notas: ");
		student.Nome = sc.nextLine();
		student.NotaPrimeiroTrimestre = sc.nextDouble();
		student.NotaSegundoTrimestre = sc.nextDouble();
		student.NotaTerceiroTrimestre = sc.nextDouble();
		
		student.NotaFinal();
		
		System.out.println(student);
		
		
		sc.close();
	}

}
