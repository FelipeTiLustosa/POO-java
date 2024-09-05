package entities;

public class Employee {
/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em 
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o 
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe 
projetada abaixo.
Exemplo:
Name: Joao Silva
Gross salary: 6000.00
Tax: 1000.00

Employee: Joao Silva, $ 5000.00

Which percentage to increase salary? 10.0

Updated data: Joao Silva, $ 5600.00
*/
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary-tax;
	}
	public void increaseSalary(double porcentagem) {
		this.grossSalary+=grossSalary*porcentagem /100.0;
	}
	public String toString() {
		return name+", $ "+String.format("%.2f",netSalary());
	}
}
