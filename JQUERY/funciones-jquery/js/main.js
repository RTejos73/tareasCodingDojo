$(document).ready(function () {

    $('#btn1').click(function () {
        $('#p1').addClass('p-1');
    });

    $('#btn2').click(function () {
        $('#p1').removeClass('p-1');
    });

    $('#btn3').click(function () {
        $('#p2').slideToggle(500);
    });

    $('#btn4').click(function () {
        $('#p3').hide();
    });
    $('#btn5').click(function () {
        $('#p3').show();
    });
    $('#btn6').click(function () {
        $('#p4').toggle();
    });
    $('#btn7').click(function () {
        $('#dv1').slideUp();
        // alert('ads');
    });
    $('#btn8').click(function () {
        $('#dv1').slideDown();
        // alert('ads');
    });

    $('#btn9').click(function () {
        $('#dv2').slideToggle();
        let estado = $('#btn9').html();
        console.log(estado);
        if (estado == "slideUp") {
            $('#btn9').html('slideDown');
        } else {
            $('#btn9').html('slideUp');
        }
    });

    $('#btn10').click(function () {
        $('#dv3').css('display', 'block');
        let estado = $('#btn10').html();
        if (estado == 'fadeIn') {
            $('.cl1').css('background-color', 'blue');
            $('.cl2').css('background-color', 'aqua');
            $('.cl3').css('background-color', 'coral');
            $('.cl1').fadeIn();
            $('.cl2').fadeIn('slow');
            $('.cl3').fadeIn(2500);
            $('#btn10').html('fadeOut');
        } else {
            $('.cl1').fadeOut();
            $('.cl2').fadeOut('slow');
            $('.cl3').fadeOut(2500);
            $('#btn10').html('fadeIn');
        }
    });

    $('#btn11').click(function () {
        $('#p5').before('Se agrego BEFORE ');
        $('#p5').after('se agrego AFTER ');
    });

    $('#btn12').click(function () {
        $('#p6').append(' Texto agregado con append text');
        $('#p7').append(' Texto agregado con append text');
        $('ol').append('<li>Lista Items agregada</li>');
    });
    
    $('#btn13').click(function () {
        $('#p8').text('Texto cambiado por metodo text');
        $('#p9').html('<b>Texto cambiado por metodo html</b>');
        $('#inp1').val('Valor del input modificado por metodo val');

    });

    $('#btn14').click(function () {
        $('#inp2').attr({
            'type': 'number',
            'value': '12345'
        });
        $('a').html('Gob.cl');
        $('a').attr({
            'href': 'https://www.gob.cl/coronavirus/pasoapaso#situacioncomunal/',
            'target': '_blank'
        });
    });
});