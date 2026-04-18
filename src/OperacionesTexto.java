import java.util.*;
import java.util.stream.Collectors;

public class OperacionesTexto {


    /**
     * Escribe un método estático que dado un ArrayList<String>,
     * utiliza el método removeIf() para eliminar todas
     * las cadenas que comiencen con una letra que recibe
     * como parámetro o que tengan una longitud menor a N caracteres.
     */
    public static ArrayList<String> elFiltroSelectivo (ArrayList <String> cadenas, int longitudMinima, String inicialABorrar){
        if (cadenas == null){
            return null;
        }
        cadenas = OperacionesTexto.convertirAMinusculas(cadenas);
        cadenas.removeIf(cadena -> cadena.startsWith(inicialABorrar) || cadena.length() < longitudMinima );

        return cadenas;
    }


    public static ArrayList<String> convertirAMinusculas (ArrayList<String> cadenas){
        cadenas.replaceAll(String::toLowerCase);

        return cadenas;
    }

    /**
     * Escribe un método estático que convierte una lista de
     * palabras a mayúsculas usando Stream y map(), y luego recolecta los
     * resultados en un nuevo ArrayList y lo regresa.
     *
     * @param cadenas
     * @return
     */


    public static ArrayList <String> convertidorDeMayusculas (ArrayList<String> cadenas){
        if(cadenas == null){
            return null;
        }

        ArrayList <String> cadenasMayus = new ArrayList(cadenas.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()));

        return cadenasMayus;
    }


    /**
     * Escribe un método estático que dado un ArrayList<String> de palabras,
     * utiliza Collectors.toMap() para crear un HashMap<String,
     * Integer> donde la clave sea la palabra y el valor sea su longitud.
     */
    public static HashMap<String, Integer> mapaDeLongitudes (ArrayList<String>cadenas){
        if(cadenas == null){
            return null;
        }

        //elimina duplicados para evitar errores
        HashMap<String, Integer> mapaLongitudes = new HashMap<>(cadenas.stream()
                .distinct()
                .collect(Collectors.toMap(s -> s, s -> s.length())));


        return mapaLongitudes;
    }


}
