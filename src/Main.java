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

        ArrayList <Integer> numerosMultiplos = OperacionesNumericas.elMultiplicador(numerosAleatorios, multiplo);
        System.out.println("Lista multiplicada por " + multiplo + ": " + numerosMultiplos );

        //Caso numeros negativos y positivos
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(2, -3, 5, -6, 4));
        System.out.println("Lista original: " + numeros);
        numerosMultiplos.clear();
        numerosMultiplos = OperacionesNumericas.elMultiplicador(numeros, multiplo);
        System.out.println("Lista multiplicada por " + multiplo + ": " + numerosMultiplos );













    }

}


