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

    public static ArrayList <String> convertidorDeMayusculas (ArrayList<String> cadenas){
        if(cadenas == null){
            return null;
        }

        ArrayList <String> cadenasMayus = new ArrayList(cadenas.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()));

        return cadenasMayus;
    }



}
