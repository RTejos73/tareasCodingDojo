let user = [
    {
        name: "Michael",
        age: 37
    },
    {
        name: "John",
        age: 30
    },
    {
        name: "David",
        age: 27
    }
];

//1 ¿Cómo harías print/log de la edad de John?

function buscarJohn() {
    for (i = 0; i < user.length; i++) {
        if (user[i].name == "John") {
            console.log(user[i].age);
        }
    }
}

buscarJohn();




//2 ¿Cómo harías print/log del nombre del primer objeto?
console.log(user[0].name);



//3 ¿Cómo harías print/log del nombre y la edad de cada usuario utilizando un for loop? Tu output debería verse algo como esto
for (i = 0; i < user.length; i++) {
    console.log(user[i].name);
    console.log(user[i].age);

}



//4 ¿Cómo harías para imprimir el nombre de los mayores de edad?
function mayoresEdad() {
    for (i = 0; i < user.length; i++) {
        if (user[i].age > 21) {
            console.log(user[i].name);
        }
    }

}
mayoresEdad();