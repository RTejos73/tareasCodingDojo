$(document).ready(function () {
    var imgactual;
    var imgaleatoria1 = aleatorio();
    

    $('img').hover(function () {

        imgactual = $(this).attr('src');
        $(this).attr('src', aleatorio());
    }, function () {

        $(this).attr('src', imgactual);
    });

});

function aleatorio() {

    let alea = Math.floor(Math.random() * 8);
    // console.log(alea);
    if (alea > 0) {
        imgaleatoria = '/JQUERY/cursor_en_fuera/img/' + 'pantalon' + alea + '.png';

    };
    return imgaleatoria
}