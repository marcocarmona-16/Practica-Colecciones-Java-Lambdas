import java.util.*;


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


}
