import java.util.Arrays;
import java.util.Scanner;

public class Funciones {

	// Funcion para sumar dos valores
	public static int sumar(int a, int b) {
		int resultado = a +b;
		return resultado;
	}
	
	public static void imprimirAsteriscos() {
		System.out.println("*************************");
	}
	
	public static void salidaBonitaSuma(int a, int b) {
		System.out.println("La suma de los valores " +a + " y "+b+" es: " + sumar(5,4));
	}
	
	// static tambien nos permite declarar variables por fuera del main que se puede acceder
	//  en cualquier lugar dentro de la clase 
	static int[] numeros = {8, 78, 2, 3, 4, 4, -99999999, 9, 9999};
	
	
	//Arrays.toString(nombreDelArray)
	public static String numeroMayor(int[] entrada) {
		System.out.println("Para el arreglo de entrada: " + Arrays.toString(entrada));
		int maximo = entrada[0];
		for(int i = 1; i < entrada.length ; i++) {
			//System.out.println(entrada[i]);
			if(entrada[i]>maximo) {
				maximo = entrada[i];
			}
		}
		return "El numero mas grande es: " + maximo;
	}
	
	
	/*
	 Mostrar mensaje para explicar el programa al usuario
	 Scanner para entrada
	 Acumulador de suma inicializado en cero
	 Ciclo while que compare numero ingresado != 0 
	 
	 Sumar entrada al
	 
	 */
	
	public static void acumuladorDeEntradas() {
		System.out.println("Este programa toma los valores ingresados por el usuario y los suma, en caso de ingresar '0' el programa se termina");
		// Se crea el scanner
		Scanner numerosEntrada = new Scanner(System.in);
		
		// Se incializa la variable donde se ira sumando cada entrada
		int acumulador = 0;
		
		System.out.println("Ingrese un valor entero para iniciar el programa");
		// Se guarda la entrada del scanner en la variable entrada
		int entrada = numerosEntrada.nextInt();
		
		// Mientras que la entrada sea diferente de 0, se correra el ciclo
		while(entrada!=0) {
			acumulador += entrada;
			System.out.println("Acumulado: " + acumulador + "\nIngrese un nuevo valor o ingrese '0' para terminar el programa.");
			entrada = numerosEntrada.nextInt();
		}// Fin del while
		
		System.out.println("Acumulado final: " + acumulador);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		//imprimirAsteriscos();
		
		//salidaBonitaSuma(4, 5);

		//imprimirAsteriscos();
		
		
		/*
		  
		  	Funciones:
		  	Van por fuera del metodo principal
		  	El metodo principal es una funcion
		  	
		  	Tenemos dos tipos de funciones:
		  		- Funciones que devuelven un valor: se debe especificar el tipo de dato que vamos
		  			a usar, utilizar una clausula "return" para devolver el valor, y los parametros
		  			deben coincidir con el tipo de dato especificado
		  		- Funciones que NO devuelven nada (void): No necesitamos especficar nada, y no
		  			utilizamos la clausula "return"
		 
		 */
		
		// Funcion que toma un arreglo y nos devuelve el numero mas grande
		
		int[] numeros = {8, 78, 2, 3, 4, 4, -99999999, 9, 9999};
		//System.out.println(numeroMayor(numeros));
		
		imprimirAsteriscos();
		
		acumuladorDeEntradas();
		

	
		
	}//Fin del main

}

