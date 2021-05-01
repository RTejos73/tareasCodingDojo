function enviar() {
    var fecha = new Date();
    var anoactual = fecha.getFullYear();
    var naci = parseInt(document.getElementById('nacimiento').value);
    var naci2 = parseInt(document.getElementById('nacimiento2').value);
    var difer = anoactual - naci;
    var difer2 = anoactual - naci2;

    var datos = document.getElementById('nombre').value;

    document.getElementById('entrada').innerText += " " + datos;
    document.getElementById('datos').innerText += difer + " años" + " y " + difer2;
    document.getElementById('nombre').focus;
    // document.getElementById('mostrar').style.display = "block";

}