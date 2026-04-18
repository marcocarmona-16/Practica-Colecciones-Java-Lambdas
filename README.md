# Práctica: Colecciones en Java con Lambdas

## Descripción

Este proyecto implementa 10 métodos estáticos en Java para manipular colecciones como ArrayList, HashSet y HashMap,
utilizando expresiones lambda y streams para un uso de código más eficiente y estructurado.

Se trabajan operaciones como filtrado, transformación, conteo de frecuencias y manejo de datos en estructuras dinámicas.

### Métodos Implementados
elMultiplicador → Multiplica cada elemento de una lista por un valor dado.

cuadradosUnicos → Calcula los cuadrados de una lista y elimina duplicados.

filtroSelectivo → Filtra cadenas por longitud e inicial.

convertidorDeMayusculas → Convierte cadenas a mayúsculas.

convertirAMinusculas → Convierte cadenas a minúsculas.

mapaDeLongitudes → Relaciona cada palabra con su longitud usando HashMap.

modificadorDeInventario → Aplica un descuento del 10% a los precios.

contadorDeFrecuencias → Cuenta repeticiones de palabras.

clasificadorDePalabras → Filtra palabras según su frecuencia.

deduplicacionDePalabras → Elimina duplicados y filtra por longitud.

topeDeFrecuencias → Limita frecuencias a un valor máximo dado.

## Ejecución

Compilar:

javac Main.java

Ejecutar:

java Main
Casos de prueba

El programa incluye:

Casos normales
Listas vacías
Valores null

## Ejemplo de salida
===== EL MULTIPLICADOR =====

Lista original (Aleatorios): [83, 84, 85, 77, 64]

Ingrese el numero del multiplicador: 

3
Lista multiplicada por 3: [249, 252, 255, 231, 192]


Lista original: [2, -3, 5, -6, 4]

Lista multiplicada por 3: [6, -9, 15, -18, 12]


===== CONTADOR DE FRECUENCIAS =====

Lista original: [Pepe, Pecas, pica, papas, con, un, pico, Pica, paPas, pepe, pecas]

Mapa de repeticiones: {pico=1, con=1, pica=2, un=1, papas=2, pecas=2, pepe=2}


Lista original: []

Mapa de repeticiones: {}


Lista original: null

Mapa de repeticiones: null


## Autor 
Marco Carmona
