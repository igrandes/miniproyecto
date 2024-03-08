package controlador;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		System.out.println("ingrese el valor de x :");
		int x= s.nextInt();
		System.out.println("ingrese el valor de y :");
		int y= s.nextInt();
		System.out.println("ingrese el valor de z :");
		int z= s.nextInt();
		int suma = x + y + z;

		System.out.println("La suma total es: " + suma);
	}

}
