package com.ejercicioDelCurso.proyectoDePartidaFracciones;

import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;


public class AppMain {

	public static void main(String[] args) {
		/*
		 * Ejemplo de uso del método CalculosMatematicos.divisores
		 * Este método descompone un número en factores primos
		 * Retornando un mapa con los factores primos
		 */
				
		int num = 180;
		SortedMap<Integer,Integer> divisores = new TreeMap<>();
		divisores=CalculosMatematicos.divisores(num);
		for(Map.Entry<Integer, Integer> entrada: divisores.entrySet()) {
			int divisor=entrada.getKey();
			int numeroVeces=entrada.getValue();
			for(int i=1;i<=numeroVeces;i++) {
			System.out.println(num+"\t|\t"+divisor);
			num=num/divisor;
			}
		}
				
		Fraccion ejempoFraccion = new Fraccion(8, 100);		
		System.out.println("\n\nPara ver como funciona toString en Fraccion:\t"+ejempoFraccion.toString());
		Fraccion salida = new Fraccion();
		salida = salida.simplifica(ejempoFraccion);
		System.out.println("\n\nFraccion simplificada:\t"+salida.toString());
		Fraccion suma1 = new Fraccion(2,8);
		Fraccion suma2 = new Fraccion(9,6);
		
		
		salida = salida.suma(suma1, suma2);
		System.out.println("\n\nSuma Fracciones: "+suma1.toString()+ " + " +suma2.toString()+" = "+salida);
		Fraccion multi1=new Fraccion(2,5);
		Fraccion multi2=new Fraccion (3,7);
		
		Fraccion resultado=new Fraccion();
		resultado=resultado.multiplicacion(multi1, multi2);
		System.out.println(resultado);
		
		Fraccion divi1=new Fraccion(3,8);
		Fraccion divi2=new Fraccion(2,4);
		Fraccion result=new Fraccion();
		result=result.division(divi1, divi2);
		System.out.println(result);
		

		
		Fraccion descompuesta=new Fraccion(12,24);
		descompuesta=descompuesta.descomponer(descompuesta);
		System.out.println(descompuesta);
	
	}

}