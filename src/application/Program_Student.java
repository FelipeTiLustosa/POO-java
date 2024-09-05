package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
		(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
		ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
		para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
		resolver este problema.*/
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		Student student=new Student();
		student.name=sc.nextLine();
		student.n1=sc.nextDouble();
		student.n2=sc.nextDouble();
		student.n3=sc.nextDouble();
		student.finalGrande(student.n1, student.n2, student.n3);
		student.aprovadoOuNão();
		sc.close();
	}

}
