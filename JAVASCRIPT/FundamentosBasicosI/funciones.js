//Ejercicio 1
//Obtén del 1 al 255: Escribe una función que devuelve un array con todos los números del 1 al 255.
// function imprimede1a255() {
//     for (i = 1; i <= 255; i++) {
//         console.log(i);
//     }
// }
// imprimede1a255();



// Ejercicio 2
// Consigue pares hasta 1000: Escribe una función que entregue la suma de todos los números pares del 1 al 1000 - Puedes usar un operador de módulo para este ejercicio. 
// function paresHasta1000(z) {
//     for (i = 2; i <= z; i++) {
//         console.log(i);
//         i++;
//     }
// }
// paresHasta1000(100);



// Ejercicio 3
// Suma impares hasta 5000: Escribe una función que devuelva la suma de todos los números impares entre 1 y 5000 (ej: 1+3+5+...+4997+4999).
// function imprimeImpares(x) {
//     let suma = 0, impares = 0;
//     for (i = 1; i <= x; i++) {
//         suma += i;
//         i++;
//     }
//     return suma;
// }

// impares = imprimeImpares(50);
// console.log(impares);


// Ejercicio 4
// Itera un array: Escribe una función que devuelva la suma de todos los valores dentro de un array (ej:  [1,2,5] retorna 8. [-5,2,5,12] retorna 14). 
// function sumaArray(a) {
//     let suma = 0;
//     for (i = 0; i < a.length; i++) {
//         suma += a[i];
//     }
//     console.log(suma);

// }
// sumaArray([-5, 2, 5, 12]);


// Ejercicio 5
// Encuentra el mayor (max): Dado un array con múltiples valores, escribe una función que devuelva el número mayor (ej: para [-3,3,5,7] el número mayor (max) es 7). 

// function numeroMayor(x) {
//     let mayor = 0;
//     if ((x) === 0) {
//         console.log("arreglo vacio");
//     } else {
//         let mayor = x[0];
//         for (i = 0; i < x.length; i++) {
//             if (x[i] > mayor) {
//                 mayor = x[i];
//             }
//         }
//         console.log(mayor);
//     }
// }
// numeroMayor([-3, 3, 5, 7, 9]);


// Ejercicio 6
//Encuentra el promedio (avg): Dado un array con múltiples valores, escribe una función que devuelva el promedio de los valores (ej: para [1,3,5,7,20] el promedio es 7.2).
// function promedio(a) {
//     let suma = 0;
//     for (i = 0; i < a.length; i++) {
//         suma += a[i];
//     }
//     console.log("El promedio es: " + (suma / a.length));
// }
// promedio([1, 3, 5, 7, 20]);


// Ejercicio 7
// Array de impares: Escribe una función que devuelva un array de todos los números impares entre 1 y 50 (ej: [1,3,5, …, 47,49]). Pista: Usa el método ‘push’.
// function impares(z) {
//     let impar = [];
//     for (i = 1; i <= z; i += 2) {
//         impar.push(i);
//         // i++;
//     }
//     console.log(impar);
// }
// impares(50);


// Ejercicio 8
// Mayor que Y: Dado un valor Y, escribe una función que toma un array y devuelve los valores mayores que Y. Por ejemplo, si arr = [1,3,5,7] y Y = 3, tu función devolverá 2 (hay 2 números en el array mayores que 3, esto son 5 y 7). 
// function mayorQueY(x, y) {
//     let arr = [];
//     for (i = 0; i < x.length; i++) {
//         if (x[i] > y) {
//             // mayor = x[i];
//             console.log(x[i]);
//         }
//     }

// }
// mayorQueY([1, 3, 5, 7], 3)



// Ejercicio 9
// Cuadrados: Dado un array con múltiples valores, escribe una función que reemplace cada valor por el cuadrado del mismo valor (ej: [1,5,10,-2] será [1,25,100,4]).

// function remplazarporCuadrado(z) {
//     for (i = 0; i < z.length; i++) {
//         z[i] = z[i] * z[i];
//     }
//     console.log(z);
// }
// console.log(remplazarporCuadrado([1, 5, 100, 4]));



// Ejercicio 10
// Negativos: Dado un array con múltiples valores, escribe una función que reemplace cualquier número negativo dentro del array por 0. Cuando el programa esté listo, el array no debiera contener números negativos (ej: [1,5,10,-2] se convertirá en [1,5,10,0]).
// function remplazaNegativos(z) {
//     for (i = 0; i < z.length; i++) {
//         if (z[i] < 0) {
//             z[i] = 0;
//         }
//     }
//     console.log(z)
// }

// console.log(remplazaNegativos([1, 5, 10, -2]));




// EJercicio 11
// Max/Min/Avg: Dado un array con múltiples valores, escribe una función que devuelva un nuevo array que solo contenga el valor mayor (max), menor (min) y promedio (avg) del array original (ej: [1,5,10,-2] devolverá [10,-2,3.5]).
// function nuevoArr(x) {
//     let mayor = 0, menor = x[0], suma = 0;
//     let arr2 = [];
//     for (i = 0; i < x.length; i++) {
//         if (x[i] > mayor) {
//             mayor = x[i];
//         } else if (x[i] < menor) {
//             menor = x[i];
//         }
//         suma += x[i];
//     }
//     arr2.push(mayor);
//     arr2.push(menor);
//     arr2.push(suma / x.length);
//     console.log(arr2);
// }
// nuevoArr([1, 5, 10, -2]);


// Ejercicio 12
// Intercambia Valores: Escribe una función que intercambie el primer y el último valor de cualquier array. La extensión mínima predeterminada del array es 2 (ej: [1,5,10,-2] será [-2,5,10,1]). 
// function intercambiarValores(z) {
//     aux = [];
//     if (z.length < 2) {
//         console.log("La extesion minima debe ser de 2 numeros");
//         return;
//     } else {
//         aux = z[0];
//         z[0] = z[z.length - 1];
//         z[z.length - 1] = aux;
//     }
//     console.log(z);
// }
// intercambiarValores([1, 5, 10, -2]);



// Ejercicio 13
// De Número a String: Escribe una función que tome un array de números y reemplace cualquier valor negativo por el string ‘Dojo’. Por ejemplo, dado el array = [-1,-3,2], tu función devolverá [‘Dojo’,‘Dojo’,2].
function remplazaporDojo(z) {
    for (i = 0; i < z.length; i++) {
        if (z[i] < 0) {
            z[i] = "Dojo";
        }
    }
    console.log(z);
}
remplazaporDojo([-1, -4, 2]);