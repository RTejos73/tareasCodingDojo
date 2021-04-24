// Ejercicio 1
// Tamaño Grande - Dado un array, escribe una función que cambie todos los números positivos en él, por el string “big”. Ejemplo: grande([-1,3,5,-5]) devuelve [-1, “big”, “big”, -5].
function positivos_por_texto(z) {
    for (var i = 0; i < z.length; i++) {
        if (z[i] >= 0) {
            z[i] = "big";
        }
    }
    console.log(z);
}
positivos_por_texto([-1, 3, 5, -5]);


// Ejercicio 2
// Imprime (print) el menor, devuelve (return) el mayor - Crea una función que tome un array de números. La función debería imprimir (print) el menor valor del array, y devolver (return) el mayor. 
function retorno1(z) {
    let menor = z[0];
    let mayor = z[0];
    for (var i = 0; i < z.length; i++) {
        if (z[i] < menor) {
            menor = z[i];
        }
        if (z[i] > mayor) {
            mayor = z[i];
        }
    }
    console.log("El numero menor es : " + menor);
    return mayor;
}
let elmayor = retorno1([3, 6, 1, 9, 7]);
console.log("El numero mayor es " + elmayor);


// Ejercicio 3
// Imprime (print) uno, devuelve (return) otro- Crea una función para un array de números. La función debería imprimir (print) el penúltimo valor y devolver (return) el primer valor impar.
function penultimo(a) {
    let largo = a.length;
    let impar = a[largo - 1];
    for (i = 0; i < a.length; i++) {
        if ((a[i] % 2) != 0) {
            if (a[i] < impar) {
                impar = a[i];
            }
        }
    }
    console.log(impar);
    return a[largo - 2];
}

let resul = penultimo([5, 2, , 3, 1, 4, 6, 7, 8, 9]);
console.log(resul);




// Ejercicio 4
// Doble Visión - Dado un array, crea una función que devuelva un nuevo array donde cada valor se duplique. Entonces, doble([1,2,3]) debiera devolver [2, 4, 6] sin cambiar el array original. 

function doble(z) {
    let arra2 = [];
    for (i = 0; i < z.length; i++) {
        arra2[i] = z[i] * 2;
    }
    console.log(arra2);
}
doble([1, 2, 3]);



// Ejercicio 5
// Contar Positivos -  Dado un array de números, crea una función para reemplazar el último valor con el número de valores positivos encontrados en el array. Ejemplo, contarPositivos([-1,1,1,1]) cambia el array original y devuelve [-1,1,1,3].

function contarPositivos(z) {
    let contar = 0;
    for (i = 0; i < z.length; i++) {
        if (z[i] > 0) {
            contar += 1;
        }
    }
    z[z.length - 1] = contar;
    console.log(z);
}
contarPositivos([-1, 1, 3, 2, 1, -1, 6]);


// Ejercicio 6
// Pares e Impares - Crea una función que acepte un array. Cada vez que ese array tenga 3 valores impares seguidos, imprime (print) “¡Qué imparcial!”, y cada vez que tenga 3 pares seguidos, imprime (print) “¡Es para bien!”.

function parImpar(z) {
    let par = 0, impar = 0;
    for (i = 0; i < z.length; i++) {
        if ((z[i] % 2) != 0) {
            impar += 1;
            par = 0;
            if (impar == 3) {
                console.log("¡Qué imparcial!");
            }
        }
        if ((z[i] % 2) == 0) {
            par += 1;
            impar = 0;
            if (par == 3) {
                console.log("¡Es para bien!");
            }
        }
    }
}
parImpar([2, 3, 5, 7, 6, 8, 12, 1, 3, 5]);



// Ejercicio 7
// Incrementa los Segundos - Dado un array de números arr, agrega 1 a cualquier otro elemento, específicamente a aquellos cuyo índice es impar (arr[1], arr[3], arr[5], etc). Luego, console.log cada valor del array y devuelve arr. 

function sumarAImpares(z) {

    for (a = 0; a < z.length; a++) {
        if (a % 2 != 0) {
            z[a] = z[a] + 1;
        }
        console.log(z[a]);
    }
    return z;

}
let retorno = sumarAImpares([4, 2, 7, 4, 9, 3, 6]);
console.log(retorno);



// Ejercicio 8
// Longitudes previas - Pasado un array (similar a decir ‘tomado un array’ o ‘dado un array’) que contiene strings, reemplaza cada string con un número de acuerdo cantidad de letras (longitud) del string anterior. Por ejemplo, longitudesPrevias([“programar”,“dojo”, “genial”]) debería devolver [“programar”,9, 4]. Pista: ¿For loops solo puede ir hacia adelante?

function longitudPrevia(a) {
    let contador = 0;
    for (i = a.length - 1; i >= 1; i--) {


        contador = a[i - 1].length;
        a[i] = contador;
    }

    console.log(a);
}

longitudPrevia(["programar", "dojo", "genial"]);




// Ejercicio 9
// Agrega Siete - Construye una función que acepte un array. Devuelve un nuevo array con todos los valores del original, pero sumando 7 a cada uno. No alteres el array original. Por ejemplo, agregaSiete([1,2,3) debería devolver [8,9,10] en un nuevo array. 

function agrega7(a) {
    let arr2 = [];
    for (i = 0; i < a.length; i++) {
        arr2[i] = a[i] + 7;
    }
    console.log(arr2);
}

agrega7([4, 5, 6]);





// Ejercicio 10
// Array Inverso - Dado un array, escribe una función que invierte sus valores en el lugar. Ejemplo: invertir([3,1,6,4,2)) devuelve el mismo array pero con sus valores al revés, es decir [2,4,6,1,3]. Haz esto sin crear un array temporal vacío. (Pista: necesitarás intercambiar (swap) valores).

function arrayInverso(a) {
    let aux1, aux2;
    let longitud = a.length;
    for (i = 0; i < longitud / 2; i++) {
        aux1 = a[i];
        aux2 = longitud - i - 1;
        a[i] = a[aux2];
        a[aux2] = aux1;
    }
    console.log(a);

}

arrayInverso([2, 4, 6, 1, 3]);




// Ejercicio 11
// Perspectiva: Negativa - Dado un array crear y devuelve uno nuevo que contenga todos los valores del array original, pero negativos (no simplemente multiplicando por -1). Dado [1,-3,5], devuelve [-1,-3,-5].

function negativos(z) {
    let arr = [];
    for (i = 0; i < z.length; i++) {
        if (z[i] > 0) {
            let a = z[i];
            let b = z[i] * 2;
            arr[i] = a - b;
        } else {
            arr[i] = z[i];
        }
    }
    console.log(arr);


}
negativos([1, -3, 5, 4, 6]);




// Ejercicio 12
// Siempre hambriento - Crea una función que acepte un array e imprima (print) “yummy” cada vez que alguno de los valores sea “comida”. Si ningún valor es “comida”, entonces imprime “tengo hambre” una vez. 

function hambriento(zx) {
    let conhambre = false;
    for (i = 0; i < zx.length; i++) {
        if (zx[i] == "comida") {
            console.log("yummy");
            conhambre = false;
        } else {
            conhambre = true;
        }
    }
    if (conhambre) {
        console.log("tengo hambre");
    }
}
hambriento(["tengo", "hambre", "quiero", "comida"]);




// Ejercicio 13
// Cambiar hacia el centro -  Dado un array, cambia el primer y último valor, el tercero con el ante penútimo, etc. Ejemplo: cambiaHaciaElCentro([true, 42, “Ada”, 2, “pizza”]) cambia el array a [“pizza¨, 42, “Ada”, 2, true]. cambiaHaciaElCentro([1,2,3,4,5,6]) cambia el array a [6,2,4,3,5,1]. No es necesario devolver (return) el array esta vez.

function cambiaHaciaElCentro(array1) {
    let aux = [];
    let ultpos = array1.length - 1;
    let actpos = 0, ini, fin;
    for (i = 0; i < array1.length / 2; i++) {
        if (i % 2 == 0) {
            ini = array1[i];
            fin = array1[ultpos - i];
            array1[ultpos - i] = ini;
            array1[i] = fin;
        }
    }
    console.log(array1);
}

cambiaHaciaElCentro([true, 42, "Ada", 2, "pizza"]);
cambiaHaciaElCentro([1, 2, 3, 4, 5, 6]);



// Ejercicio 14
// Escala el Array - Dado un array arr y un número num, multiplica todos los valores en el array arr por el número num, y devuelve el array arr modificado. Por ejemplo, escalaArray([1,2,3], 3] debería devolver [3,6,9].
function escalaArray(arr2, multi) {
    let arr = [];
    for (i = 0; i < arr2.length; i++) {
        arr[i] = arr2[i] * multi;
    }
    console.log(arr);

}
escalaArray([1, 2, 3], 3);