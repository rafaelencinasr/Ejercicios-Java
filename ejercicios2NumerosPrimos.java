package ciclos;

import java.util.Scanner;

public class Ejercicio2Repo {
	
	static void primeCheckerFor(int input) {
		//Por default la bandera que indica si un numero es primo se define como false
		boolean bandera = false;
		for(int i=2; i<input; i++) {
			// Se calcula el modulo entre el numero ingresado y todos los numeros desde el 2 hasta el numero ingresado
			// Si el modulo del numero ingresado y "u" es igual a cero, quiere decir que el numero ingresado es divisible entre "i"
			if(input%i==0) {
				// Se levanta la bandera como true en caso de encontrar un numero divisible
				bandera=true;
			}
		}
		//Al finalizar el ciclo se revisa el status de la bandera
		//Si la bandera alguna vez se cambio a true, quiere decir que no es un numero primo
		//Si la bandera se quedo como false, se entra a la condicion del if
		if(!bandera) {
			System.out.println(input + " si es un numero primo");
		} else {
			System.out.println(input + " no es un numero primo");
		}
	}

	static void primerCheckerWhile(int input) {
		int i=2;
		boolean bandera = false;
		while(i<input) {
			if(input%i==0) {
				bandera = true;
			}
			i++;
		}
		if(!bandera) {
			System.out.println(input + " si es un numero primo");
		} else {
			System.out.println(input + " no es un numero primo");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner para recibir el numero de entrada
		System.out.println("Introduzca el numero entero que quiere revisar si es primo o no");
		Scanner userInput = new Scanner(System.in);
		
		//Se almacena el numero ingresado
		int numeroDeEntrada = userInput.nextInt();
		
		//Se invocan ambas funciones
		primeCheckerFor(numeroDeEntrada);
		
		primerCheckerWhile(numeroDeEntrada);


	}

}
