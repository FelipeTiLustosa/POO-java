package entities;

public class Student {
/*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano 
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no 
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam 
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
resolver este problema.*/
	
	public String name;
	public double n1;
	public double n2;
	public double n3;
	public double somaNotas;
	
	
	public void finalGrande(double n1, double n2, double n3) {
		this.somaNotas=n1+n2+n3;
		System.out.println("FINAL GRADE = "+somaNotas);
		}
	
	public void aprovadoOuNão() {
		if(somaNotas<60.0) {
			System.out.println("FAILED");
			double falta=somaNotas-60.0;
			System.out.printf("MISSING %.2f POINTS",falta);
			
		}else System.out.println("PASS");
	}
	}

