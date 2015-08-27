package jv.colegio;

import java.util.Scanner;
import jv.colegio.models.Colegio;
import jv.colegio.util.Helper;

public class Main {

	public static void main(String[] args) {
		//Crea colegio
		Colegio colegio = new Colegio();
		//Crea e inscribe perros al colegio
		Helper.crearPerros(colegio);

		int seleccion=0;
		//Menú
		Scanner input = new Scanner(System.in);
		while (seleccion!=2) {
			menu();
			if(input.hasNextInt()){
				seleccion = input.nextInt();
			}
			switch(seleccion){
			case 1:
				//Imprime perros inscritos
				colegio.imprimirPerros();
				break;
			case 2:
				System.out.println("Ejecucion finalizada");
				System.exit(0);
				break;
			default:
				System.out.println("Por favor seleccione una opcion");
				break;
			}
		}
		System.out.println("Ejecucion finalizada");
		input.close();
		System.exit(0);
	}

	/**
	 * Imprime menú
	 * @return
	 */
	public static void menu() {		
		/***************************************************/
		System.out.println("\n\n**************************");
		System.out.println("Ingrese una opcion");
		System.out.println("-------------------------\n");
		System.out.println("1 - Mostrar listado de perros");
		System.out.println("2 - Salir");	
	}

}
