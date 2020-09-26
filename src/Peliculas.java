
import java.util.HashSet;
import java.util.Set;

public class Peliculas {

	public static void main(String[] args) {

		Set<String> listaPeliculas = new HashSet<String>();
		//Set<String> listaPeliculasCopia = new HashSet<String>();

		listaPeliculas.add("Gladiador");
		listaPeliculas.add("El transportador");
		listaPeliculas.add("El señor de los anillos");
		listaPeliculas.add("Annabelle");
		listaPeliculas.add("Titanic");
		listaPeliculas.add("Titanic");
		

		System.out.println(listaPeliculas);

		System.out.println("Muestra la lista por separado");
		for (String peliculas : listaPeliculas)
			System.out.println(peliculas);

		System.out.println("Cantidad de peliculas en la lista : " + listaPeliculas.size());

		boolean estaVacio = listaPeliculas.isEmpty();
		System.out.println("¿La lista de peliculas en la lista esta vacia?  " + ((estaVacio) ? "Si" : "No"));
		

		listaPeliculas.clear();
		System.out.println("Lista de peliculas despues de haber eliminado " + listaPeliculas.size());

		System.out.println("¿La lista de peliculas en la lista esta vacia?  " + listaPeliculas.isEmpty());

	}
}
