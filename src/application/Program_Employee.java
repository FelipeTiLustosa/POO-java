package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program_Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc=new Scanner(System.in);
		Employee employee=new Employee();
		System.out.print("Name: ");
		employee.name=sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary=sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax=sc.nextDouble();
		System.out.println("");
		System.out.println("Employee: "+employee.toString());
		System.out.println("");
		System.out.printf("Which percentage to increase salary? ");
		double porcento=sc.nextDouble();
		employee.increaseSalary(porcento);
		System.out.println("");
		System.out.println("Updated data: "+employee.toString());
		sc.close();
	}

}
