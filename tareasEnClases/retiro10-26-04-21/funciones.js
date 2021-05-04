
const volver1 = document.getElementById('volver');


let cuentaRut = document.getElementById('ctarut');
console.log(escuchador);

function ctaRut() {

}

function retMaximo() {
    const primero = document.getElementById('primerpanel');
    const segundo = document.getElementById('segundopanel');
    const elrut = document.getElementById('rut');
    if (segundo.style.display === 'none') {
        primero.style.display = 'none';
        segundo.style.display = "block";
        document.getElementById('rut1').focus();
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

function avanza1() {
    if (document.getElementById('segundopanel').style.display === 'block') {
        document.getElementById('segundopanel').style.display = 'none';
        document.getElementById('tercerpanel').style.display = 'block';

    }


}



function validaEmail1() {

    var elEmail1 = document.getElementById('mail1').value;
    var elEmail2 = document.getElementById('mail2').valule;

    var em1 = document.getElementById('mail1');

    // let em2 = em1.value;
    let mail = false;
    if (em1.value != "") {

        if (/^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i.test(em1.value)) {
            mail = true;
        }

        if (mail) {

            document.getElementById('mail1').style = "border-color: Green; color: Green";
            document.getElementById('email1').style = "color: Green";
            document.getElementById('email1').innerHTML = "Email correcto"
            document.getElementById('mail2').focus();

        } else {

            document.getElementById('mail1').style = "border-color: Red; color: Red";
            document.getElementById('email1').style = "color: Red";
            document.getElementById('email1').innerHTML = "Email Incorrecto"
            document.getElementById('mail1').focus();
            document.getElementById('mail1').select();

        }
    } else {
        document.getElementById('mail1').style = "border-color: Red; color: Red";
        document.getElementById('email1').style = "color: Red";
        document.getElementById('email1').innerHTML = "Email Vacio, complete con uno valido"
        document.getElementById('mail1').focus();
        // document.getElementById('mail1').select();

    }

    return mail;
}

function validaEmail2() {
    var elEmail1 = document.getElementById('mail1').value;
    var elEmail2 = document.getElementById('mail2').valule;

    var em2 = document.getElementById('mail2');

    // let em2 = em1.value;
    let mail = false;
    if (em2.value != "") {


        if (/^[-\w.%+]{1,64}@(?:[A-Z0-9-]{1,63}\.){1,125}[A-Z]{2,63}$/i.test(em2.value)) {
            mail = true;
        }

        if (mail) {

            document.getElementById('mail2').style = "border-color: Green; color: Green";
            document.getElementById('email2').style = "color: Green";
            document.getElementById('email2').innerHTML = "Email correcto"
            document.getElementById('fono1').focus();

        } else {
            document.getElementById('mail1').style = "border-color: Red; color: Red";
            document.getElementById('email1').style = "color: Red";
            document.getElementById('email1').innerHTML = "Email Incorrecto"
            document.getElementById('mail1').focus();
            document.getElementById('mail1').select();

        }
        if (elEmail1 != em2.value) {

            document.getElementById('mail2').style = "border-color: Red; color: Red";
            document.getElementById('email2').style = "color: Red";
            document.getElementById('email2').innerHTML = "Email No Coinciden"
            document.getElementById('mail1').style = "border-color: Red; color: Red";
            document.getElementById('email1').style = "color: Red";
            document.getElementById('email1').innerHTML = "Email No Coinciden"
            document.getElementById('mail1').focus();
            document.getElementById('mail1').select();

        }
    } else {
        document.getElementById('mail2').style = "border-color: Red; color: Red";
        document.getElementById('email2').style = "color: Red";
        document.getElementById('email2').innerHTML = "Email vacio, complete con uno valido"
        document.getElementById('mail2').focus();
        // document.getElementById('mail2').select();
    }
    return mail;
}





function valrut() {
    let rut = document.getElementById('rut1');
    let revision = /^(\d{1,3}(?:\d{1,3}){2}[\dkK])$/mi.test(rut.value);
    if (revision) {
        // return false;

        var i, s, f, j = 7, bueno;
        f = "32765432";
        //r = objeto.value;
        largo = rut.value.length - 1;
        bueno = false;
        s = 0;
        for (i = largo; i > 0; i--) {
            s = s + (parseInt(rut.value.charAt(i - 1)) * parseInt(f.charAt(j)));
            j--;
        }
        dv = 11 - (s % 11);
        if (dv == 10 && (rut.value.charAt(largo) == 'K' || rut.value.charAt(largo) == 'k')) {
            bueno = true;
        } else {
            if (dv == 11 && rut.value.charAt(largo) == '0') {
                bueno = true;
            } else {
                if (dv == parseInt(rut.value.charAt(largo))) {

                    bueno = true;
                } else {

                    bueno = false;
                }
            }
        }
    }
    if (bueno) {
        document.getElementById('rut').innerHTML = 'Rut Correcto'
        document.getElementById('rut').style = 'color: Green';
        document.getElementById('rut1').style = "border-color: Green";
        document.getElementById('serie1').focus();

    } else {
        document.getElementById('rut').innerHTML = 'Rut Incorrecto';
        document.getElementById('rut1').style = "border-color: Red; color:Red";
        document.getElementById('rut1').focus();
        document.getElementById('rut1').select();
    }

    return bueno;
}

function validaDocumento() {
    let docu1 = document.getElementById('serie1').value;
    let docu2 = document.getElementById('serie2').value;
    if (docu1 != docu2) {
        document.getElementById('doc1').style = "border-color: Red; color:Red";
        document.getElementById('doc2').style = "border-color: Red; color:Red";
        document.getElementById('doc1').innerHTML = 'Documentos no coinciden';
        document.getElementById('doc2').innerHTML = 'Documentos no coinciden';
        document.getElementById('serie2').innerHTML = '';
        document.getElementById('serie1').focus();
        document.getElementById('serie1').select();
    } else {
        document.getElementById('doc1').style = "border-color: Green; color:Green";
        document.getElementById('doc2').style = "border-color: Green; color:Green";
        document.getElementById('doc1').innerHTML = 'Documento Correcto';
        document.getElementById('doc2').innerHTML = 'Documento Correcto';
        document.getElementById('mail1').focus();
    }


}


function validaFono() {

    let fon1 = document.getElementById('fono1').value;
    let fon2 = document.getElementById('fono2').value;
    let fono1 = false, fono2 = false;

    if (fon1 == "" || fon1.length < 8) {
        document.getElementById('pfono1').style = "color:Red";
        document.getElementById('pfono1').innerHTML = "Longitud no corresponde, utilice 8 digitos";
        document.getElementById('fono1').focus();
        document.getElementById('fono1').select();
    } else {
        let validFono = /^\(?(\d{4})\)?[-]?(\d{4})$/.test(fon1);
        if (!validFono) {
            document.getElementById('pfono1').style = "color:Red";
            document.getElementById('pfono1').innerHTML = "Formato no valido. Utilice solo 8 digitos";
            document.getElementById('fono1').focus();
            document.getElementById('fono1').select();
        } else {
            document.getElementById('fono1').style = "border-color:Green";
            document.getElementById('pfono1').style = "color:Green"
            document.getElementById('pfono1').innerHTML = "Numero Telefonico valido";
            document.getElementById('fono2').focus();
            fono1 = true;
        }
    }

    if (fon2 == "" || fon2.length < 8) {
        document.getElementById('pfono2').style = "color:Red";
        document.getElementById('pfono2').innerHTML = "Longitud no corresponde, utilice 8 digitos";
        document.getElementById('fono2').focus();
        document.getElementById('fono2').select();
    } else {
        let validFono = /^\(?(\d{4})\)?[-]?(\d{4})$/.test(fon1);
        if (!validFono) {
            document.getElementById('pfono2').style = "color:Red";
            document.getElementById('pfono2').innerHTML = "Formato no valido. Utilice solo 8 digitos";
            document.getElementById('fono2').focus();
            document.getElementById('fono2').select();
        } else {
            document.getElementById('fono2').style = "border-color:Green";
            document.getElementById('pfono2').style = "color:Green"
            document.getElementById('pfono2').innerHTML = "Numero Telefonico valido";
            document.getElementById('volver').focus();
            fono2 = true;
        }
    }
    if (fono1 && fono2) {
        if (fon1 != fon2) {
            // alert('no corresponden');
            document.getElementById('pfono2').style = "color:Red";
            document.getElementById('pfono2').innerHTML = "Telefonos no coinciden, favor verificar";
            document.getElementById('fono2').focus();
            document.getElementById('fono2').select();
            fono1 = false; fono2 = false;
        }
    }

}
