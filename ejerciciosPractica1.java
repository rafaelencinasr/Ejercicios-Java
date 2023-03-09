package practica1;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    

public class Practica {
	
	// Mostrar resultados con sysout dentro de los metodos

	// 1 Escribir un metodo para encontrar el área de un triángulo a partir de 3 lados ingresados
    // Revisar si es un triángulo válido
    
    // 2 Escribir un metodo para encontrar el area y la circumferencia de un circulo dado el radio
    // Utilizar PI de la libreria de Java
    
    // 3 Escribir un metodo que muestre por consola la hora del sistema
    // Utilizar e investigar la libreria de Java

    // 4 Escribir un metodo que convierta n cantidad de segundos a (hora, minutos, segundos) segun sea el caso
    // ej 3600 = "1 hora = 60 min = 3600 seg"
    
    // 5 Escribir un metodo para encontrar el volumen de una esfera dado el radio
    
    // 6 Escribir un metodo para encontrar el volumen de un cono a dado el radio y la altura
    
    // 7 Encontrar el area superficial de un cubo dado un lado a

    // 8 Escribir un metodo para descubrir si un año ingresado es bisiesto o no
	
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
			
			System.out.println("Para un triangulo con lados: " + a +", " + b + ", y " + c + ", el area es de:\n"+ area+" cm^2");
			
			
		} else {
			System.out.println("Los lados introducidos no pueden formar un triangulo, por favor revise los valores y vuelva a intentar.");
		}
		
	}
	
	static void ejercicio2(double radio) {
		// Calculo del area
		double area = Math.PI*(radio*radio);
		System.out.println("Area de un circulo con un radio de " + radio +" cm:\n"+area + " cm^2");
		
		// Calculo de circunferencia C = 2*pi*r
		double circunferencia = 2*Math.PI*radio;
		System.out.println("Circunferencia de un circulo con un radio de " + radio +" cm:\n"+circunferencia + " cm");
	}
	
	// Para ejercicio 3 buscar sobre libreria de tiempo local en java
	static void ejercicio3() {
		// Formato para presentar solo la hora actual
		DateTimeFormatter formatoTiempo = DateTimeFormatter.ofPattern("HH:mm:ss");  
		// Objeto que obtiene la hora actual con el metodo .now()
		LocalDateTime ahora = LocalDateTime.now();  
		System.out.println("Tiempo actual del sistema: " + formatoTiempo.format(ahora));
		 
		
	}
	
	static void ejercicio4(int segundos) {
		double horas = ((double)segundos)/3600.0;
		double minutos = ((double)segundos)/60.0;
		System.out.println(segundos + " segundos equivalen a:\n" + horas + " horas.\n" + minutos +" minutos.\n" + segundos + " segundos.");
		
	}
	
	static void ejercicio5(double radio) {
		// Calculo de volumen de una esfera con radio: 4/3 * pi * r^3
		double volumen = (4*Math.PI*Math.pow(radio, 3))/3;
		System.out.println("Volumen para una esfera con un radio de " + radio +" cm:\n" + volumen + " cm^3");
	}
	
	static void ejercicio6(double radio, double altura) {
		// Calculo de volumen de un cono con radio y altura: 1/3hπr²
		double volumen = (altura*Math.PI*Math.pow(radio, 2))/3;
		System.out.println("Volumen para un cono con un radio de " + radio +" cm y una altura de " +altura+ ":\n" + volumen + " cm^3");
	}
	
	static void ejercicio7(double lado) {
		// Calculo de area superficial de un cubo = 6*a^2
		double areaSuperficial = 6*lado*lado;
		System.out.println("Para un cubo con lados de longitud " + lado + " cm, su area superficial es de: \n" + areaSuperficial + " cm^2");
	}
	
	static void ejercicio8(int year) {
		// Para determinar si un anio es bisiesto hay varias condiciones
		// 1. Debe ser divisible entre 4
		// 2. Si es divisible entre 100, tambien debe ser divisible entre 400 para ser considerado como bisiesto
		
		if(year%4==0) {
			if(year%100==0) {
				if(year%400==0) {
					// si es bisiesto
					System.out.println("El año " + year + " si es bisiesto 👍");
				} else {
					// no es bisiesto
					System.out.println("El año " + year + " no es bisiesto :(");
				}
			} else {
				//si es bisiesto
				System.out.println("El año " + year + " si es bisiesto 👍");
			}
		} else {
			// no es bisiesto
			System.out.println("El año " + year + " no es bisiesto :(");
		}
	}
	
	
	public static void main(String[] args) {
		ejercicio1(3, 4, 5);	//Si es un triangulo
		ejercicio1(3, 4, 8);	//No puede formar un triangulo
				
		ejercicio2(5);	//Radio en cm
		
		ejercicio3();
		
		ejercicio4(45687); //Segundos en entero
		
		ejercicio5(5);	//Radio en cm
		
		ejercicio6(5, 5);	//Radio en cm, altura en cm
		
		ejercicio7(4);		//Lado en cm
		
		ejercicio8(2000);	//Año bisiesto
		ejercicio8(1999);	//Año no bisiesto
		ejercicio8(2100);	//Año no bisiesto
		ejercicio8(2004);	//Año bisiesto
		
	}

}
