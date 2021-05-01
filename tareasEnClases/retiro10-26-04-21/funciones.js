
const volver1 = document.getElementById('volver');
const elRut1 = document.getElementById('rut1');
const valorRut = document.getElementById('rut1');

// elRut1.addEventListener("focusout", valrut(valorRut));





function retMaximo() {
    const primero = document.getElementById('primerpanel');
    const segundo = document.getElementById('segundopanel');
    const elrut = document.getElementById('rut');
    if (segundo.style.display === 'none') {
        primero.style.display = 'none';
        segundo.style.display = "block";
        elrut.focus;
    } else {
        segundo.style.display = 'none'
        primero.style.display = 'block';
    }
}

function volver() {
    const primero = document.getElementById('primerpanel');
    const segundo = document.getElementById('segundopanel');
    if (primero.style.display === 'none') {
        segundo.style.display = 'none';
        primero.style.display = 'block';

    }
}







function valrut(objeto) {
    var i, s, f, bueno;
    f = "32765432";
    //r = objeto.value;
    largo = objeto.length - 1;
    bueno = false;
    s = 0;
    for (i = 0; i < largo; i++) {
        s = s + (parseInt(objeto.charAt(i)) * parseInt(f.charAt(i)));
    }
    dv = 11 - (s % 11);
    if (dv == 10 && (objeto.charAt(8) == 'K' || r.charAt(8) == 'k')) {
        bueno = true;
    } else {
        if (dv == 11 && objeto.charAt(8) == '0') {
            bueno = true;
        } else {
            if (dv == parseInt(objeto.charAt(8))) {
                bueno = true;
            } else {
                alert("RUT Incorrecto...");
                objeto.focus();
                bueno = false;
            }
        }
    }
    return bueno;
}
valrut("123350944");
