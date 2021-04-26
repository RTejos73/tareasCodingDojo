// Ejercicio 1
// Sigma - Implementa una funcion sigma(sum) que, dado un numero, devuelve la suma de todos los enteros positivos (incluyento el numero dado) Ej: sigma(3) = (1+2+3); sigma(5) = (1+2+3+4+5).
function sigma(q) {
    let parcial = 0;
    for (let i = 1; i <= q; i++) {
        parcial += i;
    }
    console.log("Suma total : " + parcial);
}
sigma([5]);


//Ejercicio 2
// Factorial - Escribe una funcion factorial)num) que, dado un numero, devuelva el producto (multiplicaion) de todos los enteros positivos (incluyendo el numero dado). Ej: factorial(3) = 6(1*2*3); factorial(5) = 120(1*2*3*4*5)
function factorial(a) {
    let parcial = 1;
    for (let i = 1; i <= a; i++) {
        parcial *= i;
    }
    console.log("Factorial es : " + parcial);

}
factorial(5);



// Ejercicio 3
// Fibonacci - Crea una función para generar números de Fibonacci. En esta famosa secuencia matemática, cada número es la suma de las dos anteriores, partiendo con los valores 0 y 1. Tu función debería aceptar un argumento, un índice en la secuencia (donde 0 corresponde al valor inicial, 4 corresponden al valor cuatro más tarde, etc). Ejemplos: fibonacci(0) = 0 (dado), fibonacci(1) = 1 (dado), fibonacci(2) = 1 (fib(0)+fib(1), o 0+1), fibonacci(3) = 2 (fib(1) + fib(2)3, o 1+1), fibonacci(4) = 3 (1+2), fibonacci(5) = 5 (2+3), fibonacci(6) = 8 (3+5), fibonacci(7) = 13 (5+8). Haz esto primero sin usar recursión. Si no sabes qué es una recursión, no te preocupes puesto que vamos a introducir este concepto en la Parte 2 de esta actividad. 
function fibonacci(numeros) {
    let num = [0, 1];
    for (let i = 2; i < numeros; i++) {
        num[i] = num[i - 2] + num[i - 1];
    }
    console.log(num);

}
fibonacci(10);



// Ejercicio 4
// Array : Penutimo -  Devuelve el penúltimo elemento del array. Dado [42,true,4,”Liam”, 7] devuelve “Liam”. Si el array es muy pequeño, devuelve null.  

function penultimo(a) {
    if (a.length < 2) {
        console.log("array  uy pequeño");
    } else {
        console.log(a[a.length - 2]);
    }

}
penultimo([true, 42, false, "array", 0]);



// Ejercicio 5
// Array 'N' ultimo -  Devuelve el elemento “N” último. Dado ([5,2,3,6,4,9,7],3], devuelve 6. Si el array es muy pequeño, devuelve null. 
function nUltimo(arr5, b) {
    return arr5[arr5.length - 1 - b];


}

let ult = nUltimo([5, 2, 3, 6, 4, 9, 7], 3);
console.log(ult);

// Ejercicio 6
// Array: segundo mas grande - Devuelve el segundo elemento más grande de un array. Dado [42,1,4,3.14,7], devuelve 7.  Si el array es muy pequeño, devuelve null.
function segundoMasGrande(gde) {

    let arr2 = gde.sort((a, b) => {
        return a - b
    });
    console.log(arr2[arr2.length - 2]);


}
segundoMasGrande([42, 1, 4, 3.14, 7]);


// Ejercicio 7
// Doble problema par - Crea una función que cambie un array dado duplicando cada uno de sus elementos en una posición par, y manteniendo el orden original. Convierte [4, "Ulysses", 42, false]   a    [4,4, "Ulysses", "Ulysses", 42, 42, false, false].
function conviertaPar(ab) {
    for (i = 0; i < ab.length; i++) {
        ab.splice(i + 1, 0, ab[i]);
        i++;
    }
    console.log(ab);
}

conviertaPar([4, "Ulysses", 42, false]);