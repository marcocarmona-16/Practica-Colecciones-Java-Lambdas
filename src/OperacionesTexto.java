import java.lang.reflect.Array;
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


    /**
     * Escribe un método estático que dado un HashMap<String, Integer> de palabras y sus frecuencias,
     * usa entrySet().stream() para filtrar a las palabras con frecuencia inferior a un valor dado y guarda solo
     * las palabras que cumplen con el criterio en un ArrayList.
     */
    public static ArrayList<String> clasificadorDePalabras (HashMap<String, Integer> repeticiones, int numRepeticiones){
        if (repeticiones == null){
            return null;
        }

        ArrayList <String> nuevaLista = new ArrayList<>(repeticiones.entrySet().stream()
                .filter(palabra -> palabra.getValue() < numRepeticiones )
                .map(palabra -> palabra.getKey())
                .collect(Collectors.toCollection(ArrayList::new)));

        return nuevaLista;
    }


    /**
     * Escribe un método estático que toma una frase larga, dividela en un array de palabras
     * y usa un stream con lambdas para filtrar las palabras de menos de N letras,
     * convertirlas a minúsculas y guardarlas en un HashSet para asegurar que no haya repetidas.
     */
    public static HashSet <String> deduplicacionDePalabras (String frase, int longitud){
        if (frase == null){
            return null;
        }

        frase = frase.toLowerCase();

        //Dividimos la frase en un arrayList
        ArrayList<String> fraseDividida = Arrays.stream(frase.split("[,\\s]+")).collect(Collectors.toCollection(ArrayList::new));


        //Convertimos el arrayList en un HashSet
        HashSet<String> fraseDivididaSinDuplicados = new HashSet<>(fraseDividida.stream()
                .filter(s -> s.length() < longitud)
                .collect(Collectors.toSet()));

        return fraseDivididaSinDuplicados;

    }

    /**
     * Escribe un método estático que dado un HashMap<String, Integer> de palabras y frecuencias,
     * usa replaceAll() para limitar todas las frecuencias a un máximo de N.
     * Si una frecuencia es mayor a N, debe fijarse exactamente en N mediante una lambda
     *
     * @param listaPalabras
     * @param frecuenciasMax
     */

    public static void topeDeFrecuencias (HashMap<String, Integer> listaPalabras, int frecuenciasMax){

        if(listaPalabras == null){
            return;
        }

        listaPalabras.replaceAll((palabra, frecuencia) -> {
            if (frecuencia > frecuenciasMax){
                return frecuenciasMax;
            }else{
                return frecuencia;
            }
        });
    }


}
