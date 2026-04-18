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

    /**
     * Escribe un método estático que dado un HashMap<String, Double> que representa nombres
     * de productos y sus precios. Usa el método forEach()
     * para imprimir un catálogo donde cada precio tenga un descuento del 10% en la impresión.
     */

    public static void modificadorDeInventario (HashMap<String, Double> inventario){
        if (inventario == null){
            System.out.println("null");
        }else if(inventario.isEmpty()){
            System.out.println("La lista esta vacia");
        }else{
            inventario.forEach((producto, precio) ->{
                double precioDescuento = precio * 0.9;

                System.out.println(producto + " a $" + precioDescuento);
            });
        }
    }


    /**
     * Escribe un método estático que toma un ArrayList<String> de palabras (con repeticiones).
     * Usa merge() o compute() con una lambda para construir un mapa de
     * frecuencias que muestre cuántas veces aparece cada palabra.
     */
    public static HashMap <String, Integer> contadorDeFrecuencias (ArrayList <String> lista){
        if (lista == null){
            return null;
        }

        HashMap<String, Integer> repeticiones = new HashMap<>();
        OperacionesTexto.convertirAMinusculas(lista);

        for (String c : lista){
            repeticiones.merge(c, 1, (valorViejo, nuevoValor) -> nuevoValor + valorViejo);
        }

        return repeticiones;

    }



}
