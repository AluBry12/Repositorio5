/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Municipio de Gye
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

		escribir();

		leer();

	}

 

    public static void escribir()

    {

        FileWriter fichero = null;

        PrintWriter pw = null;

        try

        {

        	fichero = new FileWriter("archivo.txt");

           	pw = new PrintWriter(fichero);

 

           	System.out.println("Escribiendo en el archivo.txt");

           	for (int i = 0; i < 10; i++)

        	   pw.println("Linea " + i);

 

        } catch (Exception e) {

        	e.printStackTrace();

        } finally {

        	try {

    			// Nuevamente aprovechamos el finally para 

        		// asegurarnos que se cierra el fichero.

        		if (null != fichero)

        			fichero.close();

        	} catch (Exception e2) {

        		e2.printStackTrace();

        	}

        }

    }

 

    public static void leer()

    {

        File archivo = null;

        FileReader fr = null;

        BufferedReader br = null;

 

        try {

			// Apertura del fichero y creacion de BufferedReader para poder

			// hacer una lectura comoda (disponer del metodo readLine()).

			archivo = new File ("archivo.txt");

			fr = new FileReader (archivo);

			br = new BufferedReader(fr);

 

			// Lectura del fichero

			System.out.println("Leyendo el contendio del archivo.txt");

			String linea;

			while((linea=br.readLine())!=null)

				System.out.println(linea);

        }

        catch(Exception e){

           e.printStackTrace();

        }finally{

           // En el finally cerramos el fichero, para asegurarnos

           // que se cierra tanto si todo va bien como si salta 

           // una excepcion.

           try{

              if( null != fr ){

                 fr.close();

              }

           }catch (Exception e2){

              e2.printStackTrace();

           }

        }

    }


}
  
    

