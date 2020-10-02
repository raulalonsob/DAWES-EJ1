package com.Datos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class AccesoDatos {


	public List<String> lecturaDatos() throws IOException {
		File file = new File ("C://Users//Raúl.Diego-PC/Documents/fichero.txt");
		BufferedReader lector;

		lector= new BufferedReader(new FileReader(file));
		List<String> lectura=new ArrayList<>();
		String linea;
		while ((linea = lector.readLine()) != null) {
			lectura.add(recuperaPersona(linea));
		}

		return lectura;
	}

	public String recuperaPersona(String linea){
		String[] arrayPersona = linea.split("-");

		return arrayPersona[0];
	}

}
