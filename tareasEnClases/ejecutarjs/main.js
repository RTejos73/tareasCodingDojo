class Persona{
    nombre;
    apellido;
    ciudad;
    edad;
    pais;
    hijo;

    constructor(nombre,apellido,edad,ciudad,pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ciudad = ciudad;
        this.pais = pais;
       
    }
}


// var Rene = new Persona("René","Tejos",27,"Hualpén","Chile");
// var Cristian = new Persona("Cristian", "Roa", 31,"Villarrica","Chile");
// var test = new Persona("juanito", "Perez", 31,"Villarrica","Chile");
// var nuevo =  new Persona("juanito", "Perez", 31,"Villarrica","Chile");

var personas = [];

function IngresarPersona(){
    var nombre = document.getElementById('imputNane').value;
    var apellido = document.getElementById('imputApellido').value;
    var edad = document.getElementById('imputEdad').value;
    var ciudad = document.getElementById('imputCiudad').value;
    var pais = document.getElementById('imputPais').value;
    var nuevaPersona = new Persona(nombre,apellido,edad,ciudad,pais);
    personas.push(nuevaPersona);
    cargarTabla();
}


function cargarTabla(){
    var totalFilas= "";
    for(var i=0;i<personas.length;i++){
        var fila = "<tr >";
        fila += "<th>"+ personas[i].nombre +"</th>";
        fila += "<td>"+ personas[i].apellido +"</td>";
        fila += "<td>"+ personas[i].edad +"</td>";
        fila += "<td>"+ personas[i].ciudad +"</td>";
        fila += "<td><button type='button' class='btn btn-danger' onclick=\"eliminar(\'"+i+"\')\" >Eliminar</button><button type='button' class='btn btn-info' onclick=\"editar(\'"+i+"\')\" >Editar</button></td>";
        fila += "</tr>";
        totalFilas += fila;
    }
   document.getElementById('datos').innerHTML = totalFilas;
}

function eliminar(index){
    personas.splice(index, 1);
    cargarTabla();
}

