package com.Negocio;

import java.io.IOException;
import java.util.List;

import com.Datos.AccesoDatos;


public class CalcularCoches {
	public Integer calculaCoches(String nombre) throws IOException {
		//Consultar datos
		List <String> listaNombres= new AccesoDatos().lecturaDatos();
		Integer contador=0;
		for (String nombres : listaNombres) {
			if(nombres.equals(nombre)) {
				contador++;
			}
			
		}
		return contador;
//		
//		int LongitudArray = accesoDatos.lecturaDatos().size();
//		int contador=0;
//		for (int j=0;j<LongitudArray;j++) {
//			if(accesoDatos.lecturaDatos().get(j)==nombre)
//                contador++;
//		}
//		return contador;
//		
		
		
	}
}
