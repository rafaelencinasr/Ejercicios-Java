package practica1;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Practica {
	
	// Mostrar resultados con sysout dentro de los metodos

	// 1. Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
    // Revisar si es un triángulo válido
    
    // 2. Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
    // Utilizar PI de la libreria de Java
    
    // 3. Escribir un metodo que muestre por consola la hora del sistema
    // Utilizar e investigar la libreria de Java

    // 4. Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
    // ej 3600 = "1 hora = 60 min = 3600 seg"
    
    // 5. Escribir un metodo para encontrar el volumen de una esfera dado el radio
    
    // 6. Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
    
    // 7. Encontrar el area superficial de un cubo dado un lado a

    // 8. Escribir un metodo para descubrir si un año ingresado es bisiesto o no
	
	// 9. Escribir y mostrar en pantalla los primeros 100 numeros primos
	
	// 10. Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos 
	
	// 11. Escribir un método para verificar si un numero positivo de 2 digitos es palindromo
	
	// 12. Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10
	
	// 13. Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
	
	// 14. Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops 
	
	// 15. Escribir un metodo para encontrar el factorial de un numero sin loops
	
	/*
	static void primerMetodo(int x) {
		// Instrucciones que realizamos comunmente en main tambien se pueden poner aqui
		
		System.out.println(x);
	}*/
	
	
	static void ejercicio1(double a, double b, double c) {
		// Buscar como comprobar que las 3 medidas del triangulo sean posibles
		// Para verificar si los 3 lados (a, b, c) dados pueden formar un triangulo se deben cumplir estas 3 condiciones
		// https://es.wikihow.com/saber-si-hay-un-tri%C3%A1ngulo-teniendo-las-medidas-de-tres-lados
		// 1. a + b > c
		// 2. a + c > b
		// 3. b + c > a
		// Si se cumple, podemos usar la formula de Heron para calcular el area: https://blogs.ua.es/matesfacil/secundaria-geometria/area-de-un-triangulo/
		
		boolean condicion1 = (a + b)>c;
		boolean condicion2 = (a + c)>b;
		boolean condicion3 = (b + c)>a;
		
		if(condicion1 && condicion2 && condicion3){
			//System.out.println("Triangulo legal");
			// Calcular semiperimetro
			double semiperimetro = (a + b + c)/2;
			double area = Math.sqrt(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c));
			
			System.out.println("\nPara un triangulo con lados: " + a +", " + b + ", y " + c + ", el area es de:\n"+ area+" cm^2\n");
			
			
		} else {
			System.out.println("Los lados introducidos no pueden formar un triangulo, por favor revise los valores y vuelva a intentar.");
		}
		
	}//Fin ejercicio 1
	
	static void ejercicio2(double radio) {
		// Calculo del area
		double area = Math.PI*(radio*radio);
		System.out.println("\nArea de un circulo con un radio de " + radio +" cm:\n"+area + " cm^2");
		
		// Calculo de circunferencia C = 2*pi*r
		double circunferencia = 2*Math.PI*radio;
		System.out.println("Circunferencia de un circulo con un radio de " + radio +" cm:\n"+circunferencia + " cm\n");
	}//Fin ejercicio 2
	
	// Para ejercicio 3 buscar sobre libreria de tiempo local en java
	static void ejercicio3() {
		// Formato para presentar solo la hora actual
		DateTimeFormatter formatoTiempo = DateTimeFormatter.ofPattern("HH:mm:ss");  
		// Objeto que obtiene la hora actual con el metodo .now()
		LocalDateTime ahora = LocalDateTime.now();  
		System.out.println("\nTiempo actual del sistema: " + formatoTiempo.format(ahora));
	}//Fin ejercicio 3
	
	static void ejercicio4(int segundos) {
		double horas = ((double)segundos)/3600.0;
		double minutos = ((double)segundos)/60.0;
		System.out.println("\n" + segundos + " segundos equivalen a:\n" + horas + " horas.\n" + minutos +" minutos.\n" + segundos + " segundos.\n");
		
	}//Fin ejercicio 4
	
	static void ejercicio5(double radio) {
		// Calculo de volumen de una esfera con radio: 4/3 * pi * r^3
		double volumen = (4*Math.PI*Math.pow(radio, 3))/3;
		System.out.println("\nVolumen para una esfera con un radio de " + radio +" cm:\n" + volumen + " cm^3\n");
	}//Fin ejercicio 5
	
	static void ejercicio6(double radio, double altura) {
		// Calculo de volumen de un cono con radio y altura: 1/3hπr²
		double volumen = (altura*Math.PI*Math.pow(radio, 2))/3;
		System.out.println("\nVolumen para un cono con un radio de " + radio +" cm y una altura de " +altura+ ":\n" + volumen + " cm^3\n");
	}//Fin ejercicio 6
	
	static void ejercicio7(double lado) {
		// Calculo de area superficial de un cubo = 6*a^2
		double areaSuperficial = 6*lado*lado;
		System.out.println("\nPara un cubo con lados de longitud " + lado + " cm, su area superficial es de: \n" + areaSuperficial + " cm^2\n");
	}//Fin ejercicio 7
	
	static void ejercicio8(int year) {
		// Para determinar si un anio es bisiesto hay varias condiciones
		// 1. Debe ser divisible entre 4
		// 2. Si es divisible entre 100, tambien debe ser divisible entre 400 para ser considerado como bisiesto
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					// si es bisiesto
					System.out.println("\nEl año " + year + " si es bisiesto 👍\n");
				} else {
					// no es bisiesto
					System.out.println("\nEl año " + year + " no es bisiesto :(\n");
				}
			} else {
				//si es bisiesto
				System.out.println("\nEl año " + year + " si es bisiesto 👍\n");
			}
		} else {
			// no es bisiesto
			System.out.println("\nEl año " + year + " no es bisiesto :(\n");
		}
	}//Fin ejercicio 8
	
	static void ejercicio9() {
		// Escribir y mostrar en pantalla los primeros 100 numeros primos
		// Dos opciones:
		// 1. While que cada ciclo imprima el numero
		// 2. Acumular los datos en un String y mostrar el resultado al final
	
		int numeroActual = 2;	//Se inicia desde el 2 porque el 1 no es primo
		int contadorPrimos = 0;		//Contador que se ira revisando en cada ciclo del while
		boolean flag = false;		//Bandera que indica si se detecta algun modulo ==0 (o sea que el numero revisado si sea divisible por algun otro numero)
		
		while(contadorPrimos<100) {
			// Ciclo que revisa el modulo entre el numeroActual y una iteracion desde el 2 hasta numeroActual-1
			for(int i=2; i<numeroActual; i++) {
				if(numeroActual%i==0) {
					// Si se detecta algun modulo == 0, quiere decir que numeroActual es divisible por i, y se cambia el estado de flag a true
					flag = true;
				}
			}
			// Si no se cambio el estado de flag, quiere decir que el numeroActual es primo
			if(!flag) {
				//acumulado += i + ", " ;
				System.out.println(numeroActual + " si es primo." );
				// Se actualiza el contador de numeros primos por 1
				contadorPrimos= contadorPrimos + 1;
				//System.out.println("Contador primos: " + contadorPrimos);
				// Se resetea el estado de la bandera para el proximo ciclo
				flag = false;
			} else {
				// Si la bandera se cambio a true, quiere decir que el numeroActual no es primo, y no se muestra en console
				//System.out.println(i + " no es primo.");
				// Se resetea el estado de la bandera para el proximo ciclo
				flag = false;
			}
			// Se incrementa por 1 el numeroActual para ser revisado el siguiente ciclo
			numeroActual++;
			
		}
		
		//System.out.println(acumulado);
		
	}//Fin ejercicio 9
	
	static void ejercicio10(long num1, long num2) {
		//Escribir un programa para sumar 2 numeros sin usar operadores aritmeticos 
		double sum = Math.addExact(num1, num2);
		
		System.out.println("\n" + num1 + " + " + num2 + "= " + sum + "\n");	
	}//Fin ejercicio 10
	
	static void ejercicio11(int num) {
		
		char primerDigito = Integer.toString(num).charAt(0);
		char segundoDigito = Integer.toString(num).charAt(1);
		
		//System.out.println(primerDigito);
		//System.out.println(segundoDigito);
		
		if(primerDigito == segundoDigito) {
			System.out.println("\n" + num + " si es palindromo \n");
		} else {
			System.out.println("\n" + num + " no es palindromo");
		}
	}//Fin ejercicio 11
	
	static void ejercicio12(int num) {
		//Sin usar loops, escribir un metodo para sumar todos los digitos de un numero donde 99 >= n >= 10		
		int primerDigito = num/10;
		int segundoDigito = num-(primerDigito*10);
		System.out.println("\nNumero ingresado: " + num);
		System.out.println("Primer digito: " + primerDigito);
		System.out.println("Segundo digito: " + segundoDigito);
		
		System.out.println("Suma de los dos digitos: " + (primerDigito+segundoDigito) + "\n");
	}//Fin ejercicio 12

	static void ejercicio13(String stringIngresada) {
		// Escribir un método para remover espacios en blanco de un String. ej -> "Hola Mundo" -> "HolaMundo"
		// Podemos usar el metodo replaceAll
		System.out.println("\nString de entrada: " + stringIngresada);
		
		String sinEspacios = stringIngresada.replaceAll(" ", "");
		
		System.out.println("String sin espacios: " + sinEspacios + "\n");
		
	}
	
	static void ejercicio14(String stringIngresada) {
		// Escribir un método para invertir un String. ej -> "Hola" -> "aloH" --- Sin usar loops 
		System.out.println("\nString ingresada: " + stringIngresada);
		
		//Los objetos del tipo StringBuilder si se pueden modificar (a diferencia de los Strings regulares),
		// Estos mismos objetos tienen el metodo reverse() que sirve para invertir strings.
		StringBuilder stringParaInvertir = new StringBuilder();
		
		//Se agrega el valor de stringIngresada al objeto del tipo StringBuilder
		stringParaInvertir.append(stringIngresada);
		stringParaInvertir.reverse();
		System.out.println("String invertida: " + stringParaInvertir + "\n");
	}

	public static int ejercicio15(int inputNum) {
		// Forma recursiva
		if(inputNum<=1) {
			return 1;
		} else {
			return inputNum*ejercicio15(inputNum-1);
		}
	}//Fin ejercicio 15
	
		
	
	public static void main(String[] args) {
		
		
		ejercicio1(3, 4, 5);	//Si es un triangulo
		ejercicio1(3, 4, 8);	//No puede formar un triangulo
				
		ejercicio2(5);	//Radio en cm
		
		ejercicio3();	//Muestar la hora actual del sistema
		
		ejercicio4(45687); //Segundos en entero
		
		ejercicio5(5);	//Radio en cm
		
		ejercicio6(5, 5);	//Radio en cm, altura en cm
		
		ejercicio7(4);		//Lado en cm
		
		ejercicio8(2000);	//Año bisiesto
		ejercicio8(1999);	//Año no bisiesto
		ejercicio8(2100);	//Año no bisiesto
		ejercicio8(2004);	//Año bisiesto
		
		ejercicio9();		//Primeros 100 numeros primos
		
		ejercicio10(15,30);		//Suma de dos numeros sin operadores aritmeticos
		ejercicio10(11,-54);
		
		ejercicio11(15);	//Numero de dos digitos positivo
		ejercicio11(22);	//Numero de dos digitos positivo
		
		ejercicio12(44);	// Suma los dos digitos de los numeros ingresados
		ejercicio12(99);	// Suma los dos digitos de los numeros ingresados
		ejercicio12(10);	// Suma los dos digitos de los numeros ingresados
		
		ejercicio13("Test de un string");	//Borra los espacios dentro del string
		ejercicio13("  Otro test pero con espacios al inicio y al final   "); 	//Borra los espacios dentro del string
		
		ejercicio14("String de entrada");	//Invierte el string de entrada
		ejercicio14("A ver otro test");		//Invierte el string de entrada
		
		System.out.println("Factorial del numero ingresado: " + ejercicio15(5));	//Calcula el valor factorial del numero ingresado
		
	}

}
