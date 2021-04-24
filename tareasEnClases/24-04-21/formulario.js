function calcular() {
    // location.reload(false);
    const primerNum = document.getElementById('primerNUmero').value;
    const segundoNum = document.getElementById('segundoNumero').value;
    const operando = document.getElementsByName('sumaresta');

    document.getElementById('tercero').style.display = "block";

    // alert(operando);

    for (i = 0; i < operando.length; i++) {
        if (operando[i].checked) {
            if (operando[i].value == 'sumar') {
                document.getElementById('parrafo1').innerHTML = 'El resultado de ' + primerNum + ' + ' + segundoNum + ' es : ' + (
                    parseFloat(primerNum) + parseFloat(segundoNum));
            }
            if (operando[i].value == 'restar') {
                document.getElementById('parrafo1').innerHTML = 'El resultado de ' + primerNum + ' + ' + segundoNum + ' es : ' + (
                    parseFloat(primerNum) - parseFloat(segundoNum));
            }
            if (operando[i].value == 'multiplicar') {
                document.getElementById('parrafo1').innerHTML = 'El resultado de ' + primerNum + ' + ' + segundoNum + ' es : ' + (
                    parseFloat(primerNum) * parseFloat(segundoNum));
            }
            if (operando[i].value == 'dividir') {
                document.getElementById('parrafo1').innerHTML = 'El resultado de ' + primerNum + ' + ' + segundoNum + ' es : ' + (
                    parseFloat(primerNum) / parseFloat(segundoNum));
            }
        }


    }


}

function borrar() {
    document.location.reload();
    //   alert('entre a borrar');
    //   document.getElementById('primerNumero').value = 0;
    //   document.getElementById('segundoNumero').valeu = 0;
    //   document.getElementById('parrafo1').innerHTML = "El resultado de";
}