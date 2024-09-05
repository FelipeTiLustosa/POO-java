package entities;

public class Rectangle {
//Exercicio 01
/*Fazer um programa para ler os valores da largura e altura 
de um retângulo. Em seguida, mostrar na tela o valor de 
sua área, perímetro e diagonal. Usar uma classe como 
mostrado no projeto ao lado.

Exemplo:
Enter rectangle width and height:
3.00
4.00
AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00
*/
	public double height;
	public double width;
	
	public double Area() {
		return height*width;
	}
	public double Perimeter() {
		return 2*(height+width);
	}
	public double Diagonal() {
		double h=Math.pow(height,2);
		double w=Math.pow(width,2);
		double soma=h+w;
		double diagonal=Math.sqrt(soma);
		return diagonal;
		
	}
	public String ToString() {
		return "AREA = "
				+ String.format("%.2f", Area())
				+"\nPERIMETER = "
				+ String.format("%.2f", Perimeter())
				+"\nDIAGONAL = "
				+ String.format("%.2f", Diagonal());
	}
}
