import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class AgendaTelefonica {

	public static void main(String[] args) {

		Map<String, Integer> agendaTelefonica = new HashMap<String,Integer>();

		agendaTelefonica.put("Carlos", 4443321);
		agendaTelefonica.put("Gerardo", 15572404);
		agendaTelefonica.put("Daniela", 15437137);
		agendaTelefonica.put("Sandra", 4443324);
		agendaTelefonica.put("Osvaldo", 4443329);
		agendaTelefonica.put("Santiago", 4443330);

		
		System.out.println("Agenda telefónica original");
		System.out.println(agendaTelefonica);

		int tamanoDelMapa = agendaTelefonica.size();
		System.out.println("Tamaño del mapa : " + tamanoDelMapa);

		System.out.println("El télefono de Carlos es : " + agendaTelefonica.get("Carlos"));

		String key = "Gerardo";
		System.out.println("Ahora vamos a ver si existe un teléfono agendado para el siguiente nombre: "+ key);
		if (agendaTelefonica.containsKey(key)) {
			System.out.println("Si, el telefono de este contacto ("+key+") es:  " + agendaTelefonica.get(key));
		} else {
			System.out.println("No hay número de telefono asociado a este nombre");

		}
		
	    key = "Mariano";
		System.out.println("Ahora vamos a ver si existe un teléfono agendado para el siguiente nombre: "+ key);
		if (agendaTelefonica.containsKey(key)) {
			System.out.println("Si, el telefono de este contacto ("+key+") es:  " + agendaTelefonica.get(key));
		} else {
			System.out.println("No hay número de telefono asociado a este nombre");

		}

		Integer value = 15572404;
		System.out.println("Ahora vamos a ver si existe un nombre asociado al siguiente número: " + value);
		if (agendaTelefonica.containsValue(value)) {
			System.out.println("Si, existe un nombre asociado a este número de teléfono ("+ value +")");
		} else {
			System.out.println("No existe un nombre asociado a este número de teléfono");

		}
		
	    value = 12345678;
		System.out.println("Ahora vamos a ver si existe un nombre asociado al siguiente número: " + value);
		if (agendaTelefonica.containsValue(value)) {
			System.out.println("Si, existe un nombre asociado a este número de teléfono ("+ value +")");
		} else {
			System.out.println("No existe un nombre asociado a este número de teléfono");

		}
		
	   System.out.println("Ahora vamos a convertir nuestro mapa (Map) en un conjunto (Set) y mostrarlo por consola.");	
       Set set = agendaTelefonica.entrySet();
       System.out.println(set);

		System.out.println("Ahora vamos a clonar el mapa original y mostrarlo por consola.");
		Map<String,Integer> agendaTelefonicaCopia = new HashMap<String,Integer>();
        agendaTelefonicaCopia.putAll(agendaTelefonica);
        System.out.println("Clon del mapa original");
        System.out.println(agendaTelefonicaCopia);
        
        System.out.println("Ahora vamos a comparar el mapa original y su clon para ver si son iguales");
        
        if (agendaTelefonica.equals(agendaTelefonicaCopia)) {
			System.out.println("Los mapas son iguales");
		} else {
			System.out.println("Los mapas no son iguales");
		}

        boolean estaVacio = agendaTelefonica.isEmpty();
        System.out.println("¿El mapa original está vacío? "+ ((estaVacio) ? "Si" : "No"));
        
        System.out.println("Ahora vamos a vaciar el mapa original y mostrarlo por consola");
        agendaTelefonica.clear();
		System.out.println(agendaTelefonica);		
		System.out.println("Tamaño del mapa original despues de haberlo vaciado: " + agendaTelefonica.size());
		estaVacio = agendaTelefonica.isEmpty();
        System.out.println("¿El mapa original está vacío? "+ ((estaVacio) ? "Si" : "No"));
		System.out.println("Ahora vamos a comparar el mapa original vaciado con su clon");
		        if (agendaTelefonica.equals(agendaTelefonicaCopia)) {
			System.out.println("Los mapas son iguales");
		} else {
			System.out.println("Los mapas no son iguales");
		}

}
}
