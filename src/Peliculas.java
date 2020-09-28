
import java.util.HashSet;
import java.util.Set;

public class Peliculas {

	public static void main(String[] args) {

		Set<String> listaPeliculas = new HashSet<String>();
		

		listaPeliculas.add("Gladiador");
		listaPeliculas.add("El transportador");
		listaPeliculas.add("El señor de los anillos");
		listaPeliculas.add("Annabelle");
		listaPeliculas.add("Titanic");

		System.out.println("--------Peliculas--------");
		System.out.println(listaPeliculas);

		System.out.println("Muestra la lista de peliculas por separado");
		for (String peliculas : listaPeliculas) {
			System.out.println(peliculas);
		}

		System.out.println("Cantidad de peliculas en la lista : " + listaPeliculas.size());

		boolean estaVacio = listaPeliculas.isEmpty();
		System.out.println("¿La lista de peliculas esta vacia? " + ((estaVacio) ? "Si" : "No"));

		Set<String> listaPeliculasCopia = new HashSet<String>();

		for (String pelicula : listaPeliculas) {
			listaPeliculasCopia.add(pelicula);
		}


		System.out.println("Ahora vamos a mostrar la lista de peliculas clonada\n" + listaPeliculasCopia);

		System.out.println("Ahora vamos a comparar la lista de peliculas con la nueva lista clonada: ");

		if (listaPeliculas.equals(listaPeliculasCopia)) {
			System.out.println("Las listas de peliculas son iguales");
		} else {
			System.out.println("Las listas de peliculas no son iguales");

		}

		System.out.println("Ahora vamos a vaciar la lista de peliculas original");
		listaPeliculas.clear();
		System.out.println("Lista de peliculas despues de haberla vaciado: \n" + listaPeliculas);
		System.out.println("Tamaño de la lista de peliculas despues de haberla vaciado: " + listaPeliculas.size());

		estaVacio = listaPeliculas.isEmpty();
		System.out.println("¿La lista de peliculas original esta vacia?  " + ((estaVacio) ? "Si" : "No"));

	}
}
