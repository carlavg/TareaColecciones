import java.util.ArrayList;
import java.util.List;

public class Colores {

	public static void main(String[] args) {

		List<String> colores = new ArrayList<String>();

		colores.add("Amarillo");

		colores.add("Negro");

		colores.add("Azul");

		colores.add("Rojo");

		colores.add("Blanco");

		colores.add("Gris");
		System.out.println("------Lista inicial de Colores-------");
		System.out.println(colores);
		System.out.println("El tamaño de la lista inicial es " + colores.size());
		System.out.println("El segundo elemento de la lista de colores original es : " + colores.get(1));

		System.out.println("Se va borrar el tercer elemento de la lista, que es: " + colores.get(2));
		colores.remove(2);
		System.out.println("------Lista de Colores despues de borrar el tercer elemento-------");
		System.out.println(colores);
		System.out.println("Se va actualizar el cuarto elemento de la lista, que es: " + colores.get(3));
		colores.set(3, "Celeste");
		System.out.println("------Lista de Colores despues de actualizar el cuarto elemento-------");
		System.out.println(colores);

		
        // ArrayList newc1 = (ArrayList) ((ArrayList) colores).clone();
		System.out.println("Ahora vamos a mostrar el fragmento de la lista que va de la segunda a la cuarta posición");
		List<String> fragmentoDeColores = new ArrayList<String>();
		fragmentoDeColores = colores.subList(1, 3);
		System.out.println(fragmentoDeColores);
		System.out.println("Ahora vamos a clonar la lista de colores");
		List<String> colores1 = new ArrayList<String>();

		for (String color : colores) {
			colores1.add(color);
		}

		System.out.println("Ahora vamos a mostrar la lista clonada\n" + colores1);

		System.out.println("Ahora vamos a comparar la lista con su clone");

		if (colores.equals(colores1)) {
			System.out.println("Las listas son iguales");
		} else {
			System.out.println("Las listas no son iguales");
		}
		System.out.println("Ahora vamos a vaciar la lista original");
		colores.clear();
		System.out.println("¿La lista de colores en la lista esta vacia?  " + colores.isEmpty());
		System.out.println("Ahora vamos a comparar la lista vaciada con su clone");

		if (colores.equals(colores1)) {
			System.out.println("Las listas son iguales");
		} else {
			System.out.println("Las listas no son iguales");
		}

	}
}