import java.util.*;
import java.util.Map;
import java.util.Map.Entry;

public class AgendaTelefonica {

	public static void main(String[] args) {

		Map<String, Integer> agenda_Telefonica = new HashMap<>();

		agenda_Telefonica.put("Carlos", 4443321);
		agenda_Telefonica.put("Gerardo", 4443322);
		agenda_Telefonica.put("Daniela", 4443323);
		agenda_Telefonica.put("Sandra", 4443324);
		agenda_Telefonica.put("Osvaldo", 4443329);
		agenda_Telefonica.put("Santiago", 4443330);

		System.out.println(agenda_Telefonica);

		int tamano = agenda_Telefonica.size();
		System.out.println("Tamaño del mapa : " + tamano);

		Integer telefono = agenda_Telefonica.get("Carlos");
		System.out.println("Telefono de Carlos es : " + telefono);

		if (agenda_Telefonica.containsKey("Gerardo")) {

			System.out.println("El telefono de este contacto es:  " + agenda_Telefonica.get("Gerardo"));
		} else {
			System.out.println("el contacto no existe");

		}

		if (agenda_Telefonica.containsKey("Mariano")) {

			System.out.println("El telefono de este contacto es:  " + agenda_Telefonica.get("Mariano"));
		
		System.out.print("El contacto no existe ");

		if (agenda_Telefonica.containsValue(778788));
		
		System.out.print("El contacto existe ");
		}else {
			System.out.print("El contacto no existe ");	
		
			
		
		
		
		// clonar el mapa

		 Map<String, Integer> agenda_TelefonicaCopy = new HashMap<>();
		 
		
		// Set<Entry<String,String>> set = map.entrySet();

		
	// vaciar mapa
		agenda_Telefonica.clear();

		
		//Mostrar el mapa vacio
		
		System.out.println("Agenda telefonica despues de haberla vaciado: \n" + agenda_Telefonica);
		
		//Mostrar el tamaño del mapa
		
		System.out.println("Tamaño de la agenda telefonica despues de haberla vaciado: " + agenda_Telefonica.size());

	}
}
}
