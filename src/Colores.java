import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
		
		System.out.println(colores);
		
		System.out.println("El numero elementos de la lista es de : " + colores.get(1));
		
		colores.remove("Blanco");
		
		int tamano = colores.size();
		System.out.println("La lista de colores despues de borrar el tercer elemento es : " + tamano);
		
		System.out.println(colores);
		
		
		
		
		
		
		
		
		
		
		colores.clear();
		System.out.println("¿La lista de colores en la lista esta vacia?  " + colores.isEmpty());
		
	   
		

		    }

	
	}
		


