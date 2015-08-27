package jv.colegio.models;

import java.util.ArrayList;

import jv.colegio.util.Helper;

public class Colegio {
	//Arreglo con cada uno de los perros inscritos 
	private ArrayList<Perro> inscripciones=new ArrayList<Perro>();

	public Colegio(){
		super();
	}

	/**
	 * Inscribe un perro al colegio
	 * @param perro
	 */
	public void inscribirPerro(Perro perro){
		this.inscripciones.add(perro);
	}

	/**
	 * Imprime el listado de perros inscritos ordenados por Localidad
	 */
	public void imprimirPerros(){
		int cont=1;
		inscripciones=Helper.ordenarListaByLocalidad(inscripciones);
		String localidad_temp="";
		for(Perro perro : this.inscripciones){
			if(!localidad_temp.equals(perro.getLocalidad())){
				localidad_temp=perro.getLocalidad();
				System.out.println("\n* Localidad: "+localidad_temp);
			}
			System.out.print(cont+". ");
			System.out.println(perro.toString());
			cont++;
		}


	}
}
