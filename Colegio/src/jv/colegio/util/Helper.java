package jv.colegio.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import jv.colegio.models.Colegio;
import jv.colegio.models.Perro;

/**
 * Clase con diferentes utilidades
 *
 */
public class Helper {

	static Perro perro;
	
	/**
	 * Crea e inscribe cada perro al Colegio
	 * @param colegio
	 */
	public static void crearPerros(Colegio colegio){
		perro = new Perro("Lucas", "Labrador", Constants.USAQUEN, "801612258", "Pedro Perez", "4885599", Constants.LUNES);
		colegio.inscribirPerro(perro);
		perro = new Perro("Mateo", "Pastor alemam", Constants.SUBA, "195522665", "Pilar Mendez", "3102556699", Constants.SABADO);
		colegio.inscribirPerro(perro);
		perro = new Perro("Canela", "Gran danes", Constants.CHAPINERO, "1013141565", "John Martinez", "2545487", Constants.MIERCOLES);
		colegio.inscribirPerro(perro);
		perro = new Perro("Motas", "Golden retriever", Constants.TEUSAQUILLO, "52632158", "Paula Jaimes", "4986532", Constants.DOMINGO);
		colegio.inscribirPerro(perro);
		perro = new Perro("Daisy", "Basset hound", Constants.SUBA, "80321564", "Juan Gonzalez", "3155848798", Constants.VIERNES);
		colegio.inscribirPerro(perro);
		perro = new Perro("Pluto", "French puddle", Constants.CHAPINERO, "52987654", "Daniel Zapata", "3002659887", Constants.JUEVES);
		colegio.inscribirPerro(perro);
		perro = new Perro("Luna", "Doberman", Constants.SUBA, "1032165498", "Ivan Puerta", "6548798", Constants.VIERNES);
		colegio.inscribirPerro(perro);		
		perro = new Perro("Toby", "Dalmata", Constants.TEUSAQUILLO, "1056498732", "Manuel Garcia", "6548798", Constants.DOMINGO);
		colegio.inscribirPerro(perro);		
		perro = new Perro("Rufo", "Chihuahua", Constants.CHAPINERO, "1085236987", "Martha Pineda", "3005123265", Constants.LUNES);
		colegio.inscribirPerro(perro);		
		perro = new Perro("Topo", "Bulldog", Constants.USAQUEN, "52654123", "Marcela Gomez", "7552112", Constants.JUEVES);
		colegio.inscribirPerro(perro);		
	}
	
	/**
	 * Ordena lista de perros inscritos por nombre de localidad a la que pertenecen
	 * @param inscripciones
	 * @return ArrayList<Perro>
	 */
	public static ArrayList<Perro> ordenarListaByLocalidad(ArrayList<Perro>  inscripciones){
	    Collections.sort(inscripciones, new Comparator<Perro>() {
	        public int compare(Perro o1, Perro o2) {
	        	Perro p1 = (Perro) o1;
	            Perro p2 = (Perro) o2;
	            return p1.getLocalidad().compareToIgnoreCase(
	                    p2.getLocalidad());
	        }
	    });
	    return inscripciones;

	}
}
