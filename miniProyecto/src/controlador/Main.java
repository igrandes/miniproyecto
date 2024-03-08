package controlador;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("ingrese un nuevo numero:");
		int y= s.nextInt();
		int x= 3;
		int suma = x + y;
		System.out.println("La suma de tu numero mas 3 es: " + suma);
	}

}
