package controlDeFlujo;

import java.util.Scanner;	//Importamos el scanner

//Programa para evaluar examenes
public class Ejercicio11 {

	public static void main(String[] args) {
		// 1. Calificacion minima aprobatoria
		// con final se declara como constante
		final int calificacionMinima = 60;
		
		// Creamos un objeto del tipo scanner, llamado entrada
		Scanner entrada = new Scanner(System.in);
		System.out.println("Este programa determina si la calificacion ingresada es aprobatoria o no: ");
		System.out.println("Ingresa los puntos obtenidos");
	
		//Asignamos el valor ignresado por el scanner, a una variable
		int calificacionIngresada = entrada.nextInt();

		//if else statement
		if(calificacionIngresada>=calificacionMinima) {
			System.out.println("Felicidades! Aprobaste el examen");
		} else {
			System.out.println("Hijole...");
		}
	
		// Con operadores ternarios
		String resultadoExamen = calificacionIngresada>=calificacionMinima? "Felicidades, aprobaste!": "Hijole...";
		System.out.println(resultadoExamen);
		
		
		
	
	}// Fin del main

}
