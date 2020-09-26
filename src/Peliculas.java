
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
		for (String peliculas : listaPeliculas)
			System.out.println(peliculas);

		System.out.println("Cantidad de peliculas en la lista : " + listaPeliculas.size());

		boolean estaVacio = listaPeliculas.isEmpty();
		System.out.println("¿La lista de peliculas en la lista esta vacia?  " + ((estaVacio) ? "Si" : "No"));

		Set<String> listaPeliculasCopia = new HashSet<String>();

		listaPeliculasCopia.add("Gladiador");
		listaPeliculasCopia.add("El transportador");
		listaPeliculasCopia.add("El señor de los anillos");
		listaPeliculasCopia.add("Annabelle");
		listaPeliculasCopia.add("Titanic");

		for (String pelicula : listaPeliculasCopia) {
			listaPeliculas.add(pelicula);
		}

		System.out.println("Ahora vamos a mostrar la lista de peliculas clonada\n" + listaPeliculasCopia);

		System.out.println("Ahora vamos a comparar la lista de peliculas con la nueva lista clonada: ");

		if (listaPeliculas.equals(listaPeliculasCopia)) {
			System.out.println("Las listas de peliculas son iguales");
		} else {
			System.out.println("Las listas de peliculas no son iguales");

		}

		listaPeliculas.clear();
		System.out.println("Lista de peliculas despues de haber eliminado " + listaPeliculas.size());

		listaPeliculas.isEmpty();
		System.out.println("¿La lista de peliculas en la lista esta vacia?  " + ((estaVacio) ? "Si" : "No"));

	}
}
