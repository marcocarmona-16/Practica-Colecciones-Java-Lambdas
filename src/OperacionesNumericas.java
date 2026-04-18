import java.util.*;
import java.util.stream.Collectors;


class OperacionesNumericas {
     /**
      * Este metodo se encarga de rellenar el arrayList de 5 numeros generados aleatoriamente
      * @return
      */
    public static ArrayList<Integer> generarNumerosAleatorios(){
        Random rnd = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0 ; i < 5 ; i++){
            numeros.add(rnd.nextInt(101));
        }

        return numeros;
    }



     /**
      * Escribe un método statico que dado un ArrayList<Integer>, utiliza el método replaceAll()
      *  y una expresión lambda para multiplicar cada número de la lista por un factor que recibe.
      */
     public static ArrayList<Integer> elMultiplicador (ArrayList <Integer> numeros, int multiplo){
         numeros.replaceAll(n -> n * multiplo);

         return numeros;
     }

     /**
      * Escribe un método estático que dado
      * un ArrayList<Integer> que contiene duplicados,
      * crea un HashSet que contenga únicamente los cuadrados de los números pares únicos de la lista original.
      */
     public static HashSet <Integer> cuadradosUnicos (ArrayList<Integer> numeros){

         if (numeros == null){
             return null;
         }

         HashSet<Integer> numerosAlCuadrado = new HashSet <>(numeros.stream()
                 .distinct()
                 .map(n -> n * n )
                 .collect(Collectors.toSet()));

         return numerosAlCuadrado;
     }

}
