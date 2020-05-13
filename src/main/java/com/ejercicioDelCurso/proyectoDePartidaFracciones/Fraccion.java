package com.ejercicioDelCurso.proyectoDePartidaFracciones;




public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion() {
		this.numerador = 0;
		this.denominador = 0;
	}
	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}

	
	public Fraccion simplifica(Fraccion entrada) {
		int div = 2;
		Fraccion entrada2 = entrada;
		while(CalculosMatematicos.esPrimo(entrada2.numerador) == false && CalculosMatematicos.esPrimo(entrada2.denominador) == false ){
			if(entrada2.numerador % div == 0 && entrada2.denominador % div == 0) {
				entrada2.numerador /= div;
				entrada2.denominador /= div;
			}else {
				div ++;
			}
		}
		return entrada2;
	}
	
	public Fraccion suma(Fraccion sumando1, Fraccion sumando2) {
		Fraccion suma = new Fraccion();
		if(sumando1.denominador != sumando2.denominador) {
			suma.setDenominador(sumando1.denominador * sumando2.denominador);
			suma.setNumerador(sumando1.numerador * sumando2.denominador+sumando2.numerador * sumando1.denominador);
		}else {
			suma.setNumerador(sumando1.numerador+sumando2.numerador);
			suma.setDenominador(sumando1.denominador);
		}
		return suma;
	}
	
		public Fraccion multiplicacion(Fraccion sumando1, Fraccion sumando2) {
			Fraccion suma = new Fraccion();
			suma.setNumerador(sumando1.numerador * sumando2.numerador);
			suma.setDenominador(sumando1.denominador * sumando2.denominador);
			return suma;
			
		}
		
		public Fraccion division(Fraccion sumando1, Fraccion sumando2) {
			Fraccion suma = new Fraccion();
			suma.setNumerador(sumando1.numerador * sumando2.denominador);
			suma.setDenominador(sumando1.denominador * sumando2.numerador);
			return suma;
		}
	
	public int getNumerador() {
		return numerador;
	}

	public int getDenominador() {
		return denominador;
	}


	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(numerador).append(" / ").append(denominador);
		return sb.toString();
	}

}
