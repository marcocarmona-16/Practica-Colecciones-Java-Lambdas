/**
 * @Autor (Marco Antonio Carmona Lucero)
 * @Version (15 Marzo 2026)
 */

import java.util.*;

public class Main{
    public static void main (String[] args){

        // ------------------------Pruebas del multiplicador-----------------------------------------
        ArrayList<Integer> numerosAleatorios = OperacionesNumericas.generarNumerosAleatorios();
        System.out.println("Lista original (Aleatorios): " + numerosAleatorios);

        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese el numero del multiplicador: ");
        int multiplo = scn.nextInt();
        //Limpiar buffer
        scn.nextLine();

        ArrayList <Integer> numerosMultiplos = OperacionesNumericas.elMultiplicador(numerosAleatorios, multiplo);
        System.out.println("Lista multiplicada por " + multiplo + ": " + numerosMultiplos );

        //Caso numeros negativos y positivos
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(2, -3, 5, -6, 4));
        System.out.println("Lista original: " + numeros);
        numerosMultiplos.clear();
        numerosMultiplos = OperacionesNumericas.elMultiplicador(numeros, multiplo);
        System.out.println("Lista multiplicada por " + multiplo + ": " + numerosMultiplos );

        // ----------------------Pruebas del filtro selectivo-----------------------
        ArrayList<String> cadenas = new ArrayList<>(Arrays.asList("Coco", "Manzana", "Naranja", "Pera"));
        System.out.println("Lista original: " + cadenas);
        System.out.println("Ingrese la inicial que desea borrar: ");
        String input = scn.nextLine();
        input = input.toLowerCase();
        System.out.println("Ingrese la longitud minima de la palabra: ");
        int longitudMin = scn.nextInt();
        //Limpiar el buffer
        scn.nextLine();

        ArrayList<String> cadenasModificada = OperacionesTexto.elFiltroSelectivo(cadenas, longitudMin, input);
        System.out.println("Lista filtrada: " + cadenasModificada);

        //Caso lista vacia
        cadenas.clear();
        System.out.println("La lista original: " + cadenas);
        cadenasModificada = OperacionesTexto.elFiltroSelectivo(cadenas, longitudMin, input);
        System.out.println("Lista filtrada: " + cadenasModificada);

        //Caso lista null
        cadenas.clear();
        cadenas = null;
        System.out.println("La lista original: " + cadenas);
        cadenasModificada = OperacionesTexto.elFiltroSelectivo(cadenas, longitudMin, input);
        System.out.println("Lista filtrada: " + cadenasModificada);



        //------------------------------------Conversor de Mayusculas-------------------------

        cadenas.clear();
        cadenas = new ArrayList<>(Arrays.asList("pepe", "juan", "maria", "cecy", "roberto"));

        System.out.println("Lista original: " + cadenas);
        ArrayList<String> cadenasMayusculas = OperacionesTexto.convertidorDeMayusculas(cadenas);
        System.out.println("Lista en mayusculas: " + cadenasMayusculas);

        //Caso lista vacia
        cadenas.clear();
        cadenasMayusculas = OperacionesTexto.convertidorDeMayusculas(cadenas);
        System.out.println("Lista en mayusculas: ");

        //Caso lista null
        cadenas = null;
        System.out.println("Lista original: " + cadenas);
        cadenasMayusculas = OperacionesTexto.convertidorDeMayusculas(cadenas);
        System.out.println("Lista en mayusculas: " + cadenasMayusculas);






    }

}


