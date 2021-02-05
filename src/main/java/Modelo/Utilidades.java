/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/**
 *
 * @author Jose
 */
public class Utilidades {
    public static ArrayList<Alumno> getAlumnos(String fichero) throws FileNotFoundException, IOException{
           //ArrayList<Alumno> ListaAlumnos =null;	
           ArrayList<String> pueblos = new ArrayList<String>();
            ArrayList<Alumno> ListaAlumnos =  new ArrayList<Alumno>();
                
		try {
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(new FileInputStream(fichero), "utf-8"));
			String linea;			
			try {
				
				while((linea = buffer.readLine())!=null) {
					//pueblos.add(poblacion);
                                        String [] atributos = linea.split(";");
                                        Alumno prod;
                                        prod = new Alumno(
                                                Integer.parseInt(atributos[0]),
                                                atributos[1], 
                                                atributos[2],
                                                atributos[3]);                                 
                                        ListaAlumnos.add(prod);
                                        
				 }
				
				buffer.close();
			} catch (IOException e) {
				
			}
		
		} catch (UnsupportedEncodingException e) {
			
		}
		return ListaAlumnos;		
	}
}
