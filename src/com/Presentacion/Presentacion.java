package com.Presentacion;

import java.io.IOException;
import java.util.Scanner;

import com.Negocio.CalcularCoches;



public class Presentacion {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca el nombre de la persona que desea consultar");
		String nombre= sc.next();
		System.out.println("el número de coches que tiene "+nombre +" es:  "+ new  CalcularCoches().calculaCoches(nombre));
		
	}
}
